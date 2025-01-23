package innlevering_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilmArkivTest {

	@Test
	void test() {
		Filmarkiv tabell = new Filmarkiv(10);
		assertEquals(10, tabell.length);
		//dette er bare en test om git hub funker.
	}

}
