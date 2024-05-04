package Entities;

import Entities.enums.Color;

public class Rectangle extends Shape{
	
	private Double width;
	private Double height;
	
	
	// Metodo construtor padrao
	public Rectangle() {
		super();
		
	}


	
	// Metodo construtor com argumentos
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	

	
	// Metodo Getters e Setters
	public Double getWidth() {
		return width;
	}





	public void setWidth(Double width) {
		this.width = width;
	}


	public Double getHeight() {
		return height;
	}


	public void setHeight(Double height) {
		this.height = height;
	}


	// Metodo sobrescrito para calcular area do retangulo
	@Override
	public double area() {
		
		return width * height;
	}
	
	
	
	

}
