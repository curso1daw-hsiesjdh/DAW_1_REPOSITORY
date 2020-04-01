package EjercicioWrap;
import java.util.Scanner;
// TODO: Auto-generated Javadoc

/**
 * The Class BusquedaBinaria.
 */
public class BusquedaBinaria {
	//Bienvenido al programa de ordenamiento burbuja y busqueda binaria
	//Usaremos esta clase de ejemplo para trabajar con Clases Wrappers
	//En esta ocasión cambiaremos todos los primitivos int por clases Interger
	
	/** The arreglo V. */
	private static Integer[] arregloV = new Integer [20];          //lo primero que hago es declarar un arreglo a nivel de clase para usarlo en las tres funciones

	/** The valor buscado. */
	private static Integer valorBuscado;
	
	/**
	 * Instantiates a new busqueda binaria.
	 */
	public BusquedaBinaria() {
		valorBuscado=(int)Math.floor(Math.random()*100);
	}
	
	/**
	 * Instantiates a new busqueda binaria.
	 *
	 * @param valorBuscado the valor buscado
	 */
	public BusquedaBinaria(Integer valorBuscado) {
		this.valorBuscado=valorBuscado;
	}
	
	/**
	 * Arreglo original.
	 *
	 * @return the integer[]
	 */
	private static Integer [] arregloOriginal() {
		
		for(int i = 0; i<arregloV.length; i++) {            
			arregloV[i]= (int)Math.floor(Math.random()*100);//para que sean aleatorios uso el metodo Math.random y para que sean numeros del 0 al 100
		}
		
		return arregloV;
	}
	
	/**
	 * Algoritmo burbuja.
	 *
	 * @return the integer[]
	 */
	private static Integer[] algoritmoBurbuja() { //Esta funcion ordena el arreglo 
		
		int apuntadorDos = 1;
		int auxiliar = 0;
		
		for(int i = 0; i < arregloV.length; i++) {
			
			for(int apuntadorUno = 0; apuntadorUno < arregloV.length; apuntadorUno++) {
				
				if(apuntadorDos < arregloV.length) {
					
					if(arregloV[apuntadorUno] > arregloV[apuntadorDos]) {
						
						auxiliar = arregloV[apuntadorUno];
						
						arregloV[apuntadorUno] = arregloV[apuntadorDos];
						
						arregloV[apuntadorDos] = auxiliar;
					}
					
					apuntadorDos++;
				}
					
			}
			apuntadorDos = 1;
		}
		return arregloV;
	}
	
	/**
	 * Busqueda binaria.
	 *
	 * @return the integer
	 * @throws BusquedaException the busqueda exception
	 */
	private static Integer busquedaBinaria() throws BusquedaException{
		Integer[] arregloV=algoritmoBurbuja();
		if(valorBuscado>100) {														//si el numero que entra por parametro es mayor al limite de los valores del array entonces se sale
			throw new BusquedaException("Lo sentimos, el numero es mayor al permitido");
		}
		
		Integer apuntadorInicio= new Integer(0);
		Integer apuntadorFinal= new Integer(arregloV.length);
		Integer apuntadorPuntoMedio= new Integer(0);
		Integer valorEncontrado= -1;													//le doy un valor negativo porque no existe la posicion del array -1 y así puedo saber si no se ha encontrado el valor
		
		if(valorBuscado>100) {														//si el numero que entra por parametro es mayor al limite de los valores del array entonces se sale
			throw new BusquedaException("Lo sentimos, el numero es mayor al permitido");
		}

		for(int i = 0; i < arregloV.length; i++) {										//el for nos permitirá dar tantas vueltas como sean necesarias hasta encontrar el valor

			apuntadorPuntoMedio= (apuntadorInicio+apuntadorFinal)/2;										//aquí posicionamos el apuntador PuntoMedio en su posición correspondiente con cada vuelta del bucle
																						//el apuntador puntomedio es el que descubre el valor y los otros dos lo ayudan a llegar 
			if(valorBuscado == arregloV[apuntadorPuntoMedio]) {									//cuando el apuntadorPM encuentra el valor buscado entonces alojamos la posicion el el valorEncontrado que será el que retornará
				valorEncontrado = apuntadorPuntoMedio;
			} else 
				if(valorBuscado > arregloV[apuntadorPuntoMedio]){								//cuando el valorBuscado sea mayor al valor que está en la posicion de apuntador el apuntador1 se moverá hasta la posicion del apuntadorPM + 1
					apuntadorInicio= apuntadorPuntoMedio++;
				} else 
					if(valorBuscado < arregloV[apuntadorPuntoMedio]) {							//cuando el valorBuscado sea menor al valor que está en la posicion de apuntador el apuntador2 se moverá hasta la posicion del apuntadorPM - 1
						apuntadorFinal= apuntadorPuntoMedio--;
					} 

			if(apuntadorPuntoMedio < 0) {															//es posible que despues de la operacion (apuntador1+apuntador2)/2 el apuntadorPM tenga un valor menor a 0 y dará un error al tratar de acceder al array en una posición que no existe 
				throw new BusquedaException("Lo sentimos, el numero no fue encontrado");
			}
		}

		if(valorEncontrado == -1) {// en un principio la variable valorEncontrado vale -1 porque en el array no existe la posición -1 y así podemos comprobar cuando no se encontró el valorBuscado
			throw new BusquedaException("Lo sentimos, el numero no fue encontrado");
		}

		return valorEncontrado;
	}

	

	/**
	 * Imprimir datos busqueda binaria.
	 *
	 * @throws BusquedaException the busqueda exception
	 */
	public void imprimirDatosBusquedaBinaria() throws BusquedaException {
		
		System.out.println("***********************************************************");
		System.out.println("*****Bienvenido al programa de ordenamiento y busqueda*****");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("El valor buscado es: " + valorBuscado);
		System.out.println("");
		
		System.out.println("Los numeros desordenados son: ");
		Integer[] arregloDesordenado=(arregloOriginal());
		for(Integer indice = new Integer(0); indice < arregloDesordenado.length; indice++) {
			
			System.out.print("[" + arregloDesordenado[indice] + "]");
		}
		System.out.println("");
		System.out.println("Los numeros ordenados son: ");
		Integer[] arregloOrdenado= algoritmoBurbuja();
		for(Integer indice = new Integer(0); indice < arregloOrdenado.length; indice++) {
			
			System.out.print("[" + arregloOrdenado[indice] + "]");
		}
		
		System.out.println("");
		System.out.println("");
		
		if(busquedaBinaria()<0) {
			System.out.println("El valor no fue encontrado");
		}else {
			System.out.println("Valor encontrado en la posición:" + busquedaBinaria());
		}
		
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		try{
			BusquedaBinaria test= new BusquedaBinaria(30);
			test.imprimirDatosBusquedaBinaria();
		}
		catch (BusquedaException e){

			System.out.println(" ");
			System.out.println(e.getMessage());
		}
	}
	


}
