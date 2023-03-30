package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void TestSuma() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.suma();
		assertEquals(30, resultado, "Error en la suma");
	}
	
	@Test
	public void TestResta() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.resta();
		assertEquals(10, resultado, "Error en la resta");
	}
	
	@Test
	public void TestMultiplicada() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.multiplica();
		assertEquals(200, resultado, "Error en la multiplicación");
	}
	
	@Test
	public void TestDivide() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.divide();
		assertEquals(2, resultado, "Error en la división");
	}

}