package servlets;

import helpers.IUrlAnalyzer;
import helpers.RestLikeUrlAnalyzer;
import helpers.UrlAnalyzer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.UrlBuilder;
import model.IShoppingSite;
import model.ISubscriber;
import dao.DatabaseManager;
import validators.IParametersValidator;
import validators.ParametersValidator;

/**
 * Servlet implementation class redirectServlet
 */
public class redirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IParametersValidator validator = new ParametersValidator();
       //TODO add log4j logging
    /**
     * @see HttpServlet#HttpServlet()
     */
    public redirectServlet() {
        super();
        DatabaseManager.loadData();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request,response);
	}

	private void handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		
		
		String fullPath = request.getPathInfo();
		String qString = request.getQueryString();//uu= destination url , kk = subscriber key
		if(qString != null && qString!=""){
			fullPath = fullPath + "?" + qString;
		}
		System.out.println("IN: fullPath="+fullPath);
		
		//validate parameters
		if(validator.validateParameters(fullPath)){
			
			IUrlAnalyzer urlAnalayzer = new RestLikeUrlAnalyzer(fullPath);
			
			//get monlinks user data
			//String subcriberKey = request.getParameter("kk");
			String subcriberKey = urlAnalayzer.getSubcriberKey();
			System.out.println("subcriberKey="+subcriberKey);
			ISubscriber subscriber = DatabaseManager.findSubscriberObject(subcriberKey);
						
			//get shopping site data
			//String destinationUrl = request.getParameter("uu");
			String destinationUrl = urlAnalayzer.getDestinationUrl();
			System.out.println("destinationUrl="+destinationUrl);
			IShoppingSite  shoppingSite = DatabaseManager.findShoppingSiteObject(destinationUrl);
			//TODO in case of no shopping site try to use viglinks API or other APIs

			//build the redirect url
			String redirectUrl = UrlBuilder.buildRedirectUrl(destinationUrl,subscriber,shoppingSite);
			System.out.println("OUT: redirectUrl="+redirectUrl);
			try {
				
				response.sendRedirect(redirectUrl);
				return;
			} catch (IOException e) {
				// TODO need to handle this error
				e.printStackTrace();
			}
			
		}else{
			System.out.println("The call is not valid");

		}

	}

//EXAMPLES:
//http://monlinks.com/r?kk=hufsha001&uu=http://il.nextdirect.com/en/g67144s8
//http://localhost:8080/monlinks/r?kk=hufsha001&uu=http://il.nextdirect.com/en/g67144s8
//http://ec2-54-173-113-48.compute-1.amazonaws.com:8080/monlinks/r?kk=hufsha001&uu=http://aliexpress.com
//http://ec2-54-173-113-48.compute-1.amazonaws.com:8080/monlinks/r?kk=hufsha001&uu=http://il.nextdirect.com/en/g672s1
	
//AiExpress
//http://www.aliexpress.com/item/0-12M-Animal-Cartoon-Thick-Winter-Baby-Rompers-Newborn-Baby-Clothing-Baby-Boy-Girl-Clothes-Jumpsuit/32222601535.html?s=p
	
	
//http://localhost:8080/monlinks/r/hufsha001/ci/up/14102014/ct/@u=http:/il.nextdirect.com/en/g67144s8
}
