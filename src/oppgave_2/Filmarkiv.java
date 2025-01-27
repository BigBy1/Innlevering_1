package oppgave_2;


public class Filmarkiv implements FilmarkivADT {

	private int antallSjanger = 4;

	private int storrelse;
	
	//kode for node
	
	private int antall;
	private LinearNode<Film> start;
	

	//Tom konstruktør
	
	public Filmarkiv() {
		
		start = null;
		
	}
	
	
	public Filmarkiv(Film nyFilm) {
		
		LinearNode<Film> nyNode = new LinearNode<>(nyFilm);
		
		nyNode.setNeste(start);
		
		start = nyNode;
		
		antall++;
		
		
	}

	@Override
	public Film finnFilm(int nr) {
		LinearNode<Film> current = start;
		
		while (current!=null) {
			if(current.getData().getNr()==nr) {
				return current.getData();
			}
			
			current = current.getNeste();
		}
		

		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm, Sjanger sjanger) {


		LinearNode<Film> nyNode = new LinearNode<>(nyFilm);
		
		nyNode.setNeste(start);
		
		start = nyNode;
		
		antall++;

	}

	
	@Override
	public boolean slettFilm(int filmnr) {
		LinearNode<Film> current = start;
		LinearNode<Film> holder = current;
		//slette den eventuelle første
		if (current.getData().getNr() == filmnr) {
				start = current.getNeste();
				antall--;
				return true;
			}
		
		
		
		while (current!=null) {
			
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
		LinearNode<Film> current = start;
		int plassTabbel = 0;
		int plass = 0;
		
		while (current!=null) {
			
			plass++;
			
			if (current.getData().getTittel().equals(delstreng)) {
				filmMiddlertidig[plassTabbel]=current.getData();
				plassTabbel++;
				
				System.out.print("Tittelen: " + current.getData().getTittel() + "\n" + "Nr: "
						+ current.getData().getNr() + "\n" + "Plass: " + plass + "\n");
			}
			current = current.getNeste();
		}
			

		return filmMiddlertidig;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] filmMiddlertidig = new Film[antall];
		LinearNode<Film> current = start;
		int plass = 1;
		
		while (current!=null) {
			if (current.getData().getFilmskaper().equals(delstreng)) {
				
				System.out.print("Tittelen: " + current.getData().getTittel() + "\n" + "Nr: "+
						"Produsent: "+ current.getData().getfilmselskapet()
						+ current.getData().getNr() + "\n" + "Plass: " + plass + "\n");
			}
			plass++;
		current = current.getNeste();
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