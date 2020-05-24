
public class Parseador {
	String [] arrayOperadores = new String [2];
	public int obtenerPrimerOperando(String expresion) throws BadOperatorException{
		arrayOperadores = expresion.split("\\"+obtenerOperador(expresion));
		return Integer.parseInt(arrayOperadores[0].trim());
	}
	
	public int obtenerSegundoOperando(String expresion){
		return Integer.parseInt(arrayOperadores[1].trim());
	}
	
	public String obtenerOperador(String expresion) throws BadOperatorException{
		if (expresion.indexOf("+") > 0) {
			return "+";
		}else if (expresion.indexOf("-") > 0) {
			return "-";
		}else if (expresion.indexOf("/") > 0) {
			return "/";
		}else if (expresion.indexOf("*") > 0) {
			return "*";
		}else {
			throw new BadOperatorException("No hay operador");
		}
	}
}
