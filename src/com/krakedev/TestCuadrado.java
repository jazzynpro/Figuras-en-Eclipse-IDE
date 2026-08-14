package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado r1 = new Cuadrado();
		r1.lado = 4 ;
		double resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado: "+ resultadoArea);
		
		Cuadrado r2 = new Cuadrado();
		r2.lado = 3;
		double resultadoPerimetro;
		resultadoPerimetro = r2.calcularPerimetro();
		System.out.println("Resultado: "+ resultadoPerimetro);
		
		Cuadrado r3 = new Cuadrado();
		r3.lado = 5;
		double resultadoArea1;
		resultadoArea1 = r3.calcularArea();
		System.out.println("Resultado: "+ resultadoArea1);
		
		Cuadrado r4 = new Cuadrado();
		r4.lado = 2;
		double resultadoPerimetro1;
		resultadoPerimetro1 = r4.calcularPerimetro();
		System.out.println("Resultado: "+ resultadoPerimetro1);
		
		Cuadrado r5 = new Cuadrado();
		r5.lado = 9;
		double resultadoArea2;
		resultadoArea2 = r5.calcularArea();
		System.out.println("Resultado: " + resultadoArea2);
		
		
	}

}
