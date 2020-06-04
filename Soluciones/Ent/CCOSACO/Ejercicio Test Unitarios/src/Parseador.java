
public class Parseador {
	
	public int primerOperando(String expression) throws BadOperatorException {
		String[] operacion = expression.split("\\" + obtenerElOperador(expression));
		return Integer.parseInt(operacion[0].trim());
	}
	
	public int segundoOperador(String expression) throws BadOperatorException {
		String[] operacion = expression.split("\\" + obtenerElOperador(expression));
		return Integer.parseInt(operacion[1].trim());
	}
	
	public String obtenerElOperador(String expression) throws BadOperatorException{
		if(expression.indexOf(" + ") > 0) { // Operador Suma
			return " + ";
		}else if(expression.indexOf( " - ") > 0) { // Operador Resta
			return " - ";
		}else if(expression.indexOf(" * ") > 0) { // Operador Multiplicación
			return " * ";
		}else if(expression.indexOf(" / ") > 0) { // Operador Division
			return " / ";
		}else {
			throw new BadOperatorException("Error 02, El operador no ha sido válido.");
		}
	}
}