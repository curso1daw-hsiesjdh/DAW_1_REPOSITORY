import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraReal {
	
	public int sumar(int sum, int sum1) {
		return sum + sum1;
	}
	
	public int multiplicar(int mul, int mul1) {
		return mul * mul1;
	}
	
	public int restar(int min, int sus){
		return min - sus;
	}
	
	public double dividir(int dividendo, int divisor) {
		return (double) dividendo / (double) divisor;
	}
	
	public double computarExpresion(String expression) throws BadOperatorException {
		Parseador parseador = new Parseador();
		int operador = parseador.primerOperando(expression);
		int operador1 = parseador.segundoOperador(expression);
		
		switch(parseador.obtenerElOperador(expression)) {
			case "+":{
				return sumar(operador, operador1);
			}
			case "*":{
				return multiplicar(operador, operador1);
			}
			case "-":{
				return restar(operador, operador1);
			}
			case "/":{
				System.out.println(dividir(operador, operador1));
				return dividir(operador, operador1);
			}
			default:{
				throw new BadOperatorException("Error 01, La operacion que intenta realizar no es válida");
			}
		}
	}
}

