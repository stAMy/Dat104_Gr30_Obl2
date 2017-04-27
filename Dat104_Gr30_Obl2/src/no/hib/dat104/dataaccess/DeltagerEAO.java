package no.hib.dat104.dataaccess;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import no.hib.dat104.model.Deltager;

@Stateless
public class DeltagerEAO {

		@PersistenceContext(name = "deltagerPersistenceUnit")
		private EntityManager em;
		
		
		public void leggTilDeltager(Deltager d){
			em.persist(d);
			System.out.println("Deltager " + d.getFornavn() + " er lagt til");
		}
		

		public Deltager finnDeltager(String mobil){
			return em.find(Deltager.class, mobil);
			
		}
		
		public List<Deltager> finnAlleDeltagere(){
			
			TypedQuery<Deltager> query = em.createQuery("SELECT  d FROM Deltager d order by d.fornavn, d.etternavn asc", Deltager.class);
			return query.getResultList();
			
		}
		
		
		
		public void registrerBetaling(String mobil){
			Deltager d = em.find(Deltager.class, mobil);
			d.isBetalt(true);
			em.merge(d);
			System.out.println("betaling registrert for deltager " + d.getFornavn());
		}
		
		public void slettDeltager(String mobil){
			em.remove(em.find(Deltager.class, mobil));
		}
		
		public boolean finnesMobilFraFor(String mobil){
			boolean finnes = false;
			List<Deltager> alle = finnAlleDeltagere();
			for(Deltager d : alle){
				if(d.getMobil() == mobil){
					finnes = true;
				}
			}
			return finnes;
		}
}
