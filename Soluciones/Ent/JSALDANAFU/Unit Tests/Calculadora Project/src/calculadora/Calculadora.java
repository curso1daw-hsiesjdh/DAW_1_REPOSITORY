package calculadora;
import badOperatorException.BadOperatorException;
import parseador.Parseador;

public class Calculadora {
	
	public int sumar(int sumando1 ,int sumando2) {
		int suma = sumando1 + sumando2;
		return suma;
	}
	
	public int restar(int minuendo , int sustraendo) {
		int resta = minuendo - sustraendo;
		return resta;
	}
	
	public int multiplicar(int multiplicando1, int multiplicando2) {
		int multiplicacion = multiplicando1 * multiplicando2;
		return multiplicacion;
	}
	
	public double dividir(int dividendo , int divisor) throws BadOperatorException{
		if (divisor == 0) {
			throw new BadOperatorException("División por 0. No se puede realizar la operación de división.");
		} else {
			double cociente = (double)dividendo / divisor;
			return cociente;
		}
	}
	
	public double computarExpresion(String expresion) throws BadOperatorException{
		Parseador a = new Parseador();
		double resultado = 0.0;
		switch (a.obtenerOperador(expresion)) {
		case "+":
			resultado = sumar(a.obtenerPrimerOperando(expresion),a.obtenerSegundoOperando(expresion));
			break;
		case "-":
			resultado = restar(a.obtenerPrimerOperando(expresion),a.obtenerSegundoOperando(expresion));
			break;
		case "*":
			resultado = multiplicar(a.obtenerPrimerOperando(expresion),a.obtenerSegundoOperando(expresion));
			break;
		case "/":
			resultado = dividir(a.obtenerPrimerOperando(expresion),a.obtenerSegundoOperando(expresion));
			break;
		}
		return resultado;
	}
}
