package Ejercicio;

public class Clase_integer {
	
	public int numero_deseado; //cogera siempre el valor INT que estemos buscando, desde el main.
	
	private Integer integer_auxiliar =new Integer (0); //Variable privada, se necesitará en la ordenación burbuja
	
	private Integer num_buscado = new Integer((int) numero_deseado); //variable necesaria para la busqueda binaria
	
    private Integer burbuja[] = new Integer[20];   //Array que contiene todos los numeros
	

    
    
    public void darValorArray() {   //Rellenamos el Array con números aleatorios
    	
    	for(int x = 0; x<burbuja.length;x++) {
    		
			burbuja[x] = (int)(Math.random()*20)+1;
		}
    }
    
    
    
    public void interiorArray(Integer[] x) {     //Mostramos el contenido por pantalla
    	
    	for(int i = 0; i<x.length;i++){
    		
			System.out.print(x[i]+", ");
		}
    	
    }
	
    
    
	public void ordenacionBurbuja(Integer[] x) {      //Funcion que muestra el estado inicial del array y posteriormente el mismo ya ordenado
		
		System.out.println("Array sin ordenar:");
		System.out.println();
		interiorArray(burbuja);
		System.out.println();
		System.out.println("Array pasado por burbuja");
		System.out.println();
		
		for(int i = 0; i<x.length-1;i++) {     //Este FOR recorre el array entero
			for(int a = 0; a<x.length-1;a++) {   //Este FOR también irá recorriendo, pero cada vez que encuentre un numero inferior al que
				if(x[a]>x[a+1]) {                 // le sigue en el array, los intercambiará de posición, desplazando los mayores al final.
					integer_auxiliar = x[a];
					x[a] = x[a+1];
					x[a+1] = integer_auxiliar;
				    }
			    }
		    }
		interiorArray(burbuja);
	}
	
	public void busquedaBinaria(Integer[] x) {
		
		Integer superior = new Integer (x.length);
		Integer inferior = new Integer (0);
		Integer central = new Integer ((superior+inferior)/2);
		
		while(inferior <= superior) {
			
			if(x[central] == Integer.valueOf(num_buscado)) { //Compara si el punto central del array es el numero buscado
				
				System.out.println("Nuestro número deseado se encuentra en "+central);
				
				   break;
				
			}else if(x[central]<Integer.valueOf(num_buscado)) {  //Si hemos llegado aquí es que no lo era, ahora en función de si el
				                                                 //numero buscado es superior o inferior, reduciremos el tamaño del array.
				inferior = central +1;
				
			}else {
				
				superior = central -1;
			}
		}
		
	}
	
	
	
	
}
