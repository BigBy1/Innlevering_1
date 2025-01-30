package no.hvl.data102.filmarkiv.klient;

import static javax.swing.JOptionPane.showInputDialog;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;

public class Tekstgrensesnitt { 
	
	
	private FilmarkivADT filma;
	
	// Konstruktør for å initialisere filma
    public Tekstgrensesnitt(FilmarkivADT filma) {
        this.filma = filma;
    }
	
 // Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt 
	public Film lesFilm(){ 
		
		
	 String produser = showInputDialog("Produseren:");

		String Tittel = showInputDialog("Tittel");
		String årstallS = showInputDialog("Lanseringsår");

		int årstall = Integer.parseInt(årstallS);
		String produsenten = showInputDialog("Produsenten");

		String sjangerS = showInputDialog("Sjanger (ACTION, DRAMA, HISTORY, SCIFI");
		Sjanger sjanger = Sjanger.valueOf(sjangerS);
		
		
		Film nyfilm = new Film(produser, Tittel, årstall, produsenten, sjanger);
		
		
		return nyfilm;
		
 } 
 
// Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger) 
 public void skrivUtFilm(Film film) { 
	 
		try {
		System.out.print("Tittelen: " + film.getTittel() + "\n" + "Nr: "
				+ film.getNr() + "\n" + "Produseren: "+ 
				film.getFilmskaper()+ "\nProdusenten"+ film.getfilmselskapet() +
				"\nUtgitt: "+ film.getLanserinår() +"\n"+
				 "sjanger: "+ film.getSjanger() +"\n");

		}
		catch (NullPointerException e) {
			
		}
 } 
 
 // Skriver ut alle filmer med en spesiell delstreng i tittelen 
 public void skrivUtFilmDelstrengITittel(Film film) { 
	 
	 skrivUtFilm(film);
 } 
 
 // Skriver ut alle Filmer av en produsent (produsent er delstreng) 
 public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) { 
  // TODO 
 } 
 
 // Skriver ut en enkel statistikk som inneholder antall filmer totalt 
 // og hvor mange det er i hver sjanger. 
 public void skrivUtStatistikk(FilmarkivADT arkiv) { 
  // TODO 
 } 
 
 // osv ... andre metoder 
} 