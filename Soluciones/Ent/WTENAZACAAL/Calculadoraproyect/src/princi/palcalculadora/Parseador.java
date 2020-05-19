package princi.palcalculadora;

public class Parseador {
	
	
	public int obtenerPrimerOperando(String expresion) {
		return Integer.parseInt(expresion.trim().split(" ")[0]);		
	}
	public int obtenerSegundoOperando(String expresion) {
		return Integer.parseInt(expresion.trim().split(" ")[2]);

	}
	public String obtenerOperador(String expresion) {
		return expresion.trim().split(" ")[1];
	}
}
