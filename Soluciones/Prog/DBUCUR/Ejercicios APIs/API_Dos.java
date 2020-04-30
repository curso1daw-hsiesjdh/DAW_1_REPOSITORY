public class API_Dos {
	private static String toReverse(String string) {
		
		//La función 'toCharArray()' puede ser útil ya que convierte una cadena
		//en un array de chars.
		char[] array = string.toCharArray();
		string = "";
		for (int i = array.length - 1; i >= 0; i--) {
			string += array[i];
		}
		return string;
	}

	public static void main(String[] args) {

		// Función que muestra al revés una cadena de texto escrita por parámetro.
		System.out.println(toReverse("Ejercicio dos de APIs Java."));

	}
}