package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

	
	private int antall;

	private int storrelse;
	
	//sjanger:
		private int action= 0;
		private int historie = 0;
		private int siFi = 0;
		private int drama = 0;

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
	public void leggTilFilm(Film nyFilm) {

		// tabellen med filmer.
		if (antall == storrelse) {
			Film[] TabellHolder = Tabell;

			this.storrelse = storrelse * 2;
			Tabell = new Film[storrelse];
			for (int i = 0; i < TabellHolder.length; i++) {
				Tabell[i] = TabellHolder[i];
			}

		}
		Sjanger sjanger = nyFilm.getSjanger();
		
		switch(sjanger) {
		case ACTION:
			action++;
			break;
			
		case DRAMA:
			drama++;
			break;

		case SCIFI:
			siFi++;
			break;
		
		case HISTORY:
			historie++;
			break;
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
		int antallMid = 0;

		for (int i = 0; i < antall; i++) {
			if (Tabell[i].getTittel().contains(delstreng)) {
				filmMiddlertidig[antallMid] = Tabell[i];
				antallMid++;
			}
		}
		
		return trimTab(filmMiddlertidig, antallMid);
	}
	
	

	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] filmMiddlertidig = new Film[antall];
		int antallMid = 0;

		for (int i = 0; i < antall; i++) {
			if (Tabell[i].getfilmselskapet().contains(delstreng)) {
				filmMiddlertidig[antallMid] = Tabell[i];
				antallMid++;
				}
		
		}
		return trimTab(filmMiddlertidig, antallMid);
	}

	@Override
	public int antall(Sjanger sjanger) {
		switch(sjanger) {
		case ACTION:
			return action;
			
		case DRAMA:
			return drama;

		case SCIFI:
			return siFi;
		
		case HISTORY:
			return historie;
		}
		return (Integer) null;
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
