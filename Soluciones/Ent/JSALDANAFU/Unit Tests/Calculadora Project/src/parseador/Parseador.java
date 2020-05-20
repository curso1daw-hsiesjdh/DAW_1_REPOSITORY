package parseador;

public class Parseador {
	public int obtenerPrimerOperando(String expresion) {
		int primerOperando =  Integer.parseInt(expresion.trim().split(" ")[0]);
		return primerOperando;
	}
	
	public int obtenerSegundoOperando(String expresion) {
		int segundoOperando =  Integer.parseInt(expresion.trim().split(" ")[2]);
		return segundoOperando;
	}
	
	public String obtenerOperador(String expresion) {
		String operador = expresion.trim().split(" ")[1];
		return operador;
	}
}
