package com.example.primero;

public class calculadora {
	private double cal;

	public double sumar(double a, double b) {
		cal = a + b;
		return cal;

	}
	public double sumar(double a, double b , double c) {
		cal = a + b + c;
		return cal;

	}

	public double restar(double a, double b) {
		cal = a - b;
		return cal;

	}

	public double multi(double a, double b) {
		cal = a * b;
		return cal;

	}

	public double dividir(double a, double b) {
		cal = a / b;
		return cal;

	}
	

}
