package innlevering_1;

public class Filmarkiv implements FilmarkivADT {
	
	private int antall;
	private int storrelse;
	
	public Film [] Tabell; 

	public Filmarkiv (int storrelse) {
		this.antall = 0;
		this.storrelse = storrelse;
		
		this.Tabell = new Film [storrelse];
	}
	
	
	
	@Override
	public Film finnFilm(int nr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		
		
		if (antall == storrelse) {
			Film [] TabellHolder = Tabell;
			
			this.storrelse = storrelse *2;
			Tabell = new Film [storrelse];
			for (int i = 0; i<TabellHolder.length;i++) {
				Tabell[i] = TabellHolder[i];
			}
			Tabell[antall] = nyFilm;
		}
		else {
			Tabell[antall] = nyFilm;
		}
		antall++;
	}

	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
