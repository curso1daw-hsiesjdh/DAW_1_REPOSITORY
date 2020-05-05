package segundoejercicio;

public class EjercicioDos {
	
	public static String reverso(String cadena) {
		StringBuilder builder = new StringBuilder(cadena);
		String cadena_invertida = builder.reverse().toString();
		return cadena_invertida;
	}
	
	public static String reverso_dos(String cadena) {
		String cadena_invertida = "";
		for (int i = cadena.length()-1; i >= 0 ; i--) {
			cadena_invertida = cadena_invertida + cadena.charAt(i);
		}
		return cadena_invertida;
	}
	public static void main(String[] args) {
		String cadena_reverso = reverso("Esto es una cadena invertida");
		String cade_reverso_dos = reverso_dos("Esto es una segunda cadena invertida");
		
		System.out.println(cadena_reverso);
		System.out.println(cade_reverso_dos);

	}

}
