package com.example.primero;

public class Docente extends Persona {
	private String accion;

	public String enseniar() {
		accion = "estoy enseñando";
		return accion;
	}
}
