package no.hib.dat104.controller;

import static no.hib.dat104.controller.UrlMappings.DELTAGERLISTE_URL;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hib.dat104.dataaccess.DeltagerEAO;
import no.hib.dat104.model.Deltager;


@WebServlet("/" + DELTAGERLISTE_URL)
public class DeltagerlisteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private DeltagerEAO deltagerEAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/jsp/deltagerliste.jsp").forward(request, response);
		
		
		DeltagerEAO deltagere = new DeltagerEAO();
		List<Deltager> alleDeltagere = deltagerEAO.finnAlleDeltagere();
		//deltagere.finnAlleDeltagere(); //alternativt gå gjennom den for å hente én og én? Må sendes til jsp for visning
		
		PrintWriter out = response.getWriter();
		for(Deltager d: alleDeltagere){
			out.println(d.getFornavn() + " " + d.getEtternavn());
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
