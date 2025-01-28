package oppgave_2;


public class Filmarkiv implements FilmarkivADT {

	private int antallSjanger = 4;

	private int storrelse;
	
	//kode for node
	
	private int antall;
	private LinearNode<Film> start;
	private LinearNode<Film> forste;

	//Tom konstruktør
	
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
		
		LinearNode<Film> holder=forste;
		
		forste = new LinearNode<>(nyFilm);
		
		forste.setNeste(holder);
		
		antall++;

	}

	
	@Override
	public boolean slettFilm(int filmnr) {
		LinearNode<Film> current = forste;
		LinearNode<Film> holder = current;
		//slette den eventuelle første
		if (current.getData().getNr() == filmnr) {
				forste = current.getNeste();
				antall--;
				return true;
			}
		
		current = current.getNeste();
		
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
		LinearNode<Film> current = forste;
		int plassTabbel = 0;
		int plass = 0;
		
		while (current.getNeste()!=null) {
			
			plass++;
			
			if (current.getData().getTittel().equals(delstreng)) {
				filmMiddlertidig[plassTabbel]=current.getData();
				plassTabbel++;
				
				System.out.print("Tittelen: " + current.getData().getTittel() + "\n" + "Nr: "
						+ current.getData().getNr() + "\n" + "Plass: " + plass + "\n");
			}
			current = current.getNeste();
		}
		
		//sjekker den siste også.
		if (current.getData().getTittel().equals(delstreng)) {
			filmMiddlertidig[plassTabbel]=current.getData();
			plassTabbel++;
			
			System.out.print("Tittelen: " + current.getData().getTittel() + "\n" + "Nr: "
					+ current.getData().getNr() + "\n" + "Plass: " + plass + "\n");
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
						"Produsent: "+ current.getData().getFilmselskapet()
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


}