package Entities;

import Entities.enums.Color;

public class Circle extends Shape{
	
	private Double radius;
	
	
	// Metodo construtor padrao
	public Circle() {
		super();
		
	}


	// Metodo construtor com argumentos
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}


	
	// Metodo Getters e Setters
	public Double getRadius() {
		return radius;
	}




	public void setRadius(Double radius) {
		this.radius = radius;
	}

	// Metodo sobrescrito para calcular area do circulo
	@Override
	public double area() {
		
		return Math.PI * (radius*radius);
	}
	
	
	
	
	
	
	

}
