package innlevering_1;

public class FilmarkivMain {
	
	

	public static void main(String[] args) {
		
		
		FilmarkivADT filma = new Filmarkiv(100);
		
		//liste med filmer Dette vil bli ganske lang fordi jeg lager 99 eksemplarer med filmer
		//men for å spare meg tid så bruker jeg chatGPT til å lage de fleste med å mate den informasjon om den første.
		//ett problem er at det vil være vanskelig å sjekke om alle er logiske riktige.
		
		filma.leggTilFilm(new Film("Walt", "Tornerose", 1998, "Disney"), Sjanger.ACTION);
		filma.leggTilFilm(new Film("John", "Titanic", 1997, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film("George", "Apollo 13", 1995, "Universal"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film("Ridley", "Blade Runner", 1982, "Warner Bros"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film("Steven", "Jurassic Park", 1993, "Universal"), Sjanger.ACTION);
		filma.leggTilFilm(new Film("Christopher", "Interstellar", 2014, "Paramount"), Sjanger.SCIFI);
		
		
		
		
		
		
		
		Meny meny = new Meny(filma); 
		
		
		meny.start();

	}

}
