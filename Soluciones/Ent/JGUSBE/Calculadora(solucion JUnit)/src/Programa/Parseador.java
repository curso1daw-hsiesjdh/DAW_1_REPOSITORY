package Programa;

public class Parseador {

	// (x + y =) Y (x+y=) 
	
	
	public String obtenerOperador (String expresion) {
		
		//Busca el operador de la ecuacion y la funcion indexof dice la posicion, si lo que devuelve es mayor a 0 sera el operador.
		
		String operadorDeLaEcuacion = "+";
		if (expresion.indexOf("-")>0) {
		operadorDeLaEcuacion = "-";
		}
		
		if (expresion.indexOf("/")>0) {
			operadorDeLaEcuacion = "-";
		}
		
		if (expresion.indexOf("*")>0) {
			operadorDeLaEcuacion = "-";
		}
		
		return operadorDeLaEcuacion;
	}
	
	
	public Integer obtenerPrimerOperando (String expresion) {
		
		String[] ecuacion2 = expresion.split("=");

		String operador = obtenerOperador(expresion);

		String[] partes1 = ecuacion2[0].split("\\"+operador);

		return Integer.valueOf(partes1[0].trim());
			
	}
public Integer obtenerSegundoOperando (String expresion) {
		
		String[] ecuacion2 = expresion.split("=");

		String operador = obtenerOperador(expresion);

		String[] partes1 = ecuacion2[0].split("\\"+operador);

		return Integer.valueOf(partes1[1].trim());
			
	}
	
	
}
