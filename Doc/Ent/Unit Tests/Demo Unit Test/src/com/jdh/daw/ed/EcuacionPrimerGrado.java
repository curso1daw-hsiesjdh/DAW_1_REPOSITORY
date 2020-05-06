package com.jdh.daw.ed;

import com.jdh.daw.ed.exceptions.BadCoefficientException;

/*
 * Clase empleada para obtener la solución de una
 * ecuación de primer grado.
 */
public class EcuacionPrimerGrado {
	/*
	 * Ecuación de primer grado: Forma algebraica genérica: ax +/- b = y Raiz o
	 * solución de una ecuación de primer grado: Valor de x para el que y se hace 0
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
