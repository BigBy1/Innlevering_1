package no.hvl.data102.filmarkivOppgave2.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import no.hvl.data102.filmarkivOppgave2.klient.LinearNode;

public class Filmarkiv implements FilmarkivADT {

	//sjanger:
	private int action= 0;
	private int historie = 0;
	private int siFi = 0;
	private int drama = 0;

	private int storrelse;

	// kode for node

	private int antall;
	private LinearNode<Film> start;
	private LinearNode<Film> forste;

	// Tom konstruktør

	public Filmarkiv() {

		start = new LinearNode<>();
		start.setNeste(forste);

	}

	public Filmarkiv(Film nyFilm, LinearNode<Film> neste) {

		LinearNode<Film> nyNode = new LinearNode<>(nyFilm);

		nyNode.setNeste(start);

		start = nyNode;

		antall++;
		
		
		
	}

	@Override
	public Film finnFilm(int nr) {
		LinearNode<Film> current = start;

		while (current != null) {
			if (current.getData().getNr() == nr) {
				return current.getData();
			}

			current = current.getNeste();
		}

		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {

		if (forste == null) {
			forste = new LinearNode<>(nyFilm);
		} else {
			LinearNode<Film> holder = forste;

			while (holder.getNeste() != null) {
				holder = holder.getNeste();
			}

			holder.setNeste(new LinearNode<>(nyFilm));

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
		

		antall++;

	}

	@Override
	public boolean slettFilm(int filmnr) {
		LinearNode<Film> current = forste;
		LinearNode<Film> holder = current;
		// slette den eventuelle første
		if (current.getData().getNr() == filmnr) {
			forste = current.getNeste();
			antall--;
			return true;
		}

		current = current.getNeste();

		while (current != null) {

			if (current.getData().getNr() == filmnr) {
				holder.setNeste(current.getNeste());
				antall--;
				return true;
			}
			holder = current;
			current = current.getNeste();
		}

		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		Film[] filmMiddlertidig = new Film[antall];
		LinearNode<Film> current = forste;
		int plassTabbel = 0;

		while (current.getNeste() != null) {

			if (current.getData().getTittel().contains(delstreng)) {
				filmMiddlertidig[plassTabbel] = current.getData();
				plassTabbel++;
			}
			current = current.getNeste();

			// sjekker den siste også.
			if (current.getData().getTittel().contains(delstreng)) {
				filmMiddlertidig[plassTabbel] = current.getData();
			}

		}
		return trimTab(filmMiddlertidig, plassTabbel);
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] filmMiddlertidig = new Film[antall];
		LinearNode<Film> current = forste;
		int plassTabbel = 0;

		while (current.getNeste() != null) {

			if (current.getData().getfilmselskapet().contains(delstreng)) {
				filmMiddlertidig[plassTabbel] = current.getData();
				plassTabbel++;
			}
			current = current.getNeste();

			// sjekker den siste også.
			if (current.getData().getfilmselskapet().contains(delstreng)) {
				filmMiddlertidig[plassTabbel] = current.getData();
			}

		}
		return trimTab(filmMiddlertidig, plassTabbel);
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
		return 0;
	}

	@Override
	public int antall() {

		return antall;
	}

	public int storrelse() {
		return storrelse;
	}

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