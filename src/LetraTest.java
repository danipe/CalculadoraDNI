import static org.junit.Assert.*;

import org.junit.Test;

import Logica.CalcularLetra;

public class LetraTest {

	@Test
	public void test() {
		CalcularLetra cl = new CalcularLetra("23850348");
		assertEquals('S',cl.devolverLetra());
	}

}
