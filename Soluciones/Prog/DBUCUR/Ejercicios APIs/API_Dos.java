public class API_Dos {
	private static String toReverse(String string) {
		
		//La funci�n 'toCharArray()' puede ser �til ya que convierte una cadena
		//en un array de chars.
		char[] array = string.toCharArray();
		string = "";
		for (int i = array.length - 1; i >= 0; i--) {
			string += array[i];
		}
		return string;
	}

	public static void main(String[] args) {

		// Funci�n que muestra al rev�s una cadena de texto escrita por par�metro.
		System.out.println(toReverse("Ejercicio dos de APIs Java."));

	}
}