package com.brayanpastor.login.model;

public class Item {
private String titulo;
private int imagen;
private String subtitulo;


public Item(int imagen, String titulo)
{
	this.imagen=imagen;
	this.titulo=titulo;
	
	
}

public Item(int imagen, String titulo, String subtitulo)
{
	this.imagen=imagen;
	this.titulo=titulo;
	this.subtitulo=subtitulo;
	
	
}



public String getSubtitulo() {
	return subtitulo;
}

public void setSubtitulo(String subtitulo) {
	this.subtitulo = subtitulo;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public int getImagen() {
	return imagen;
}

public void setImagen(int imagen) {
	this.imagen = imagen;
}


}
