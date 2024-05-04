package Entities;

import Entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	// Metodo construtor padrao
	public Shape() {
		
	}

	
	// Metodo construtor com argumentos
	public Shape(Color color) {
		super();
		this.color = color;
	}


	
	// Metodo Getters e Setters
	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
	
	
		
	// Metodo para calcular area
	public abstract double area();
	
	
	
}
