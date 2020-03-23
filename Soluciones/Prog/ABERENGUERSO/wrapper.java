public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] v = new Integer[20];
		
		numerosAleatorios(v);
		imprimirPorPantalla(v);
		System.out.println();
		ordenarArray(v);
		imprimirPorPantalla(v);
		System.out.println("\nse encuentra en la posicion " + busquedaBinaria(v, 3));
	}
	
	public static void numerosAleatorios(Integer[] a){             //Función donde crea los numeros aleatorios de la array
		for(int i = 0; i < a.length; i++){
			int aleatorio = (int)(Math.random()* (100 + 1));
			a[i] = aleatorio;
		}
	}
	
	public static void ordenarArray(Integer[] a){               //Funcion donde ordena los numero de la array de mayor a menor utilizando el método burbuja, el cual consiste en comparar 2 posicion de la array y intercambiarlas si fuese necesario para la ordenación.
		int aux = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = a.length - 1; j > 0; j--){
				if(a[j] > a[j - 1]){
					aux = a[j - 1];
					a[j - 1] = a[j];
					a[j] = aux;
				}
			}
		}
	}
	
	public static int busquedaBinaria(Integer[] a, Integer b){     //Funcion de busqueda la cual va dividiendo la array por la mitad hasta encontrar la posicion en la que se encuentea el numero que buscamos, en caso de no encontrarse en la array, devuelve -1
		int inicio = 0;  
		int fin = (a.length - 1);
		int pos = 0;
		while(inicio <= fin){
			pos = (inicio + fin) / 2;
			if(a[pos] == b){
				return pos;
			}else if(a[pos] > b){
				inicio = pos + 1;
			}else{
				fin = pos - 1;
			}
		}
		return -1;
	}
	
	public static void imprimirPorPantalla(Integer[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

}
