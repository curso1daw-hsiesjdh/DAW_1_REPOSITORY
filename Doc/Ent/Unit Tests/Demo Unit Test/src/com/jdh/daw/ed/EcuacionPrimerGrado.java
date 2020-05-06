package com.jdh.daw.ed;

import com.jdh.daw.ed.exceptions.BadCoefficientException;

/*
 * Clase empleada para obtener la soluci�n de una
 * ecuaci�n de primer grado.
 */
public class EcuacionPrimerGrado {
	/*
	 * Ecuaci�n de primer grado: Forma algebraica gen�rica: ax +/- b = y Raiz o
	 * soluci�n de una ecuaci�n de primer grado: Valor de x para el que y se hace 0
	 * --> x=[-]b/a
	 */
	private Parseador parseador = new Parseador();

	public double obtenerResultado(final String ecuacion) throws BadCoefficientException{
		int a = parseador.obtenerCoeficienteA(ecuacion);
		int b = parseador.obtenerCoeficienteB(ecuacion);
		String operador = parseador.obtenerOperador(ecuacion);
		if (operador.equals("+")) {
			b = b * (-1);
		}

		double resultado = Double.valueOf((b)) / Double.valueOf(a);
		return resultado;
	}

}
