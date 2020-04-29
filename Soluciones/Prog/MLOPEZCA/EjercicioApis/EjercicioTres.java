package marielysAPIsJava;

public class EjercicioTres {

	public static void main(String[] args) {
		// Trabajando desde la API de StringBuilder y partiendo de
		// la cadena de caracteres "Hello Java world.":

		StringBuilder strB = new StringBuilder("Hello Java world.");

		// 1. Elimina la cadena de caracteres "Java":

		System.out.println("1.= " + strB.delete(strB.indexOf("J"), strB.lastIndexOf(" ")));

		// 2. Insertar "my" en la posición 6:

		System.out.println("2.= " + strB.insert(6, "my"));

		// 3. Añadir "I am Marielys" al final de la cadena:

		System.out.println("3.= " + strB.append(" I am Marielys."));

		// 4. Sustituir el nombre por el apellido:

		System.out.println("4.= " + strB.replace(strB.indexOf("M"), strB.lastIndexOf("."), "López"));

		// 5. Obtener una nueva cadena con la subcadena desde 0 a 5 y hacer el reverso:

		System.out.println("5.= " + new StringBuilder(strB.substring(0, 5)).reverse());

	}

}
