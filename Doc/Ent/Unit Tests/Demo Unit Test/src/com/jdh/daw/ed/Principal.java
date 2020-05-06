package com.jdh.daw.ed;

import com.jdh.daw.ed.exceptions.BadCoefficientException;

public class Principal {

	// Hasta ahora testeabamos nuestras aplicaciones a través un método main.
	// Este sistema no cumple con el principio FIRST, al menos en lo que se refiere a: 
	// Aislamiento (Isolated)- todos las pruebas están mezcladas en un mismo método main.
	// Repetibles (Repeatable)- No son automatizables a través de ninguna herramienta
	public static void main(String[] args) {
		String e = "2x - 1 = 0";
		Parseador p = new Parseador();
		try {
			System.out.println("Operador: " + p.obtenerOperador(e));
			System.out.println("Coeficiente a: " + p.obtenerCoeficienteA(e));
			System.out.println("Coeficiente b: " + p.obtenerCoeficienteB(e));
			
			EcuacionPrimerGrado resolutor = new EcuacionPrimerGrado();
			System.out.println("La solucuión a la ecuación " + e + " es: " + resolutor.obtenerResultado(e));
		} catch (BadCoefficientException e1) {
			e1.printStackTrace();
		}

	}

}
