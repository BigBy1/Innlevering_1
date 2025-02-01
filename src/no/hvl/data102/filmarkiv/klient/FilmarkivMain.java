package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;

public class FilmarkivMain {
	
	

	public static void main(String[] args) {
		
		
		FilmarkivADT filma = new Filmarkiv(100);
		
		//liste med filmer Dette vil bli ganske lang fordi jeg lager 99 eksemplarer med filmer
		//men for å spare meg tid så bruker jeg chatGPT til å lage de fleste med å mate den informasjon om den første.
		//ett problem er at det vil være vanskelig å sjekke om alle er logiske riktige.
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

}
