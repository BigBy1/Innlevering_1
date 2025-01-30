package no.hvl.data102.filmarkiv.klient;

import static javax.swing.JOptionPane.*;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;

public class Meny {

	private FilmarkivADT filma;
	 

	public Meny(FilmarkivADT filma) {

		this.filma = filma;
	}
	private Tekstgrensesnitt tekstgr=new Tekstgrensesnitt(filma);
	

	public Film lagliste() {

		return null;

	}

	public void start() {
		// oppretter meny vinduet

		boolean fortsett = true;
		while (fortsett) {
			String svar = showInputDialog("Skriv inn en av disse tinge: \n"
	+ "leggTilFilm, slettFilm, soekTittel, soekProdusent, Antall \n" + "Skriv 0 for å avslutte");
			
			if (svar.equals("leggTilFilm")) {
				//starter spørringen
				filma.leggTilFilm(tekstgr.lesFilm());
				

			}
			
			if (svar.equals("slettFilm")) {
				String slette = showInputDialog ("Hvilket nummer vil du slette");
				int sletteNr = Integer.parseInt(slette);
				
				System.out.print(filma.slettFilm(sletteNr));
				
			}
			if (svar.equals("soekTittel")) {
				String Tittel =showInputDialog ("Hvilken tittel vil du finne");
				Film liste[] = filma.soekTittel(Tittel);
				
				for(int i=0; i<liste.length;i++) {
					tekstgr.skrivUtFilm(liste[i]);
				}
				
				
			}
			
			if (svar.equals("soekProdusent")) {
				String produsent =showInputDialog ("Hvilken produsent vil du finne");
				
				tekstgr.skrivUtFilmProdusent(filma, produsent);
				
			}
			if (svar.equals("Antall")) {
				
				
				System.out.print(""+ filma.antall()+"\n");
				System.out.print(""+ filma.antall(Sjanger.ACTION)+"\n");
				System.out.print(""+ filma.antall(Sjanger.DRAMA)+"\n");
				System.out.print(""+ filma.antall(Sjanger.SCIFI)+"\n");
				System.out.print(""+ filma.antall(Sjanger.HISTORY)+"\n");
				
			}
			
			if (svar.equals("0")) {
				fortsett = false;
			}
		}
	}

}
