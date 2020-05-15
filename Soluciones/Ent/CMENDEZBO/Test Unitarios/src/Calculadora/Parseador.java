package Calculadora;

import Calculadora.Exceptions.*;

public class Parseador {

// PRIMER OPERANDO
	public int ObtenerPrimerOperando(String expresion) throws BadOperatorException {
		
		String[] primerOperando;
		expresion = expresion.replaceAll("[( )]", "");

		if (expresion.charAt(0) == '-') {
			
			if(ObtenerOperador(expresion) == "-") {
				primerOperando = expresion.split("-");
				return (Integer.valueOf(primerOperando[1]) * (-1));
			}
		}
		if(ObtenerOperador(expresion) == "+") {
			primerOperando = expresion.split("\\" + ObtenerOperador(expresion));
			return Integer.valueOf(primerOperando[0]);
		}
		
		if(ObtenerOperador(expresion) == "*") {
			primerOperando = expresion.split("\\" + ObtenerOperador(expresion));
			return Integer.valueOf(primerOperando[0]);
		}
		
		if(ObtenerOperador(expresion) == "-") {
			primerOperando = expresion.split("\\" + ObtenerOperador(expresion), 2);
			return Integer.valueOf(primerOperando[0]);
		}
		
		if(ObtenerOperador(expresion) == "/") {
			primerOperando = expresion.split("\\" + ObtenerOperador(expresion));
			return Integer.valueOf(primerOperando[0]);
		}
		
			else {
				throw new BadOperatorException("Error.");
			}
		}
		
// SEGUNDO OPERANDO
	
	public int ObtenerSegundoOperando(String expresion) throws BadOperatorException {
		
		String[] segundoOperando;
		expresion = expresion.replaceAll("[( )]", "");
		
		if (expresion.charAt(0) == '-') {	
			if(ObtenerOperador(expresion) == "-") {
				segundoOperando = expresion.split("\\" + ObtenerOperador(expresion), 3);
				return Integer.valueOf(segundoOperando[2]);
			}
		}

		if(ObtenerOperador(expresion) == "+") {
			segundoOperando = expresion.split("\\+" );
			return Integer.valueOf(segundoOperando[1]);
		}
		
		if(ObtenerOperador(expresion) == "*") {
			segundoOperando = expresion.split("\\*");
			return Integer.valueOf(segundoOperando[1]);
		}
		
		if(ObtenerOperador(expresion) == "-") {
			segundoOperando = expresion.split("\\-" );
			return Integer.valueOf(segundoOperando[1]);
		}
		
		if(ObtenerOperador(expresion) == "/") {
			segundoOperando = expresion.split("\\/");
			return Integer.valueOf(segundoOperando[1]);
		}
	
		else {
			throw new BadOperatorException("Error.");
		}
	
	}
// OPERADOR
	public String ObtenerOperador(String expresion) throws BadOperatorException {
		
		expresion = expresion.replaceAll("[( )]", "");
		if(expresion.charAt(0) == '-') {}
		if (expresion.indexOf('+') > 0) {
			return "+";
		}
		if (expresion.indexOf('*') > 0) {
			return "*";
		}
		if (expresion.indexOf('/') > 0) {
			return "/";
		}
		return "-";	
	}
}
