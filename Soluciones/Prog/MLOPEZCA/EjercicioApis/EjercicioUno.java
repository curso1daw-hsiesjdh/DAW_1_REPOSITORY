package marielysAPIsJava;

public class EjercicioUno {
	static String str = "Me gusta programar en Java.";

	public static void main(String[] args) {
		// A) Obtener longitud de la cadena de car�cteres:

		System.out.println("A) Length= " + str.length());

		// B) Obtener el car�cter que ocupa la posici�n 5ta:

		System.out.println("B) Car�ter en posici�n 5= " + str.charAt(5));

		// C) Obtener sub-cadena desde la posici�n 21 hasta el final:

		System.out.println("C) Desde el 21 al final= " + str.substring(21));

		// D) Obtener la sub-cadena indicada por los indices 8 y 16:

		System.out.println("D) Desde el 8 hasta el 16= " + str.substring(8, 16));

		// E) Muestra por pantalla el resultado de la cadena "(Casi siempre)":

		String strDos = str.concat("(Casi siempre)");
		System.out.println("E) Concatenar (Casi siempre)= " + strDos);

		// F) En la nueva cadena obtenida en E), recupera pa posici�n de la cadena
		// "Casi":

		System.out.println("F) Posici�n de Casi= " + strDos.indexOf("Casi"));

		// G) Muestra por pantalla la cadena de caracteres original en may�scula:

		String strUpper = str.toUpperCase();
		System.out.println("G) May�sculas= " + strUpper);

		// H) Compara la cadena de caracteres ocriginal conla cadena de caracteres en
		// may�sculas

		// 1= Tomando en cuenta las may�sculas y min�sculas:

		System.out.println("H 1/2) Comparar dos cadenas con case sensitive= " + str.equals(strUpper));

		// 2= Sin tomar en cuenta las may�sculas y min�sculas:

		System.out
				.println("H 2/2) Comparar dos cadenas ignorando el case sensitive= " + str.equalsIgnoreCase(strUpper));

	}

}
