package marielysAPIsJava;

public class EjercicioDos {

	private static String toReverse(String cadena) {
		char[] array = cadena.toCharArray();
		cadena = "";
		for (int index = array.length - 1; index >= 0; index--) {
			cadena += array[index];
		}
		return cadena;
	}

	public static void main(String[] args) {

		// Desarrollar una funci�n que haga el reverso de una cadena
		// de caracteres que se suministre por par�metro:
		System.out.println(toReverse("Dile no al nuevo orden mundial"));

		// la utilidad del objeto String que es muy �til
		// para hacer el reverse es toCharArray();

	}

}
