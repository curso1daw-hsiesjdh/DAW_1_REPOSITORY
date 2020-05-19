
public class Parseador {

	public int obtenerPrimerOperando (String expresion) {
		String[] partes = expresion.split("\\" + obtenerOperador(expresion));
		
		return Integer.parseInt(partes[0].trim());
	}
	
	public int obtenerSegundoOperando (String expresion) {
		String[] partes = expresion.split("\\" + obtenerOperador(expresion));
		
		return Integer.valueOf(partes[1].trim());
	}
	
	public String obtenerOperador (String expresion) {		
		if (expresion.indexOf('+') > 0) {
			return "+";
		}else if (expresion.indexOf('*') > 0) {
			return "*";
		}else if (expresion.indexOf('-') > 0) {
			return "-";
		}else if (expresion.indexOf('/') > 0) {
			return "/";
		}else return "";
	}
}
