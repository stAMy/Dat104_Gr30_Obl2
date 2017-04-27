package no.hib.dat104.validering;

import no.hib.dat104.model.Deltager;
import no.hib.dat104.dataaccess.DeltagerEAO;

public class Inputvalidering {
	

	 private String fornavnFeilmelding;
	 private String etternavnFeilmelding;
	 private String mobilFeilmelding;
	 private String kjonnFeilmelding;
	 private String mobilFeilmelding2;
	 
	 
	 
	 public String getFornavnFeilmelding() {
		return fornavnFeilmelding;
	}

	public void setFornavnFeilmelding(String fornavnFeilmelding) {
		this.fornavnFeilmelding = fornavnFeilmelding;
	}

	public String getEtternavnFeilmelding() {
		return etternavnFeilmelding;
	}

	public void setEtternavnFeilmelding(String etternavnFeilmelding) {
		this.etternavnFeilmelding = etternavnFeilmelding;
	}

	public String getMobilFeilmelding() {
		return mobilFeilmelding;
	}

	public void setMobilFeilmelding(String mobilFeilmelding) {
		this.mobilFeilmelding = mobilFeilmelding;
	}
	public String getMobilFeilmelding2() {
		return mobilFeilmelding2;
	}

	public void setMobilFeilmelding2(String mobilFeilmelding2) {
		this.mobilFeilmelding2 = mobilFeilmelding2;
	}

	public String getKjonnFeilmelding() {
		return kjonnFeilmelding;
	}

	public void setKjonnFeilmelding(String kjonnFeilmelding) {
		this.kjonnFeilmelding = kjonnFeilmelding;
	}
	
	public boolean erAllInputGyldig(Deltager d){
		boolean allInputGyldig = true;
		if(!Validering.isValidFornavn(d.getFornavn())){
			d.setFornavn("");
			fornavnFeilmelding = "Fornavn kan ikke være tomt, være mellom 2-20 tegn og første tegn må være stor bokstav ";
			allInputGyldig = false;
		}
		if(!Validering.isValidEtternavn(d.getEtternavn())){
			d.setEtternavn("");
			etternavnFeilmelding = "Etternavn kan ikke være tomt, være mellom 2-20 tegn og første tegn må være stor bokstav";
			allInputGyldig = false;
		}
		if(!Validering.isValidMobil(d.getMobil())){
			d.setMobil("");
			mobilFeilmelding = "mobil må være 8 siffer";
			allInputGyldig = false;
		}
		if(!Validering.mobilFinnesFraFør(d.getMobil())){
			d.setMobil("");
			mobilFeilmelding = "mobilnr finnes fra før";
			allInputGyldig = false;
		}
		if(!Validering.isKjonnValgt(d.getKjonn())){
			allInputGyldig = false;
		}
		return allInputGyldig;
	}
	
	public boolean erMobilloginRiktig(String mobil){
		DeltagerEAO deao = new DeltagerEAO();
		boolean altOk = true;
		
		if(!Validering.isValidMobil(mobil)){
			mobilFeilmelding2 ="Ugyldig mobil nr, må være 8 siffer";
			altOk = false;
		}else if(!deao.finnesMobilFraFor(mobil)){
			mobilFeilmelding2 = "ingen registrert med mobil nr" + mobil;
			altOk = false;
		}
		
		return altOk;
	}
	
}


