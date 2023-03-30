package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class CalculadoraTest3 {
	
	private int nume1;
	private int nume2;
	private int esperado;
	
	public CalculadoraTest3 (int nume1, int nume2, int esperado) {
		this.nume1 = nume1;
		this.nume2 = nume2;
		this.esperado = esperado;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object [][] {
			{20, 10, 30},
			{12, 12, 24},
			{3,  22, 25}
		});
	}

	@Test
		public void TestSuma() {
			Calculadora calcu = new Calculadora(nume1, nume2);
			int resultado = calcu.suma();
			assertEquals(esperado, resultado, "Error en la suma");
		}

}
