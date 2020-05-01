package tercerejercicio;

public class EjercicioTres {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("Hello Java wolrd.");
		
		StringBuilder stb2 = new StringBuilder(stb.substring(0, 5));
		
		System.out.println("1. Eliminar la cadena de caracteres “ Java” y mostrar la cadena de caracteres del StringBuilder resultante. \n");
		System.out.println(stb.delete(6, 10) + "\n");
		
		System.out.println("2. Sobre el StringBuilder resultante del apartado anterior insertar la cadena “my ” en la posición 6.\n" + 
		"Mostrar la cadena de caracteres resultante. \n");
		System.out.println(stb.insert(6, new StringBuilder("my")) + "\n");
		
		System.out.println("3. Añadir al final de la cadena de caracteres del StringBuilder resultante del apartado 2 la cadena de \n" + 
		"caracteres: “ I am xxxx.”. Donde xxxx es mi nombre de pila. Mostrar la cadena de caracteres resultante. \n");
		System.out.println(stb.append("I am David") + "\n");
		
		System.out.println("4. En el StringBuilder del apartado anterior reemplazar vuestro nombre de pila por vuestro primer apellido \n");
		
		System.out.println(stb.replace(20, 25, "Tenezaca ") + "\n");
		
		System.out.println("5. Obtener la subcadena entre las posiciones 0 y 5, creando un nuevo StringBuilder con ella. Hacer el \n" + 
		"reverso de este nuevo substring y añadela de nuevo al StringBuilder del apartado 4 a partir de la \n" + 
		"posición 0. Mostrar la cadena de caracteres resultante.\r\n");
		System.out.println(stb2); // cadena obtenida de las posiciones 0 y 5 
		System.out.println(stb2.reverse()); // cadena invertida
		
		System.out.println(stb.insert(0, stb2)); // se añade el reverse de la cadena obteida a partir de las posiciones 0 y 5 
	}

}
