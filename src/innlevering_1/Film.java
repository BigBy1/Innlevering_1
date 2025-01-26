package innlevering_1;

import java.util.Objects;

public class Film {

	private int nr;
	private String filmskaper;
	private String tittel;
	private int lanseringsår;
	private Sjanger sjanger;
	private String filmselskapet;
	

	public Film() {

	}

	public Film(int nr, String filmskaper, String tittel, int lanseringsår, String filmselskapet, Sjanger sjanger) {
		this.nr = nr;
		this.filmskaper = filmskaper;
		this.lanseringsår = lanseringsår;
		this.filmselskapet = filmselskapet;
		this.sjanger = sjanger;
		
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
	public String filmselskapet() {
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
	
	@Override
	public int hashCode() {
		return Objects.hash(nr);
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
















