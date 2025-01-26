package innlevering_1;

import static javax.swing.JOptionPane.*;

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
				int nummer = filma.antall() + 1;
				String produser = showInputDialog("Filmen vil få nummer: " + nummer + 1 + "\n" + "Produseren:");

				String Tittel = showInputDialog("Tittel");
				String årstallS = showInputDialog("Lanseringsår");

				int årstall = Integer.parseInt(årstallS);
				String produsenten = showInputDialog("Produsenten");

				String sjangerS = showInputDialog("Sjanger (ACTION, DRAMA, HISTORY, SCIFI");
				Sjanger sjanger = Sjanger.valueOf(sjangerS);

				filma.leggTilFilm(new Film(nummer, produser, Tittel, årstall, produsenten), sjanger);

				System.out.print(filma.finnFilm(filma.antall()).getTittel());

			}
			
			if (svar.equals("slettFilm")) {
				String slette = showInputDialog ("Hvilket nummer vil du slette");
				int sletteNr = Integer.parseInt(slette);
				
				System.out.print(filma.slettFilm(sletteNr));
				filma.slettFilm(sletteNr);
				
			}
			
			if (svar.equals("0")) {
				fortsett = false;
			}
		}
	}

}
