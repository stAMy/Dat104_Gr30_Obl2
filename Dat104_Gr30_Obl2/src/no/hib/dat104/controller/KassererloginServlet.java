package no.hib.dat104.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static no.hib.dat104.controller.UrlMappings.KASSERERLOGIN_URL;


@WebServlet("/" + KASSERERLOGIN_URL)
public class KassererloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String password = request.getParameter("password");
		String errorMessage = "Feil passord";
		if(!password.contains("allstar")){
			request.setAttribute("errorMessage", errorMessage);
		}else{
			request.getRequestDispatcher("WEB-INF/jsp/kassererlogin.jsp").forward(request, response);

		}
	}

}

