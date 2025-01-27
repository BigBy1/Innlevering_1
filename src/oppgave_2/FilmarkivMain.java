package oppgave_2;


public class FilmarkivMain {

	public static void main(String[] args) {
		
		Filmarkiv filma = new Filmarkiv();
		
		
		//liste med filmer Dette vil bli ganske lang fordi jeg lager 99 eksemplarer med filmer
		//men for å spare meg tid så bruker jeg chatGPT til å lage de fleste med å mate den informasjon som den første.
		//ett problem er at det vil være vanskelig å sjekke om alle er logiske riktige.
		
		filma.leggTilFilm(new Film(filma.hashCode(), "Walt", "Tornerose", 1998, "Disney"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "John", "Titanic", 1997, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "George", "Apollo 13", 1995, "Universal"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "Blade Runner", 1982, "Warner Bros"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Steven", "Jurassic Park", 1993, "Universal"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Christopher", "Interstellar", 2014, "Paramount"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "Avatar", 2009, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Peter", "King Kong", 2005, "Universal"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Clint", "Million Dollar Baby", 2004, "Warner Bros"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Francis", "The Godfather", 1972, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Stanley", "2001: A Space Odyssey", 1968, "MGM"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Quentin", "Pulp Fiction", 1994, "Miramax"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Robert", "Goodfellas", 1990, "Warner Bros"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Steven", "E.T.", 1982, "Universal"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Walt", "Løvenes Konge", 1994, "Disney"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "David", "The Martian", 2015, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "Terminator 2", 1991, "TriStar"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "Gladiator", 2000, "DreamWorks"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Steven", "Schindler's List", 1993, "Universal"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "George", "Star Wars", 1977, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Walt", "Aladdin", 1992, "Disney"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "Aliens", 1986, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Peter", "Hobbitten", 2012, "Warner Bros"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "David", "Blade Runner 2049", 2017, "Warner Bros"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Martin", "Shutter Island", 2010, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Gore", "Pirates of the Caribbean", 2003, "Disney"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Jon", "The Mandalorian", 2019, "Lucasfilm"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Patty", "Wonder Woman", 2017, "Warner Bros"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "David", "Se7en", 1995, "New Line Cinema"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Alfonso", "Gravity", 2013, "Warner Bros"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Baz", "The Great Gatsby", 2013, "Warner Bros"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Peter", "The Lovely Bones", 2009, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Guy", "The Man from U.N.C.L.E.", 2015, "Warner Bros"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "J.J.", "Star Trek", 2009, "Paramount"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Andrew", "Whiplash", 2014, "Sony Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Sam", "Spider-Man", 2002, "Sony Pictures"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Christopher", "Dunkirk", 2017, "Warner Bros"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Frank", "The Irishman", 2019, "Netflix"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Joe", "A Beautiful Mind", 2001, "Universal"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Anthony", "Avengers: Endgame", 2019, "Marvel Studios"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Gareth", "Rogue One", 2016, "Lucasfilm"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Robert", "The Batman", 2022, "Warner Bros"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Kenneth", "Murder on the Orient Express", 2017, "20th Century Fox"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Catherine", "The Hurt Locker", 2008, "Summit Entertainment"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "The Last Duel", 2021, "20th Century Studios"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Guillermo", "Pan's Labyrinth", 2006, "Warner Bros"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Martin", "The Revenant", 2015, "20th Century Fox"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "Inception", 2010, "Warner Bros"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Quentin", "Kill Bill: Vol. 1", 2003, "Miramax"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Stanley", "The Shining", 1980, "Warner Bros"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Christopher", "The Dark Knight", 2008, "Warner Bros"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "David", "The Godfather: Part II", 1974, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Steven", "Minority Report", 2002, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "George", "The Pursuit of Happyness", 2006, "Columbia Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "Prometheus", 2012, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Peter", "The Lord of the Rings: The Fellowship of the Ring", 2001, "New Line Cinema"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Steven", "Catch Me If You Can", 2002, "DreamWorks"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Robert", "The Departed", 2006, "Warner Bros"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "Avatar: The Way of Water", 2022, "20th Century Studios"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "Blade Runner 2049", 2017, "Warner Bros"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Martin", "The Wolf of Wall Street", 2013, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Walt", "Frozen", 2013, "Walt Disney"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Christopher", "The Prestige", 2006, "Warner Bros"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Quentin", "Inglourious Basterds", 2009, "Weinstein Company"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Stanley", "Dr. Strangelove", 1964, "Columbia Pictures"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "David", "The Social Network", 2010, "Columbia Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "The Matrix", 1999, "Warner Bros"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "The Martian", 2015, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Christopher", "Memento", 2000, "Newmarket Films"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Walt", "Mary Poppins", 1964, "Disney"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "Rocky", 1976, "United Artists"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Steven", "Jurassic World", 2015, "Universal"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Peter", "The Hobbit: An Unexpected Journey", 2012, "Warner Bros"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "Alien", 1979, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "David", "Fight Club", 1999, "20th Century Fox"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "George", "Jaws", 1975, "Universal"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Steven", "Indiana Jones: Raiders of the Lost Ark", 1981, "Paramount"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Martin", "No Country for Old Men", 2007, "Miramax"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Quentin", "Django Unchained", 2012, "The Weinstein Company"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "Alien: Covenant", 2017, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Robert", "Shutter Island", 2010, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "Skyfall", 2012, "Sony Pictures"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "George", "Saving Private Ryan", 1998, "DreamWorks"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "David", "The Big Short", 2015, "Paramount"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "Gladiator", 2000, "DreamWorks"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "Guardians of the Galaxy", 2014, "Marvel Studios"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Walt", "Toy Story", 1995, "Pixar"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Quentin", "Reservoir Dogs", 1992, "Miramax"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "Stanley", "2001: A Space Odyssey", 1968, "MGM"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Peter", "The Lord of the Rings: The Return of the King", 2003, "New Line Cinema"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "The Dark Knight Rises", 2012, "Warner Bros"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Christopher", "Interstellar", 2014, "Paramount"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(filma.hashCode(), "Martin", "There Will Be Blood", 2007, "Paramount Vantage"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "James", "The Avengers", 2012, "Marvel Studios"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(filma.hashCode(), "Ridley", "Thelma & Louise", 1991, "MGM"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(filma.hashCode(), "David", "The King's Speech", 2010, "The Weinstein Company"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Steven", "Schindler's List", 1993, "Universal"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(filma.hashCode(), "Quentin", "Once Upon a Time in Hollywood", 2019, "Columbia Pictures"), Sjanger.DRAMA);
		
		
		
		
		
		
		
		Meny meny = new Meny(filma); 
		
		
		meny.start();

	}

}
