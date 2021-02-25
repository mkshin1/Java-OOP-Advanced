  
package com.javaoop.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperandOne(10.0);
		c.performOperation();
		c.setOperation("+");
		c.setOperandTwo(20.0);
		c.getResult();
		

	}

}