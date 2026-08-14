package com.krakedev;

public class Rectangulo {
	
	public int base;
	public int altura;
	
	public int calcularArea() {
		
		int area = base*altura;
		return area;
	}
	
	//CALCULAR PERIMETRO
	public double calcularPerimetro() {
		double perimetro = base+base+altura+altura;
		return perimetro;
	}
}
