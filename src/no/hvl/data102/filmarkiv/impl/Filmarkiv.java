package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

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
		System.out.print(filmMiddlertidig[0].getTittel());
		
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

	@Override
	public void leggTilFilm1(Film nyFilm) {
		// TODO Auto-generated method stub
		
	}

}
