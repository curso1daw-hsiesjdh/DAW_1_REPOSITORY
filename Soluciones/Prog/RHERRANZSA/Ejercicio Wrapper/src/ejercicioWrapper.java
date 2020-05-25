
public class ejercicioWrapper {
	
	/**
	 * 
	 * @param a Parametro el cual se utiliza para que la funcion lo llene de números aleatorios
	 */
	public static void creacionNumeros(Integer [] a){
		
		for(int i=0;i<a.length;i++) {
			
			a[i]=(int)(Math.random()*100);
		}
	}
	/**
	 * 
	 * @param a Parametro el cual se utiliza para que la funcion lo ordene
	 */
	public static void ordenarArray(Integer [] a) {
		
		int aux=0;
		 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]<a[i]) {
					
					aux = a[i];
					a[i]= a[j];
					a[j] = aux;
				}
			}
		}
	}
	
	/**
	 * 
	 * @param a Parametro que se utiliza para añadir un array con numeros ordenados
	 * @param num Parametro que se utiliza para que la funcion busque ese numero en el array ordenado
	 * @return nos devuelve la posición del número seleccionado en el parametro num y en caso de no encontrarlo nos devuelve -1
	 */
	public static int busquedaBinaria(Integer[] a, Integer num){    
		int inicio = 0;  
		int fin = (a.length - 1);
		int posicion = 0;
		while(inicio <= fin){
			posicion = (inicio + fin) / 2;
			if(a[posicion] == num){
				return posicion;
			}else if(a[posicion] > num){
				inicio = posicion + 1;
			}else{
				fin = posicion - 1;
			}
		}
		return -1;
	}
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		Integer [] numeros = new Integer[20];
		
		creacionNumeros(numeros);
		
		for(int i=0;i<numeros.length;i++) {
			
			System.out.print(numeros[i] + " ");
			}
		
		System.out.println();
		
		ordenarArray(numeros);
		
		for(int i=0;i<numeros.length;i++) {
			
			System.out.print(numeros[i] + " ");
			}
		System.out.println();
		System.out.println("se encuentra en la posicion " + busquedaBinaria(numeros,48));
		

		
	}

}
