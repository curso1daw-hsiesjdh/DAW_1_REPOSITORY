
public class ClasesWrapper {
	
	static void rellenarArray(Integer[] array){
		for(int i = 0; i < array.length; i++){
			array[i] =  new Integer ((int) (Math.random()*20));
		}
	}
	
	static void ordenarArray(Integer[] array){
		int aux = 0;
		for(int i = 0; i < array.length; i++){
			for(int j = array.length - 1; j > 0; j--){
				if(array[j] > array[j - 1]){
					aux = array[j - 1]; 				
					array[j - 1] = array[j];
					array[j] = aux;
				}
			}
		}
	}
	
	static void escribirArrayAntes(Integer[] array){
		System.out.print("\nArray ordenada: ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "  ");
		}
	}
	
	static void escribirArrayDespues(Integer[] array){
		System.out.print("\nArray no ordenada: ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "  ");
		}
	}
	
	static int buscarBinaria(Integer[] array, Integer valor){
		int inicio = 0;
		int fin = array.length - 1;
		int pos = 0;
		while(inicio <= fin){
			pos = (inicio + fin) / 2;
			if(array[pos].equals(valor)) return pos;
			else if(array[pos] > valor) inicio = pos + 1;
			else fin = pos - 1;
		}
		return - 1;
	}
	
	public static void main(String[] args) {
		Integer[] array = new Integer[20];
		Integer valor = 10;
		
		rellenarArray(array);
		escribirArrayAntes(array);
		ordenarArray(array);
		escribirArrayDespues(array);

		System.out.print("\nEn la búsqueda binaria ");
		if(buscarBinaria(array, valor) < 0) System.out.print("el valor " + valor + " no se encuentra en el array.");
		else System.out.print("el valor " + valor + " está en array[" + buscarBinaria(array, valor) + "]");
		
	}
	
}
