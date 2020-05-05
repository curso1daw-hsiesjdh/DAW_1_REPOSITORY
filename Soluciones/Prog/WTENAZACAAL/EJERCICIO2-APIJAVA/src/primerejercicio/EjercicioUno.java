package primerejercicio;


/**
 * 
 * @author Annunaki-david-tenezaca
 * @version 1.0
 */
public class EjercicioUno {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		 String texto_definido = new String ("Me gusta programar en Java");
		 
		 String pregunta_e = texto_definido.concat(" Casi siempre "); // CADENA DE CARACTERES CON CONCATENACION 
		 String pregunta_g = texto_definido.toUpperCase(); //CADENA DE CARACTERES EN MAYUSCULA
		 int pregunta_h_mayus = texto_definido.compareTo(pregunta_g);
		 int pregunta_h_igmayus = texto_definido.compareToIgnoreCase(pregunta_g);
		 
		 System.out.println("A) OBTENER LA LONGITUD DE LA CADENA DE CARACTERES");
		 
		 System.out.println("	La longitud de la cadena de caracteres es: " + texto_definido.length());
		 System.out.println("B) OBTENER EL CARACTER QUE OCUPA LA POSCION 5ª");
		 System.out.println("	El caracter que ocupa la posicion quinta es: " + texto_definido.charAt(5));
		 System.out.println("C) OBTENER LA SUB-CADENA DESDE LA POSICION 21 HASTA EL FINAL");
		 System.out.println("	La sub-cadena de la posicion 21 hasta el final es: " + texto_definido.substring(21));
		 System.out.println("D) OBTENER LA SUB-CADENA INDICADA POR LOS INDICES 8 Y 16");
		 System.out.println("	La subcadena desde la posicion 8 y 16 es: " + texto_definido.substring(8,16));
		 System.out.println("E) MUESTRA POR PANTALLA EL RESULTADO DE CONCATENAR LA CADENA " + "(Casi siempre)");
		 System.out.println("	El resultado de la concatenacion es : " + pregunta_e);
		 System.out.println("F) EN LA NUEVA CADENA DE CARACTERES OBTENIDA EM E), RECUPERAR LA POSICION DE LA CADENA CASI");
		 System.out.println("	La posicion de la cadena Casi es: " + pregunta_e.indexOf("Casi"));
		 System.out.println("G) MUESTRA POR PANTALLA LA CADENA DE CARACTEREES ORIGINAL EN MAYUSCULAS");
		 System.out.println("	La cadena de caracteres original en mayusculas es: " + pregunta_g);
		 System.out.println("H) COMPARA LA CADENA DE CARACTERES ORIGINAL CON LA CADENA DE CARACTERES EN MAYUSCULAS. PRIMERO TENIENDO EN CUENTA LA DIFERENCIA ENTRE MAYUSCULA Y MINUSCULAS Y POR ULTIMO IGNORANDO ESTA DIFERENCIA");
		 System.out.println("	La comparacion con diferencias es: " + pregunta_h_mayus);
		 System.out.println("	La comparacion ignorando mayus es : " + pregunta_h_igmayus );
	}

}
