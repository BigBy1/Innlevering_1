package oppgave_2;

import static javax.swing.JOptionPane.showInputDialog;


public class Meny {

	FilmarkivADT filma;

	public Meny(FilmarkivADT filma) {

		this.filma = filma;
	}

	public Film lagliste() {

		return null;

	}

	public void start() {
		// oppretter meny vinduet

		boolean fortsett = true;
		while (fortsett) {
			String svar = showInputDialog("Skriv inn en av disse tinge: \n"
					+ "leggTilFilm, slettFilm, soekTittel, soekProdusent \n" + "Skriv 0 for å avslutte");

			if (svar.equals("leggTilFilm")) {
				String produser = showInputDialog("Produseren:");

				String Tittel = showInputDialog("Tittel");
				String årstallS = showInputDialog("Lanseringsår");

				int årstall = Integer.parseInt(årstallS);
				String produsenten = showInputDialog("Produsenten");

				String sjangerS = showInputDialog("Sjanger (ACTION, DRAMA, HISTORY, SCIFI");
				Sjanger sjanger = Sjanger.valueOf(sjangerS);

				filma.leggTilFilm(new Film(filma.hashCode(), produser, Tittel, årstall, produsenten), sjanger);


			}
			
			if (svar.equals("slettFilm")) {
				String slette = showInputDialog ("Hvilket nummer vil du slette");
				int sletteNr = Integer.parseInt(slette);
				
				System.out.print(filma.slettFilm(sletteNr)+"\n");
				
			}
			if (svar.equals("soekTittel")) {
				String Tittel =showInputDialog ("Hvilken tittel vil du finne");
				Film liste[] = filma.soekTittel(Tittel);
				
				
			}
			
			if (svar.equals("soekProdusent")) {
				String produsent =showInputDialog ("Hvilken produsent vil du finne");
				Film liste[] = filma.soekProdusent(produsent);
				
				
			}
			
			if (svar.equals("0")) {
				fortsett = false;
			}
		}
	}

}
