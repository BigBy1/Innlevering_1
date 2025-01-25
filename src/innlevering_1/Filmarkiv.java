package innlevering_1;

public class Filmarkiv implements FilmarkivADT {
	
	private int antall;
	private int antallSjanger;
	
	private int storrelse;
	private int sjangerStorrelse=1;
	
	public Film [] Tabell; 
	
	public Sjanger [] Sjanger; 

	public Filmarkiv (int storrelse) {
		this.antall = 0;
		this.storrelse = storrelse;
		
		this.Tabell = new Film [storrelse];
		this.Sjanger = new Sjanger [sjangerStorrelse];
	}
	
	
	
	
	
	@Override
	public Film finnFilm(int nr) {
		
		return Tabell[nr];
	}

	@Override
	public void leggTilFilm(Film nyFilm, Sjanger sjanger) {
		
		
		
		//tabellen med filmer.
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
		
		boolean finnesSjanger = false;
		
		for (int i = 0; i<Sjanger.length;i++) {
			if(Sjanger[i]==sjanger);{
				finnesSjanger =true;
			}
			
		}
		
		if (finnesSjanger = true) {
			antall(sjanger);
		}
		else  {
			antallSjanger++;
			antall(sjanger);
		}
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
		
		
		
		Sjanger [sjangerStorrelse] = sjanger;
		
		sjangerStorrelse++;
		
		return antallSjanger;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return antall++;
	}
	
	public int storrelse() {
		return storrelse;
	}


	

}
