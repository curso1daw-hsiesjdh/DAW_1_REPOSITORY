package EjercicioWrap;
public class BusquedaBinaria {

	public static int[] arregloV = new int [20];          //lo primero que hago es declarar un arreglo a nivel de clase para usarlo en las dos funciones

	static void ordenamientoBurbuja() {                     //en esta funcion relleno el arreglo con numeros aleatorios lo imprimo en pantalla, lo ordeno y lo imprimo ordenado
		System.out.println("Numeros aleatorios=");
		for(int i = 0; i<arregloV.length; i++) {            //con este for introduzco datos aleatorios en cada posicion del array
			arregloV[i]= (int)Math.floor(Math.random()*100);//para que sean aleatorios uso el metodo Math.random y para que sean numeros del 0 al 100
			System.out.print("["+arregloV[i]+"]");
		}

		int apuntadorDos = 1;                                //los el algoritmo de busqueda burbuja necesita dos apuntadores el primero está creado en el for externo y este es para el if que está en el for interno
		int auxiliar = 0;                                    //aquí alojaremos la el dato que vamos a intercambiar de posición 

		for(int i = 0; i < arregloV.length; i++) {                                   // con el for externo nos encargamos de dar tantas vueltas como posiciones tenga el array para así asegurarnos de comparar todas las posiciones y trasladarlas ha su lugar

			for(int apuntadorUno = 0; apuntadorUno < arregloV.length; apuntadorUno++) {// con el for interno vamos a dar vueltas comparando las posiciones secuencialmente

				if(apuntadorDos < arregloV.length) {								//para compararlas vamos a usar un if 

					if(arregloV[apuntadorUno] > arregloV[apuntadorDos]) {

						auxiliar = arregloV[apuntadorUno];							//y si se cumple la condicion alojaremos el valor más grande en una variable auxiliar

						arregloV[apuntadorUno] = arregloV[apuntadorDos];				//luego el valor más pequeño se aloja donde estaba el más grande 

						arregloV[apuntadorDos] = auxiliar;								//y el valor grande se aloja donde estaba el pequeño
					}

					apuntadorDos++;														//el apuntador que fue declarado externamente debe ir recorriendo más posiciones
				}

			}
			apuntadorDos = 1;															//el apuntador dos debe volver a su posición inicial luego de cada vuelta del primer for
		}
		System.out.println(" ");															//esto es solo algo estetico para presentar los datos de manera ordenada
		System.out.println(" ");
		System.out.println("Numeros ordenados=");
		for(int i = 0; i<arregloV.length; i++) {												//aquí imprimimos el arreglo ya ordenado
			System.out.print("["+arregloV[i]+"]");
		}
		System.out.println(" ");
		System.out.println(" ");


	}

	static int busquedaBinaria(int valorBuscado) throws BusquedaException {			// en esta funcion podremos buscar un valor que entra por parametro y devolvemos la posicion donde está
																					// al igual que el algoritmo burbuja necesitamos varios apuntadores en este caso tres apuntadores
		int apuntador1 = 0;															//el primero estará en el inicio
		int apuntador2 = arregloV.length;											//el segundo en el final del array
		int apuntadorPM = 0;														//el tercero en la posicion de la mitad entre el apuntador1 y apuntador2
		int valorEncontrado= -1;													//le doy un valor negativo porque no existe la posicion del array -1 y así puedo saber si no se ha encontrado el valor
		
		if(valorBuscado>100) {														//si el numero que entra por parametro es mayor al limite de los valores del array entonces se sale
			throw new BusquedaException("Lo sentimos, el numero es mayor al permitido");
		}

		for(int i = 0; i < arregloV.length; i++) {										//el for nos permitirá dar tantas vueltas como sean necesarias hasta encontrar el valor

			apuntadorPM= (apuntador1+apuntador2)/2;										//aquí posicionamos el apuntador PuntoMedio en su posición correspondiente con cada vuelta del bucle
																						//el apuntador puntomedio es el que descubre el valor y los otros dos lo ayudan a llegar 
			if(valorBuscado == arregloV[apuntadorPM]) {									//cuando el apuntadorPM encuentra el valor buscado entonces alojamos la posicion el el valorEncontrado que será el que retornará
				valorEncontrado = apuntadorPM;
			} else 
				if(valorBuscado > arregloV[apuntadorPM]){								//cuando el valorBuscado sea mayor al valor que está en la posicion de apuntador el apuntador1 se moverá hasta la posicion del apuntadorPM + 1
					apuntador1= apuntadorPM++;
				} else 
					if(valorBuscado < arregloV[apuntadorPM]) {							//cuando el valorBuscado sea menor al valor que está en la posicion de apuntador el apuntador2 se moverá hasta la posicion del apuntadorPM - 1
						apuntador2= apuntadorPM--;
					} 

			if(apuntadorPM < 0) {															//es posible que despues de la operacion (apuntador1+apuntador2)/2 el apuntadorPM tenga un valor menor a 0 y dará un error al tratar de acceder al array en una posición que no existe 
				throw new BusquedaException("Lo sentimos, el numero no fue encontrado");
			}
		}

		if(valorEncontrado == -1) {// en un principio la variable valorEncontrado vale -1 porque en el array no existe la posición -1 y así podemos comprobar cuando no se encontró el valorBuscado
			throw new BusquedaException("Lo sentimos, el numero no fue encontrado");
		}

		return valorEncontrado;
	}

	public static void main(String[] args) {
		
		ordenamientoBurbuja();

		try{
			System.out.println("¡Enhorabuena, valor encontrado en la posición " + (busquedaBinaria(30)+1) + "!");;
		}
		catch (BusquedaException e){

			System.out.println(" ");
			System.out.println(e.getMessage());
		}
	}

}
