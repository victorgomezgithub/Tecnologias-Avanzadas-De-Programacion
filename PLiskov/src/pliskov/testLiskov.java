package pliskov;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testLiskov {

	@Test
	void testliskov() {
		Producto p = new Reducido("leche", 0.45);
		double expected = 0.45 * 1.1;
		assertEquals(expected, p.calcularIVA(p.precioBase));
	}

}
