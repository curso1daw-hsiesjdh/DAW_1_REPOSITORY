package Ejercicio1;

public class Ordenacion {
	
    public static void binaria( Integer [] arr, Integer numero) {
    	
    	Integer inicio = new Integer(0);
    	Integer fin = arr.length - 1;
    	Integer pos;
    	while (inicio <= fin) {
    			pos = (inicio+fin) / 2;
    		if ( arr[pos] == numero ) {
    			System.out.println("El numero esta en la posicion: " + pos);
    			break;
    		}
    		else if ( arr[pos] < Integer.valueOf(numero)) {
    			inicio = pos+1;
    		}else{
    			fin = pos-1;
    			}
    		}
    	
    	mostrarArray(arr);
    }
    
    public static void burbuja( Integer [] arr, Integer numero) {
    	
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
		mostrarArray(arr);
    }
    
	public static void mostrarArray(Integer [] arr) {
	for(int i = 0; i<arr.length;i++){
		System.out.print(arr[i]+"-");
	}
	}
	
	public static void main(String[]arg) {
		
		Integer numero = new Integer(11);
		Integer []arr = new Integer[10];
		
		System.out.println("array sin ordenar: ");
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*18)+1;
		}
		mostrarArray(arr);	
		
		System.out.println();
		System.out.println("el array ordenado :");
		burbuja(arr, numero);
		
		System.out.println();
		
		binaria(arr, numero);
		
		
	}
	

	
}
	

