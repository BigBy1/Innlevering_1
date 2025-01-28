package oppgave_2;

import java.util.Objects;


public class Film {

	private int nr;
	private static int teller;
	private String filmskaper;
	private String tittel;
	private int lanseringsår;
	private Sjanger sjanger;
	private String filmselskapet;
	

	public Film() {

	}

	public Film(String filmskaper, String tittel, int lanseringsår, String filmselskapet) {
		this.tittel =tittel;
		teller++;
		nr=nr+teller;
		this.filmskaper = filmskaper;
		this.lanseringsår = lanseringsår;
		this.filmselskapet = filmselskapet;
	}

	// get/set metoder til nr
	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	// get/set metoder til filmskaper
	public String getFilmskaper() {
		return filmskaper;
	}

	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}

	// get/set metoder til tittel
	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	// get/set metoder til filmskaper
	public String getFilmselskapet() {
		return filmselskapet;
	}

	public void setFilmselskapet(String filmselskapet) {
		this.filmselskapet = filmselskapet;
	}
	
	// get/set metode for Sjanger
	
	public Sjanger getSjanger() {
		return sjanger;
	}
	
	public void settSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	
	
	// get/set metode for lanseringsår
	
		public int getLanseringsår() {
			return lanseringsår;
		}
		
		public void settlanseringsår(int lanseringsår) {
			this.lanseringsår = lanseringsår;
		}
	
	@Override
	public int hashCode() {
		System.out.print(nr+"");
		nr++;
		return nr;
	}
	
	public boolean equals (Object obj) {
		if (this == obj) {
			Film other = (Film) obj;
			this.nr = other.getNr();
			return true;
		}
		if (obj == null || getClass()!=obj.getClass()) {
			return false;
		}
		
		
		Film other = (Film) obj;
		return this.nr == other.nr;
	}
}