package calculadora;

/**
 *
 * @author Mary
 */

public class Calculadora{
	private int num1;
	private int num2;
	
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int suma() {	
		int resultado = num1 + num2;
		return resultado;
	}
	
	public int resta() {
		int resultado;
		
		if(resta2())
			resultado = num1 - num2;
		else
			resultado = num2 - num1;
		return resultado;
	}
	public boolean resta2() {
		if(num1 >= num2)
				return true;
		else
				return false;
	}
	
	public int multiplica() {
		int resultado = num1 * num2;
		return resultado;
	}
	
	public int divide() {
		int resultado = num1 / num2;
		return resultado;
	}
	
	public Integer divide2() {
		if(num2 == 0) return null;
		int resultado = num1 / num2;
		return resultado;
	}
}