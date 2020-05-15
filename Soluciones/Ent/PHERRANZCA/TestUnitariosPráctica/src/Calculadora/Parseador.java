package Calculadora;

import Calculadora.Exceptions.*;

public class Parseador {

	//PRIMER OPERANDO

	public int ObtenerPrimerOperando(String expresion) {
		return Integer.valueOf(expresion.split(" ")[0]);
	}
	
	//SEGUNDO OPERANDO 
	public  int ObtenerSegundoOperando(String expresion) {
		return Integer.valueOf(expresion.split(" ")[2]);
	}
	
	//OPERADOR
	public String ObtenerOperador(String expresion) throws BadOperatorException {
		String operador = expresion.split(" ")[1];
		if(operador.length() > 1) {
			throw new BadOperatorException("Hay algo que no cuadra. Échale un vistazo.");
		}
		return operador;
	}

}
