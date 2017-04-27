package no.hib.dat104.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hib.dat104.dataaccess.DeltagerEAO;
import no.hib.dat104.model.Deltager;

import static no.hib.dat104.controller.UrlMappings.MOBIL_LOGIN_URL;


@WebServlet("/" +  MOBIL_LOGIN_URL)
public class MobilloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mobil = request.getParameter("mobil");
		String errorMessage = "Må tilhøre registrert deltager";
		Deltager d = new Deltager();
		List<Deltager> deltagere = d.getDeltagere();
		
		for(Deltager tlf : deltagere){
			if(mobil.equals(d.getMobil())){
				request.setAttribute("mobil", mobil);
			}else{
				request.setAttribute("errorMessage", errorMessage);
			}
		}
		
		
		
		request.getRequestDispatcher("WEB-INF/jsp/mobillogin.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
