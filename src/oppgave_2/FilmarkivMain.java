package oppgave_2;


public class FilmarkivMain {

	public static void main(String[] args) {
		
		Filmarkiv filma = new Filmarkiv();
		
		
		
		//liste med filmer Dette vil bli ganske lang fordi jeg lager 99 eksemplarer med filmer
		//men for å spare meg tid så bruker jeg chatGPT til å lage de fleste med å mate den informasjon som den første.
		//ett problem er at det vil være vanskelig å sjekke om alle er logiske riktige.
		
		filma.leggTilFilm(new Film( "Walt", "Tornerose", 1998, "Disney"), Sjanger.ACTION);
		filma.leggTilFilm(new Film( "John", "Titanic", 1997, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film( "George", "Apollo 13", 1995, "Universal"), Sjanger.HISTORY);
		
		
		
		
		
		
		
		
		Meny meny = new Meny(filma); 
		
		
		meny.start();

	}

}
