package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class CalculadoraTest4 {
	
	private int nume1;
	private int nume2;
	private int esperado;
	
	public CalculadoraTest4(int nume1, int nume2, int esperado) {
		this.nume1 = nume1;
		this.nume2 = nume2;
		this.esperado = esperado;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object [][] {
			{50, 10, 5},
			{10, 5, 3},
			{18, 2, 9}
		});
	}

	@Test
		public void TestDivide() {
			Calculadora calcu = new Calculadora(nume1, nume2);
			int resultado = calcu.divide();
			assertEquals(esperado, resultado, "Error en la división");
		}

}