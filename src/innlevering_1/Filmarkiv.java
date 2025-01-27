package innlevering_1;

public class Filmarkiv implements FilmarkivADT {

	private int antall;
	private int antallSjanger = 4;

	private int storrelse;

	public Film[] Tabell;

	public Filmarkiv(int storrelse) {
		this.antall = 0;
		this.storrelse = storrelse;

		this.Tabell = new Film[storrelse];
	}

	@Override
	public Film finnFilm(int nr) {

		for (int i = 0; i < antall; i++) {
			if (Tabell[i].getNr() == nr) {
				return Tabell[i];
			}
		}

		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm, Sjanger sjanger) {

		// tabellen med filmer.
		if (antall == storrelse) {
			Film[] TabellHolder = Tabell;

			this.storrelse = storrelse * 2;
			Tabell = new Film[storrelse];
			for (int i = 0; i < TabellHolder.length; i++) {
				Tabell[i] = TabellHolder[i];
			}

		}

		Tabell[antall] = nyFilm;
		antall++;

	}

	@Override
	public boolean slettFilm(int filmnr) {

		for (int i = 0; i < antall; i++) {
			if (Tabell[i].getNr() == filmnr) {

				Tabell[i] = Tabell[antall - 1];
				antall--;
				return true;
			}
		}

		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		Film[] filmMiddlertidig = new Film[antall];

		for (int i = 0; i < antall; i++) {
			if (Tabell[i].getTittel().equals(delstreng)) {
				filmMiddlertidig[i] = Tabell[i];

				int plass = i + 1;
				System.out.print("Tittelen: " + filmMiddlertidig[i].getTittel() + "\n" + "Nr: "
						+ filmMiddlertidig[i].getNr() + "\n" + "Plass: " + plass + "\n");

			}
		}

		return filmMiddlertidig;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] filmMiddlertidig = new Film[antall];

		for (int i = 0; i < antall; i++) {
			if (Tabell[i].getFilmskaper().equals(delstreng)) {
				filmMiddlertidig[i] = Tabell[i];

				int plass = i + 1;
				System.out.print("Tittelen: " + filmMiddlertidig[i].getTittel() + "\n" + "Nr: "+
						"Produsent: "+ filmMiddlertidig[i].getfilmselskapet()
						+ filmMiddlertidig[i].getNr() + "\n" + "Plass: " + plass + "\n");
			}
		}
		return filmMiddlertidig;
	}

	@Override
	public int antall(Sjanger sjanger) {

		return antallSjanger;
	}

	@Override
	public int antall() {

		return antall;
	}

	public int storrelse() {
		return storrelse;
	}

	// trimme tabellen

	private Film[] trimTab(Film[] tab, int n) {
		// n er antall elementer
		Film[] nytab = new Film[n];
		int i = 0;
		while (i < n) {
			nytab[i] = tab[i];
			i++;
		}
		return nytab;
	}

}
