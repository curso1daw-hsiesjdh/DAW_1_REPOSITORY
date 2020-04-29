
public class TerceraEv_Wrappers_PHERRANZCA {
	
	static Integer []vBurbuja = new Integer [15]; //Creamos un array con 15 posiciones (de momento vacías)
	
	public static void RandomArray() {

		System.out.print("El array desordenado:	");
		
		//Rellenamos el array con números aleatorios del 0 al 50 (por es ponemos 51)
		
		for(int i = 0; i < vBurbuja.length; i++){ 
			vBurbuja[i] = (int) (Math.random()*51);
			System.out.print(vBurbuja[i]);
			if(i == vBurbuja.length - 1) {
				System.out.print("\n");
			}else {
				System.out.print(", ");
			}
		}
	}

	public static void BubbleSort() {
		
		//Creamos una variable auxiliar para almacenar información al hacer el "swap"
		
		int aux;
		
		//Llamamos a la función RandomArray para poder utilizar en este método el Array que acabamos de crear
		
		RandomArray();
		
		//Hacemos el ordenamiento burbuja
		
		for (int i = 0; i < vBurbuja.length - 1; i++) {
			for(int j = i + 1; j < vBurbuja.length; j++) {
				if(vBurbuja[i] > vBurbuja[j]) {
					aux = vBurbuja[i];
					vBurbuja[i] = vBurbuja[j];
					vBurbuja[j] = aux;
				}
			}
		}
		
		//Mostramos el array ordenado
		
		System.out.print("El array ordenado:	");
		
		for(int i = 0; i < vBurbuja.length; i++) {
			System.out.print(vBurbuja[i]);
			if(i == vBurbuja.length - 1) {
				System.out.print("\n");
			}else {
				System.out.print(", ");
			}
		}
	}

	
	public static int BinarySearch(Integer x) {
		BubbleSort();
		Integer n = vBurbuja.length;
		
		//Declaramos las variables que serán los punteros del array: inferior, superior y centro
		Integer i = 0;
		Integer s = n-1;
		Integer c;
		
		while(i <= s){
			c = (i + s) / 2;
			if(vBurbuja[c].equals(x))
				return c;
			else if (x < vBurbuja[c])
				s = c - 1;
			else
			i = c + 1;
		}
		
			return -1;
	}
	
	public static void main(String[] args) {
		
		Integer numeroABuscar = 27;
		Integer b = BinarySearch(numeroABuscar);
		
		if(b > 0)
			System.out.println("El número a buscar está en la posición " + b + " del array vBurbuja");
		else if (b < 0 || numeroABuscar <= 0)
			System.out.println("El número no se ha generado, o estás buscando un número negativo. Prueba otra vez.");
		
	}

}
