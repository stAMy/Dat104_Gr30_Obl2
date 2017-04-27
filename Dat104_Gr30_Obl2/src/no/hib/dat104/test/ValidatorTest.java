package no.hib.dat104.test;

import no.hib.dat104.validering.Validering;

import static org.junit.Assert.*;


import org.junit.Test;

public class ValidatorTest {
	public Validering validator = new Validering();

	@Test
	public void fornavnTest() {
		assertTrue(validator.isValidFornavn("Vegard-Navn"));
		assertTrue(validator.isValidFornavn("Per"));
		assertFalse(validator.isValidFornavn("per"));
		assertTrue(validator.isValidFornavn("Per mellom"));
		assertFalse(validator.isValidFornavn("P123"));
		assertTrue(validator.isValidFornavn("Per Mellom"));
		assertFalse(validator.isValidFornavn("P"));
		assertFalse(validator.isValidFornavn("Dettenavnetskalværealtforlangt"));
	}
	
	@Test
	public void etternavnTest(){
		assertTrue(validator.isValidEtternavn("Person"));
		assertTrue(validator.isValidEtternavn("Kalle-Person"));
		assertFalse(validator.isValidEtternavn(""));
		assertFalse(validator.isValidEtternavn("person"));
		assertFalse(validator.isValidEtternavn("K1234"));
		assertFalse(validator.isValidEtternavn("Dettenavnetskalværealtforlangt"));
	}
	
	@Test
	public void mobilTest(){
		assertTrue(validator.isValidMobil("12345678"));
		assertFalse(validator.isValidMobil("1asdfbd2"));
		assertFalse(validator.isValidMobil(""));
	}
	
}
