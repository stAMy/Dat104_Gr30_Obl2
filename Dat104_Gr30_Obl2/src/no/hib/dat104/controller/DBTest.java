package no.hib.dat104.controller;

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


@WebServlet("/DBTest")
public class DBTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB   
	DeltagerEAO DeltagerEAO;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Deltager d5 = new Deltager("22223344", "Bert", "Navnesen", "male", false);

		
		DeltagerEAO.leggTilDeltager(d5);
		List<Deltager> deltagere = DeltagerEAO.finnAlleDeltagere();
		PrintWriter out = response.getWriter();
		for(Deltager d : deltagere){
			out.println(d.getFornavn());
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
