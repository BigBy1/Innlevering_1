package no.hvl.data102.filmarkiv.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import no.hvl.data102.filmarkiv.klient.Meny;

class FilmArkivTest {

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
	
	//test om meny funker:
	//NB NB på måten programmet funker så må man skrive inn 0 for å avslutte
	@Test
	void meny() {
		
		FilmarkivADT filma = new Filmarkiv(1);
		
		filma.leggTilFilm(new Film("Walt", "Tornerose", 1998, "Disney", Sjanger.ACTION));
		filma.leggTilFilm(new Film("John", "Titanic", 1997, "Paramount", Sjanger.DRAMA));
		filma.leggTilFilm(new Film("George", "Apollo 13", 1995, "Universal", Sjanger.HISTORY));
		filma.leggTilFilm(new Film("Ridley", "Blade Runner", 1982, "Warner Bros", Sjanger.SCIFI));
		filma.leggTilFilm(new Film("Steven", "Jurassic Park", 1993, "Universal", Sjanger.ACTION));
		filma.leggTilFilm(new Film("Christopher", "Interstellar", 2014, "Paramount", Sjanger.SCIFI));
		filma.leggTilFilm(new Film("James", "Avatar", 2009, "20th Century Fox", Sjanger.SCIFI));
		filma.leggTilFilm(new Film("Peter", "Ringenes Herre", 2001, "New Line Cinema", Sjanger.ACTION));
		filma.leggTilFilm(new Film("Stanley", "2001: En romodyssé", 1968, "MGM", Sjanger.SCIFI));
		filma.leggTilFilm(new Film("Quentin", "Pulp Fiction", 1994, "Miramax", Sjanger.DRAMA));
		filma.leggTilFilm(new Film("Steven", "Schindlers liste", 1993, "Universal", Sjanger.DRAMA));
		filma.leggTilFilm(new Film("Mel", "Braveheart", 1995, "Paramount", Sjanger.HISTORY));
		filma.leggTilFilm(new Film("Robert", "Iron Man", 2008, "Marvel", Sjanger.ACTION));
		filma.leggTilFilm(new Film("Francis", "Gudfaren", 1972, "Paramount", Sjanger.DRAMA));
		filma.leggTilFilm(new Film("James", "Titanic II", 2010, "Asylum", Sjanger.DRAMA));
		filma.leggTilFilm(new Film("Roland", "Independence Day", 1996, "20th Century Fox", Sjanger.ACTION));
		filma.leggTilFilm(new Film("Wolfgang", "Den siste keiseren", 1987, "Columbia", Sjanger.HISTORY));
		
		
		Meny meny = new Meny(filma); 
		
		
		meny.start();
	}
	//test om opprettelse av noder funker
		@Test
		void node() {
			oppgave_2.Filmarkiv filma = new oppgave_2.Filmarkiv();
			filma.leggTilFilm(new Film("Walt", "Tornerose", 1998, "Disney", Sjanger.ACTION));
			filma.leggTilFilm(new Film("Musikk", "Nils", 1998, "Disney", Sjanger.ACTION));
			filma.leggTilFilm(new Film("Brage", "Mark", 1998, "Disney", Sjanger.ACTION));
			filma.leggTilFilm(new Film("Lillian", "Sol", 1998, "Disney", Sjanger.ACTION));
			

			//tittel
			String tittel1=  filma.soekTittel("Tornerose")[0].getTittel();
			String tittel2=  filma.soekTittel("Nils")[0].getTittel();
			
			assertEquals("Tornerose", tittel1);
			assertEquals("Nils", tittel2);
			
		}
}










