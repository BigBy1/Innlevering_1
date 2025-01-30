package no.hvl.data102.filmarkiv.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.data102.filmarkiv.impl.Filmarkiv;

class FilmArkivTest {

	@Test
	void test() {
		Filmarkiv tabell = new Filmarkiv(10);
		assertEquals(10, tabell.storrelse());
		
	}

}
