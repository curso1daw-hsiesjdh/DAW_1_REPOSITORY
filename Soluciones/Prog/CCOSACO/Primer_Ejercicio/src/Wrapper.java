
public class Wrapper {
	
	static void rellenarArray (Integer[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = new Integer ((int) (Math.random()*20));
		}
	}
	
	static void metodoBurbuja (Integer[] array) {
		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > 0; j--){
				if (array[j] > array[j - 1]){
					aux = array[j - 1];
					array[j - 1] = array[j];
					array[j] = aux;
				}
			}
		}
	}
	
	static void mostrarArray(Integer[] array){
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}
	}
	
	static int busquedaBinaria (Integer[] array, Integer valor) {
		int prin = 0;
		int fin = array.length -1;
		int pos = 0;
		while (prin <= fin) {
			pos = (prin + fin) / 2;
			if (array[pos] == valor) return pos;
			else if (array[pos] > valor) prin = pos +1;
			else fin = pos -1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Integer[] array = new Integer[20];
		Integer valor = 10;
		
		rellenarArray(array);
		metodoBurbuja(array);
		mostrarArray(array);
		
		System.out.println();
		System.out.println("En la Busqueda Binaria: ");
		if(busquedaBinaria(array, valor) < 0) System.out.println("El valor: " +valor +" no se encuentra en el array.");
		else System.out.println("El valor " +valor +" se encuentra en la posicion: " +(busquedaBinaria(array, valor)));
	}
	
	
	

}
