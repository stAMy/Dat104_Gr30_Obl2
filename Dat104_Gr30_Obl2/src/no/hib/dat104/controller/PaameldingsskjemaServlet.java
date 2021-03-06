package no.hib.dat104.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static no.hib.dat104.controller.UrlMappings.PAAMELDINGSSKJEMA_URL;
import static no.hib.dat104.controller.UrlMappings.PAAMELDING_BEKREFTELSE_URL;
import no.hib.dat104.dataaccess.DeltagerEAO;
import no.hib.dat104.model.Deltager;


@WebServlet("/" + PAAMELDINGSSKJEMA_URL)
public class PaameldingsskjemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private DeltagerEAO deltagerEAO;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/jsp/paameldingsskjema.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		Deltager deltager = new Deltager();
		deltager.populer(request);
		
		if(!deltager.erAllInputGyldig()){
			session.setAttribute("deltager", deltager);
			response.sendRedirect(PAAMELDINGSSKJEMA_URL);
		}else{
			session.setAttribute("deltager", deltager);
		

			deltagerEAO.leggTilDeltager(deltager);

			//deltagerEAO.leggTilDeltager(deltager);

			response.sendRedirect(PAAMELDING_BEKREFTELSE_URL);
		}
		
	}

}
