package no.hib.dat104.validering;
import javax.ejb.EJB;

import no.hib.dat104.dataaccess.DeltagerEAO;
public class Validering {
	
	@EJB
	DeltagerEAO DEAO;
	
	//Fornavn skal være 2-20 tegn og kan inneholde bokstaver (inkl. æøåÆØÅ),
	//bindestrek og mellomrom. Første tegn skal være en stor bokstav.
	public static boolean isValidFornavn(String fornavn){
		if(fornavn == null){
			return false;
		}
		return fornavn.matches("^[A-Z]{1}[a-zA-Z\\-\\s]{2,20}$");
	}
	
	// Etternavn skal være 2-20 tegn og kan inneholde bokstaver (inkl. æøåÆØÅ) og
	//bindestrek (IKKE mellomrom). Første tegn skal være en stor bokstav.
	public static boolean isValidEtternavn(String etternavn){
		if(etternavn == null){
			return false;
		}
		return etternavn.matches("^[A-ZÆØÅ]{1}[a-zæøåA-ZÆØÅ\\-]{2,20}$");
	}
	
	//Mobil skal være eksakt 8 siffer, ingenting annet
	public static boolean isValidMobil(String mobil){
		if(mobil == null){
			return false;
		}
		return mobil.matches("\\d{8}");
	}
	
	public static boolean mobilFinnesFraFør(String mobil){
		
		return true;
	}

	public static boolean isKjonnValgt(String kjonn) {
		return kjonn != null;
	}
	
	
}