package innlevering_1;
import innlevering_1.Sjanger;

public class FilmarkivMain {

	public static void main(String[] args) {
		
		
		FilmarkivADT filma = new Filmarkiv(100);
		
		//liste med filmer Dette vil bli ganske lang fordi jeg lager 99 eksemplarer med filmer
		//men for å spare meg tid så bruker jeg chatGPT til å lage de fleste med å mate den informasjon som den første.
		//ett problem er at det vil være vanskelig å sjekke om alle er logiske riktige.
		
		filma.leggTilFilm(new Film(1, "Walt", "Tornerose", 1998, "Disney"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(2, "George Lucas", "Star Wars", 1977, "Lucasfilm"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(3, "Steven Spielberg", "Jurassic Park", 1993, "Universal Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(4, "Christopher Nolan", "Inception", 2010, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(5, "Ridley Scott", "Gladiator", 2000, "Universal Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(6, "Martin Scorsese", "The Irishman", 2019, "Netflix"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(7, "James Cameron", "Titanic", 1997, "Paramount Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(8, "Peter Jackson", "The Lord of the Rings: The Fellowship of the Ring", 2001, "New Line Cinema"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(9, "Christopher Nolan", "The Dark Knight", 2008, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(10, "James Wan", "Aquaman", 2018, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(11, "Quentin Tarantino", "Pulp Fiction", 1994, "Miramax"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(12, "David Fincher", "Fight Club", 1999, "20th Century Fox"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(13, "James Gunn", "Guardians of the Galaxy", 2014, "Walt Disney Studios"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(14, "Denis Villeneuve", "Blade Runner 2049", 2017, "Warner Bros."), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(15, "Ridley Scott", "Alien", 1979, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(16, "Steven Spielberg", "E.T. the Extra-Terrestrial", 1982, "Universal Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(17, "Francis Ford Coppola", "The Godfather", 1972, "Paramount Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(18, "Martin Scorsese", "Goodfellas", 1990, "Warner Bros."), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(19, "Alfonso Cuarón", "Children of Men", 2006, "Universal Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(20, "Steven Spielberg", "Saving Private Ryan", 1998, "DreamWorks Pictures"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(21, "George Miller", "Mad Max: Fury Road", 2015, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(22, "Michael Bay", "Transformers", 2007, "Paramount Pictures"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(23, "Christopher Nolan", "Dunkirk", 2017, "Warner Bros."), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(24, "John Carpenter", "The Thing", 1982, "Universal Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(25, "Tim Burton", "Batman", 1989, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(26, "Christopher Nolan", "Interstellar", 2014, "Paramount Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(27, "James Cameron", "The Terminator", 1984, "Orion Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(28, "Steven Spielberg", "Schindler's List", 1993, "Universal Pictures"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(29, "Peter Jackson", "The Hobbit: An Unexpected Journey", 2012, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(30, "James Gunn", "The Suicide Squad", 2021, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(31, "Ridley Scott", "Prometheus", 2012, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(32, "Francis Ford Coppola", "Apocalypse Now", 1979, "United Artists"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(33, "Stanley Kubrick", "2001: A Space Odyssey", 1968, "MGM"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(34, "George Lucas", "Indiana Jones: Raiders of the Lost Ark", 1981, "Paramount Pictures"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(35, "Ron Howard", "Apollo 13", 1995, "Universal Pictures"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(36, "John Woo", "Face/Off", 1997, "Paramount Pictures"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(37, "Ridley Scott", "The Martian", 2015, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(38, "Neill Blomkamp", "District 9", 2009, "TriStar Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(39, "Oliver Stone", "Platoon", 1986, "Orion Pictures"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(40, "David Yates", "Harry Potter and the Order of the Phoenix", 2007, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(41, "David Fincher", "Se7en", 1995, "New Line Cinema"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(42, "Christopher Nolan", "Memento", 2000, "Newmarket Films"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(43, "J.J. Abrams", "Star Trek", 2009, "Paramount Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(44, "Joss Whedon", "The Avengers", 2012, "Walt Disney Studios"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(45, "Ridley Scott", "Blade Runner", 1982, "Warner Bros."), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(46, "Joel Coen", "No Country for Old Men", 2007, "Miramax"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(47, "George Miller", "The Road Warrior", 1981, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(48, "Christopher Nolan", "Tenet", 2020, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(49, "Martin Scorsese", "The Wolf of Wall Street", 2013, "Paramount Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(50, "Ridley Scott", "The Gladiator", 2000, "DreamWorks"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(51, "Stanley Kubrick", "A Clockwork Orange", 1971, "Warner Bros."), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(52, "Bryan Singer", "X-Men", 2000, "20th Century Fox"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(53, "Christopher Nolan", "The Prestige", 2006, "Warner Bros."), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(54, "George Lucas", "American Graffiti", 1973, "Universal Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(55, "Wes Anderson", "The Grand Budapest Hotel", 2014, "Fox Searchlight Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(56, "Steven Spielberg", "Jurassic Park: The Lost World", 1997, "Universal Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(57, "Joseph Kosinski", "Tron: Legacy", 2010, "Walt Disney Studios"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(58, "David Fincher", "The Social Network", 2010, "Columbia Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(59, "Ridley Scott", "Alien: Covenant", 2017, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(60, "Denis Villeneuve", "Arrival", 2016, "Paramount Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(61, "Steven Spielberg", "The Post", 2017, "20th Century Fox"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(62, "Michael Mann", "Heat", 1995, "Warner Bros."), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(63, "Martin Scorsese", "The Departed", 2006, "Warner Bros."), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(64, "Steven Spielberg", "Bridge of Spies", 2015, "20th Century Fox"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(65, "Ron Howard", "Rush", 2013, "Universal Pictures"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(66, "Michael Bay", "Armageddon", 1998, "Touchstone Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(67, "Christopher Nolan", "Insomnia", 2002, "Warner Bros."), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(68, "Christopher Nolan", "The Dark Knight Rises", 2012, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(69, "J.J. Abrams", "Super 8", 2011, "Paramount Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(70, "Ridley Scott", "Exodus: Gods and Kings", 2014, "20th Century Fox"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(71, "Tim Burton", "Edward Scissorhands", 1990, "20th Century Fox"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(72, "David Lynch", "Dune", 1984, "Universal Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(73, "Sam Mendes", "1917", 2019, "Universal Pictures"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(74, "Denis Villeneuve", "Dune", 2021, "Warner Bros."), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(75, "Terry Gilliam", "Brazil", 1985, "Universal Pictures"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(76, "Steven Spielberg", "Minority Report", 2002, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(77, "James Cameron", "Avatar", 2009, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(78, "Guy Ritchie", "Snatch", 2000, "Columbia Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(79, "David Fincher", "Zodiac", 2007, "Paramount Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(80, "Ang Lee", "Life of Pi", 2012, "20th Century Fox"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(81, "Tim Burton", "Beetlejuice", 1988, "Warner Bros."), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(82, "Stanley Kubrick", "Full Metal Jacket", 1987, "Warner Bros."), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(83, "Michael Bay", "Bad Boys", 1995, "Columbia Pictures"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(84, "George Miller", "Mad Max: Fury Road", 2015, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(85, "George Lucas", "The Phantom Menace", 1999, "Lucasfilm"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(86, "James Cameron", "Aliens", 1986, "20th Century Fox"), Sjanger.SCIFI);
		filma.leggTilFilm(new Film(87, "Christopher Nolan", "Batman Begins", 2005, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(88, "Martin Scorsese", "The Last Temptation of Christ", 1988, "Universal Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(89, "Joel Coen", "The Big Lebowski", 1998, "Gramercy Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(90, "Quentin Tarantino", "Inglourious Basterds", 2009, "The Weinstein Company"), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(91, "David Yates", "Harry Potter and the Deathly Hallows - Part 2", 2011, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(92, "Joss Whedon", "Avengers: Age of Ultron", 2015, "Walt Disney Studios"), Sjanger.ACTION);
		filma.leggTilFilm(new Film(93, "Ron Howard", "A Beautiful Mind", 2001, "Universal Pictures"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(94, "David Fincher", "Gone Girl", 2014, "20th Century Fox"), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(95, "Christopher Nolan", "The Prestige", 2006, "Warner Bros."), Sjanger.DRAMA);
		filma.leggTilFilm(new Film(96, "Stanley Kubrick", "The Shining", 1980, "Warner Bros."), Sjanger.HISTORY);
		filma.leggTilFilm(new Film(97, "David Yates", "Fantastic Beasts and Where to Find Them", 2016, "Warner Bros."), Sjanger.ACTION);
		filma.leggTilFilm(new Film(98, "Ridley Scott", "The Counselor", 2013, "20th Century Fox"), Sjanger.DRAMA);
		
		
		
		
		
		
		Meny meny = new Meny(filma); 
		
		
		meny.start();

	}

}
