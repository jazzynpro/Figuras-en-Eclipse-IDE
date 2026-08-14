package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado r1 = new Cuadrado();
		r1.lado = 4 ;
		
		double resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado: "+ resultadoArea);
	}

}
