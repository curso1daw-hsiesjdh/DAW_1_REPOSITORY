package Calculadora;

import Calculadora.Exceptions.*;

public class ParseadorLARGO {

	/*
	 *  PRIMER OPERANDO 
	 */

	public int ObtenerPrimerOperando(String expresion) throws BadOperatorException {
		
		String[] primerOperando;
	
		//Reemplazamos cualquier espacio o paréntesis que se haya podido poner en el String.
		expresion = expresion.replaceAll("[( )]", "");
		
		//En el caso de que el primer número sea negativo, y se trate de una resta, es necesario este paso.
		if (expresion.charAt(0) == '-') {
			
			if(ObtenerOperador(expresion) == "-") {
				primerOperando = expresion.split("-");
				return (Integer.valueOf(primerOperando[1]) * (-1));
			}
		}
		
		//Hacemos split de la operación para sacar ambos operandos, en este caso nos interesa el primero.
		if(ObtenerOperador(expresion) == "+") {
			primerOperando = expresion.split("\\+");
			return Integer.valueOf(primerOperando[0]);
		}
		
		if(ObtenerOperador(expresion) == "*") {
			primerOperando = expresion.split("\\*");
			return Integer.valueOf(primerOperando[0]);
		}
		
		if(ObtenerOperador(expresion) == "-") {
			primerOperando = expresion.split("\\-", 2);
			return Integer.valueOf(primerOperando[0]);
		}
		
		if(ObtenerOperador(expresion) == "/") {
			primerOperando = expresion.split("\\/");
			return Integer.valueOf(primerOperando[0]);
		}
		
		else {
			throw new BadOperatorException("Hay algo que no cuadra. Verifica tu operación.");
		}

			
	}
	
	/*
	 *  SEGUNDO OPERANDO 
	 */
	
	public  int ObtenerSegundoOperando(String expresion) throws BadOperatorException {
		
		String[] segundoOperando;
		
		//Reemplazamos cualquier espacio o paréntesis que se haya podido poner en el String.
		expresion = expresion.replaceAll("[( )]", "");
		
		/*
		 *  SEGUNDO OPERANDO SI EMPIEZA POR - 
		 */
		
		//En el caso de que el primer número sea negativo, y se trate de una resta, es necesario este paso
		if (expresion.charAt(0) == '-') {
			
			if(ObtenerOperador(expresion) == "-") {
				segundoOperando = expresion.split("\\-", 3);
				return Integer.valueOf(segundoOperando[2]);
			}
		}
		
		//Hacemos split de la operación para sacar ambos operandos, en este caso nos interesa el segundo.
		if(ObtenerOperador(expresion) == "+") {
			segundoOperando = expresion.split("\\+");
			return Integer.valueOf(segundoOperando[1]);
		}
		
		if(ObtenerOperador(expresion) == "*") {
			segundoOperando = expresion.split("\\*");
			return Integer.valueOf(segundoOperando[1]);
		}
		
		if(ObtenerOperador(expresion) == "-") {
			segundoOperando = expresion.split("\\-");
			return Integer.valueOf(segundoOperando[1]);
		}
		
		if(ObtenerOperador(expresion) == "/") {
			segundoOperando = expresion.split("\\/");
			return Integer.valueOf(segundoOperando[1]);
		}
	
		else {
			throw new BadOperatorException("Hay algo que no cuadra. Verifica tu operación.");
		}

	
	}
	
	public String ObtenerOperador(String expresion) throws BadOperatorException {
		
		//Reemplazamos cualquier espacio o paréntesis que se haya podido poner en el String.
		expresion = expresion.replaceAll("[( )]", "");
		
		if (expresion.indexOf('+') > 0) {
			return "+";
		}
		
		if (expresion.indexOf('*') > 0) {
			return "*";
		}
		
		if (expresion.indexOf('/') > 0) {
			return "/";
		}
		
		//Con este return damos por hecho que la operación será una resta, a no ser que se cumplan los if anteriores.
		//De este modo nos ahorramos el error al poner una operación del tipo "-8-(-9)".
		return "-";

	
	}

}
