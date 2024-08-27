package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 5 + 5 = 10")
	void testSum() {
		// Arrange 
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "5+5 não gerou o valor 10");
		
	}
	
	@Test
	@DisplayName("Teste 8 - 4 = 4")
	void testSub() {
		// Arrange 
		Calculadora calc = new Calculadora();
		double valor1 = 8D;
		double valor2 = 4D;
		double esperado = 4D;
		
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "8-4 não gerou o valor 8");
		
	}
	
	@Test
	@DisplayName("Teste 3 * 10 = 30")
	void testMult() {
		// Arrange 
		Calculadora calc = new Calculadora();
		double valor1 = 3D;
		double valor2 = 10D;
		double esperado = 30D;
		
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "3*10 não gerou o valor 30");
		
	}
	
	@Test
	@DisplayName("Teste 144 / 12 = 12")
	void testDiv() {
		// Arrange 
		Calculadora calc = new Calculadora();
		double valor1 = 144D;
		double valor2 = 12D;
		double esperado = 12D;
		
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "144/12 não gerou o valor 12");
		
	}

}
