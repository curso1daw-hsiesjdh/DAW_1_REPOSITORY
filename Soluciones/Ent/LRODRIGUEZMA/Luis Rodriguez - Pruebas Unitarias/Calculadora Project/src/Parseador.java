
public class Parseador {
	
	public int obtenerPrimerOperando(String expresion) throws BadOperatorException {
		String[] operacion = expresion.split("\\" + obtenerOperador(expresion));
		return Integer.parseInt(operacion[0].trim());
	}
	
	public int obtenerSegundoOperador(String expresion) throws BadOperatorException {
		String[] operacion = expresion.split("\\" + obtenerOperador(expresion));
		return Integer.parseInt(operacion[1].trim());
	}
	
	public String obtenerOperador(String expresion) throws BadOperatorException{
		if(expresion.indexOf("+") > 0) {
			return "+";
		}else if(expresion.indexOf("-") > 0) {
			return "-";
		}else if(expresion.indexOf("*") > 0) {
			return "*";
		}else if(expresion.indexOf("/") > 0) {
			return "/";
		}else {
			throw new BadOperatorException("Error! El operador no es válido");
		}
	}
}