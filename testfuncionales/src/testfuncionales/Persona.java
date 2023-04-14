package testfuncionales;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Persona {
	
	private int edad;
	
	public Persona(int edad) {
		
		this.edad = edad;
	}
	
	public boolean isMayorDeEdad() {
		
		assert edad >= 0;
		return edad >= 18;
	}

}
