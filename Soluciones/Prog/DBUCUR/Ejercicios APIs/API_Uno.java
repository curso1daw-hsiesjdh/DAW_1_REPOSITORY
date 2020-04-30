public class API_Uno {
	static String str = "Me gusta programar en Java.";

	public static void main(String[] args) {
		// A)

		System.out.println("A) Longitud = " + str.length() + " carácteres.");

		// B)

		System.out.println("B) Caráter que ocupa la posición 5ª = " + str.charAt(5));

		// C)

		System.out.println("C) Sub-cadena desde la posición 21 hasta el final =" + str.substring(21));

		// D)

		System.out.println("D) Sub-cadena indicada por los índices 8 y 16 = " + str.substring(8, 16));

		// E)

		String strDos = str.concat("(Casi siempre)");
		System.out.println("E) Concatenar '(Casi siempre)' = " + strDos);

		// F)

		System.out.println("F) Posición de Casi = " + strDos.indexOf("Casi"));

		// G)

		String strUpper = str.toUpperCase();
		System.out.println("G) Mayúsculas = " + strUpper);

		// H.1)

		System.out.println("H 1/2) Comparar dos cadenas con case sensitive= " + str.equals(strUpper));

		// H.2)

		System.out.println("H 2/2) Comparar dos cadenas ignorando el case sensitive= " + str.equalsIgnoreCase(strUpper));

	}

}