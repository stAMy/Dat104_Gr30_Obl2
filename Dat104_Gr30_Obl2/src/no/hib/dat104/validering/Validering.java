package no.hib.dat104.validering;
import javax.ejb.EJB;

import no.hib.dat104.dataaccess.DeltagerEAO;
public class Validering {
	
	@EJB
	DeltagerEAO DEAO;
	
	//Fornavn skal v�re 2-20 tegn og kan inneholde bokstaver (inkl. ������),
	//bindestrek og mellomrom. F�rste tegn skal v�re en stor bokstav.
	public static boolean isValidFornavn(String fornavn){
		if(fornavn == null){
			return false;
		}
		return fornavn.matches("^[A-Z]{1}[a-zA-Z\\-\\s]{2,20}$");
	}
	
	// Etternavn skal v�re 2-20 tegn og kan inneholde bokstaver (inkl. ������) og
	//bindestrek (IKKE mellomrom). F�rste tegn skal v�re en stor bokstav.
	public static boolean isValidEtternavn(String etternavn){
		if(etternavn == null){
			return false;
		}
		return etternavn.matches("^[A-Z���]{1}[a-z���A-Z���\\-]{2,20}$");
	}
	
	//Mobil skal v�re eksakt 8 siffer, ingenting annet
	public static boolean isValidMobil(String mobil){
		if(mobil == null){
			return false;
		}
		return mobil.matches("\\d{8}");
	}
	
	public static boolean mobilFinnesFraF�r(String mobil){
		
		return true;
	}

	public static boolean isKjonnValgt(String kjonn) {
		return kjonn != null;
	}
	
	
}