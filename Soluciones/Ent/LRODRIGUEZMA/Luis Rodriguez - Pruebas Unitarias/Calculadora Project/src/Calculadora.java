import static org.junit.Assert.*;

import org.junit.Test;

public class Calculadora {
	
	public int sumar(int sumando1, int sumando2) {
		return sumando1 + sumando2;
	}
	
	public int multiplicar(int multiplicando1, int multiplicando2) {
		return multiplicando1 * multiplicando2;
	}
	
	public int restar(int minuendo, int sustraendo){
		return minuendo - sustraendo;
	}
	
	public double dividir(int dividendo, int divisor) {
		return (double)dividendo / (double)divisor;
	}
	
	public double computarExpresion(String expresion) throws BadOperatorException {
		Parseador parseador = new Parseador();
		int operando1 = parseador.obtenerPrimerOperando(expresion);
		int operando2 = parseador.obtenerSegundoOperador(expresion);
		
		switch(parseador.obtenerOperador(expresion)) {
			case "+":{
				return sumar(operando1, operando2);
			}
			case "*":{
				return multiplicar(operando1, operando2);
			}
			case "-":{
				return restar(operando1, operando2);
			}
			case "/":{
				System.out.println(dividir(operando1, operando2));
				return dividir(operando1, operando2);
			}
			default:{
				throw new BadOperatorException("Error! La operación no es válida");
			}
		}
	}
}
