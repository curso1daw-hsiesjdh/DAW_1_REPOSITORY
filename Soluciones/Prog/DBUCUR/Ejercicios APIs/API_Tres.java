public class API_Tres {
	public static void main(String[] args) {
		//Creo la cadena de texto que pide el enunciado
		//usando 'StringBuilder' y trabajo con él.
		StringBuilder strB = new StringBuilder("Hello Java world.");
		
		//RESOLUCIÓN DE EJERCICIOS
		
		// 1.

		System.out.println("1. " + strB.delete(strB.indexOf("J"), strB.lastIndexOf(" ")));

		// 2.

		System.out.println("2. " + strB.insert(6, "my"));

		// 3.

		System.out.println("3. " + strB.append(" I am Dorian."));

		// 4.

		System.out.println("4. " + strB.replace(strB.indexOf("D"), strB.lastIndexOf("."), "Bucur"));

		// 5.

		System.out.println("5. " + new StringBuilder(strB.substring(0, 5)).reverse());

	}
}