package no.hvl.data102.filmarkiv.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import no.hvl.data102.filmarkiv.klient.Meny;

class FilmArkivTest {
	private FilmarkivADT filma;

	@Test // lengden på tabbelen som blir laget
	void test() {
		Filmarkiv tabell = new Filmarkiv(10);
		assertEquals(10, tabell.storrelse());

	}
	
	//ser om det rutunerer rett...
	@Test
	void returAvFilmer() {
		
		
		FilmarkivADT filma = new Filmarkiv(1);
		filma.leggTilFilm(new Film("Walt", "Tornerose", 1998, "Disney", Sjanger.ACTION));
		filma.leggTilFilm(new Film("Musikk", "Rose", 1998, "Disney", Sjanger.ACTION));
		filma.leggTilFilm(new Film("Brage", "Mark", 1998, "Disney", Sjanger.ACTION));
		filma.leggTilFilm(new Film("Lillian", "Sol", 1998, "Disney", Sjanger.ACTION));
		

		//tittel
		assertEquals("Tornerose", filma.finnFilm(1).getTittel());
		assertEquals("Rose", filma.finnFilm(2).getTittel());
		assertEquals("Mark", filma.finnFilm(3).getTittel());
		assertEquals("Sol", filma.finnFilm(4).getTittel());
		
		
		//Produser:
		assertEquals("Walt", filma.finnFilm(1).getFilmskaper());
		assertEquals("Musikk", filma.finnFilm(2).getFilmskaper());
		assertEquals("Brage", filma.finnFilm(3).getFilmskaper());
		assertEquals("Lillian", filma.finnFilm(4).getFilmskaper());
	}

}
