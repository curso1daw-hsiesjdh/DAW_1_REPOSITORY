
public class Wrappers {
	public static Integer[] arrayInteger = new Integer[20];
	
	public static void main(String[] args) {
		rellenarArray();
		System.out.println("---Array sin ordenar---");
		imprimirArray();
		ordenarArray();
		System.out.println("\n---Array ordenada---");
		imprimirArray();
		int valorABsucar = 10;
		if (busquedaBinaria(valorABsucar) == -1) {
			System.out.println("No se encuentra el valor: " + valorABsucar + " en la array");
		} else {
			System.out.println("Se ha encontrado el valor: " + valorABsucar + " en la posicion " + busquedaBinaria(valorABsucar));
		}
	}
	
	//Funcion para rellenar la array con Integer aleatorios de el 1 al 19
	public static void rellenarArray() {
		for(int contador = 0; contador < arrayInteger.length;contador++) {
			arrayInteger [contador] = new Integer ((int) (Math.random()*20));
		}
	}
	
	//Funcion para ordenar la array con metodo burbuja de menor a mayor
	public static void ordenarArray() {
		Integer aux;
		for (int contador = 0; contador < arrayInteger.length;contador++) {
			for (int c = 0; c < arrayInteger.length;c++) {
				if ( c + 1 < arrayInteger.length && arrayInteger[c] > arrayInteger[c+1]) {
					aux = arrayInteger[c];
					arrayInteger[c] = arrayInteger[c+1];
					arrayInteger[c+1] = aux;
				}
			}
		}
	}
	
	//Funcion para imprimir por pantalla la array
	public static void imprimirArray() {
		System.out.print("\nArray: ");
		for (int contador = 0; contador < arrayInteger.length;contador++) {
			System.out.print(arrayInteger[contador] + " ");
		}
		System.out.println("");
	}
	
	//Funcion de busqueda binaria
	public static int busquedaBinaria(int aBuscar) {
		int inicio = 0;
		int fin = arrayInteger.length - 1;
		int posicion = 0;
		while (inicio <= fin) {
			posicion = (inicio + fin) / 2;
			if (arrayInteger[posicion].equals(Integer.valueOf(aBuscar))) {
				return posicion;
			} else if (arrayInteger[posicion] > Integer.valueOf(aBuscar)) {
				fin = posicion - 1;
			} else {
				inicio = posicion + 1;
			}
		}
		return -1;
	}

}
