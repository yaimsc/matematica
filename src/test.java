import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		
		/**
		 * se pueba el metodo suma y el numero que deberia salir 
		 * y se ve si dan lo mismo o no
		 */
		Matematica m = new Matematica(); 
		m.suma(1, 7); 
		int numero = 8; 
		assertEquals(m.suma(1, 7), numero); 
	}
	
	@Test
	public void test2() {
		
		/**
		 * se prueba si va el metodo mayor
		 * poniendo dos numeros de la manera que de verdadero, 
		 * es decir, a tiene que ser mayor que b
		 */
		Matematica m = new Matematica(); 
		boolean numeros = m.mayor(6, 4); 
		assertTrue(numeros); 
	}
	
	
	@Test
	public void test3() {
		
		/**
		 * se prueba el metodo sumas 
		 * y se mira si el resultado es igual o no
		 */
		Matematica m = new Matematica(); 
		m.sumas(); 
		int[] resultados = {8, 8, 8, 8}; 
		assertNotSame(m.sumas(), resultados); 
	}

	
	
	

}
