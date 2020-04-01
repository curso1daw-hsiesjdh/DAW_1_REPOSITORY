package ejercicios;

/**
 * @version 19/3/2020
 * @author Alejandro Cordero Diadosa
 *
 */
public class Ejercicio1 {

	
	public static void main(String[]arg) {
		Integer number = new Integer(8); // El número a buscar en el array
		// --------------------------------
	
		Integer []arr = new Integer[10];
		
// ------------------------------------------------------------------------------
		// Ordenación del array Burbuja
		System.out.println("array sin ordenar");
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*30)+1;
		}
		mostrarContenido(arr);
		
		System.out.println();
		System.out.println("array ordenado");
		Integer aux = new Integer(0);
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = 0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					aux = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = aux;
				}
			}
		}
		mostrarContenido(arr);
		
// ------------------------------------------------------------------------------
		//Busqueda de posición en el array del número
		Integer sup = new Integer(arr.length);
		Integer sub = new Integer(0);
		Integer mid;

		while(sub <= sup) {
			mid = (sub+sup)/2;
			if(arr[mid] == Integer.valueOf(number)) {
				System.out.println();
				System.out.println("el número buscado está en la posición "+mid);
				break;
			}else if(arr[mid]>Integer.valueOf(number)) {
				sup = mid -1;
			}else {
				sub = mid +1;
			}
		}
	}
	// función para escribir por pantalla los array
	public static void mostrarContenido(Integer arr[]) {
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+"/");
		}
	}
}
