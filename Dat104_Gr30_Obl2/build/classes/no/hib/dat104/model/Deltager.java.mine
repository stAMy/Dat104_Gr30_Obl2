package no.hib.dat104.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;

import no.hib.dat104.validering.Validering;

@Entity
@Table(schema = "public", name = "deltager")
public class Deltager {
	
	 private static final String MANN = "&#9794;";
	 private static final String KVINNE = "&#9792;";
	
	 @Id
	 private String mobil;
	 private String fornavn;
	 private String etternavn;
	 private String kjonn;
	 private boolean betalingsstatus;
	 private List<Deltager> deltagere;
	 private String fornavnFeilmelding;
	 private String etternavnFeilmelding;
	 private String mobilFeilmelding;
	 private String kjonnFeilmelding;
	 
	
	public Deltager(String mobil, String fornavn, String etternavn, String kjonn, boolean betalingsstatus){
		this.mobil = mobil;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.kjonn = kjonn;
		this.betalingsstatus = betalingsstatus;
	}
	
	public Deltager(){
		
	}
	
	 
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

	public String getKjonnFeilmelding() {
		return kjonnFeilmelding;
	}

	public void setKjonnFeilmelding(String kjonnFeilmelding) {
		this.kjonnFeilmelding = kjonnFeilmelding;
	}

	 
	public String getMobil(){
		return mobil;
	}
	public void setMobil(String mobil){
		this.mobil = mobil;
	}
	
	public String getFornavn(){
		return fornavn;
	}
	
	public void setFornavn(String fornavn){
		this.fornavn = fornavn;
	}
	
	public String getEtternavn(){
		return etternavn;
	}
	
	public void setEtternavn(String etternavn){
		this.etternavn = etternavn;
	}
	
	public String getKjonn(){
		return kjonn;
	}
	
	public void setKjonn(String kjonn){
		this.kjonn = kjonn;
	}
	
	public String getKjonnSymbol(){
		return (getKjonn().equals("m") ? MANN : KVINNE);
		}
	
	public boolean getBetalingsstatus(){
		return betalingsstatus;
	}
	
	public void isBetalt(boolean betalingsstatus){
		this.betalingsstatus = betalingsstatus;
	}
	
	public List<Deltager> getDeltagere(){
		return deltagere;
	}
	
	public boolean erAllInputGyldig(){
		boolean allInputGyldig = true;
		if(!Validering.isValidFornavn(fornavn)){
			fornavn = "";
			fornavnFeilmelding = "Fornavn kan ikke være tomt, være mellom 2-20 tegn og første tegn må være stor bokstav ";
			allInputGyldig = false;
		}
		if(!Validering.isValidEtternavn(etternavn)){
			etternavn = "";
			etternavnFeilmelding = "Etternavn kan ikke være tomt, være mellom 2-20 tegn og første tegn må være stor bokstav";
			allInputGyldig = false;
		}
		if(!Validering.isValidMobil(mobil)){
			mobil ="";
			mobilFeilmelding = "mobil må være 8 siffer";
			allInputGyldig = false;
		}
		if(!Validering.mobilFinnesFraFør(mobil)){
			mobil ="";
			mobilFeilmelding = "mobilnr finnes fra før";
			allInputGyldig = false;
		}
		if(!Validering.isKjonnValgt(kjonn)){
			allInputGyldig = false;
		}
		return allInputGyldig;
	}

	public void populer(HttpServletRequest request) {
		fornavn = request.getParameter("fornavn");
		etternavn = request.getParameter("etternavn");
		mobil = request.getParameter("mobil");
		kjonn = request.getParameter("kjonn");
	}
}

