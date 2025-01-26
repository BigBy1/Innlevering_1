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

		return Tabell[nr];
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
			Tabell[antall] = nyFilm;
		} else {
			Tabell[antall] = nyFilm;
		}

		antall++;

	}

	@Override
	public boolean slettFilm(int filmnr) {

		for (int i = 0; i < antall; i++) {
			if (Tabell[i].getNr() == filmnr) {

				Tabell[i] = Tabell[antall];
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
			}
		}
		return filmMiddlertidig;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] filmMiddlertidig = new Film[antall];

		for (int i = 0; i < antall; i++) {
			if (Tabell[i].getTittel().equals(delstreng)) {
				filmMiddlertidig[i] = Tabell[i];
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

		return antall++;
	}

	public int storrelse() {
		return storrelse;
	}

}
