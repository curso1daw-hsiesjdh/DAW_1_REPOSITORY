package com.jdh.daw.ed;

import com.jdh.daw.ed.exceptions.BadCoefficientException;

/*
 * Clase de utilidad para la extracción de cada uno de los coeficientes
 * de una ecuación de primer grado. 
 */
public class Parseador {
	public int obtenerCoeficienteA(final String ecuacion) throws BadCoefficientException{

		int coefAToReturn = 0;
		
		String[] partes = obtenerPartesAyB(ecuacion);

		String coefA = partes[0].trim();
		
		coefAToReturn = Integer.valueOf(coefA.substring(0, coefA.length()-1));
		if (coefAToReturn > 10) {
			throw new BadCoefficientException("Coeficiente A incorrecto para la ecuación: " + ecuacion);
		}

		return coefAToReturn;
	}

	public int obtenerCoeficienteB(final String ecuacion) {

		String[] partes = obtenerPartesAyB(ecuacion);

		String coefB = partes[1].trim();

		return Integer.valueOf(coefB);
	}

	public String obtenerOperador(final String ecuacion) {
		String operatorToReturn = "-";
		
		if (ecuacion.indexOf('+') > 0) {
			operatorToReturn = "+";
		}
		
		return operatorToReturn;
	}

	private String[] obtenerPartesAyB(final String ecuacion) {
		String[] partesEcuacion = ecuacion.split("=");

		String operador = obtenerOperador(ecuacion);

		String[] partes1 = partesEcuacion[0].split("\\" + operador);

		return partes1;
	}
}
