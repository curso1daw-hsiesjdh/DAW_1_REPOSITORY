package pruebas;

public class Wrapper {


	static Integer [] numerosAleatorios = new Integer [20];

	//Con esta función creo un número aleatorio que se almacenará en el array.
	public static Integer [] array() {
		for(Integer i = new Integer (0); i < numerosAleatorios.length ;i++) {
			numerosAleatorios[i] = (int) (Math.random()* (20-1+1) + 1);
			System.out.print(numerosAleatorios[i] +" ,");
		}System.out.println(" ");
		return numerosAleatorios;
	}

	//Con esta función ordeno de menor a mayor el array anterior.
	public static void burbuja() {
		for (Integer i = new Integer (0); i < numerosAleatorios.length; i++) {
			for (Integer j = new Integer (0); j < numerosAleatorios.length -1 ; j++) {
				if (numerosAleatorios[j] > numerosAleatorios[j + 1]) {
					Integer tmp = new Integer (numerosAleatorios[j + 1]) ;
					numerosAleatorios[j + 1] = numerosAleatorios[j];
					numerosAleatorios[j] = tmp;

				}
			}
		}
		for (Integer i = new Integer (0); i < numerosAleatorios.length; i++) {
			System.out.print(numerosAleatorios[i] + " .");
		}
	}



	//Con esta función busco la posicion del valor que quiera.
	public static Integer busquedaBinaria(Integer vector[], Integer dato) {
		Integer n = vector.length;
		Integer centro, inf = 0, sup = n - 1;
		while (inf <= sup) {
			centro = (sup + inf) / 2;
			if (vector[centro] == dato)
				return centro;
			else if (dato < vector[centro]) {
				sup = centro - 1;
			} else {
				inf = centro + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		array();
		burbuja();
		Integer valorBuscado = new Integer (1);
		System.out.println("Se encuentra en la posición sino devolverá -1: " + busquedaBinaria(numerosAleatorios, valorBuscado));
	}
}
