	/***
	 * @author david
	 * @version 1.0
	 * 
	 */
package ejerciciounowrappers;

public class EjercicioWarpper {

	public static Integer[] Varreglo = new Integer[15];
	
	
	public static void ordenacionBurbuja() {
		System.out.println("NUMEROS ALEATORIOS");
		//RELLENO EL ARRAY CON NUMEROS ALEATORIOS EN CADEA POSICION
		for(Integer i = 0; i < Varreglo.length; i++) {
			Varreglo[i] = (int) (Math.random() * 100);
			System.out.println(Varreglo[i]+ " ");
		}
		
		Integer aux = 1;
		Integer datoInter;
		
		for(Integer i = 0; i < Varreglo.length; i++) {
			
			for(Integer o = 0; o < Varreglo.length; o++ ) {
				
				if(aux < Varreglo.length) {
					
					if(Varreglo[o] > Varreglo[aux]) {
			
						datoInter = Varreglo[o];
						Varreglo[o] = Varreglo[aux];
						Varreglo[aux] = datoInter;
					}
					aux++;
				}
			}
			
			aux = 1;
		}
		
		System.out.println("-------NUMEROS ORDENADOS-------");
		
		for(Integer i = 0; i < Varreglo.length; i++){
			System.out.println(Varreglo[i]);
		};
		
	}
	
	
	public static int BusquedaBinaria(Integer valorBuscar) throws BusquedaException {
		Integer inicio = 0;
		Integer centro = 0;
		Integer fin = Varreglo.length -1;
		Integer valorEncontrado = -1;
		
		if(valorBuscar > 100) {
			throw new BusquedaException("EL NUMERO ES MAYOR, INTRODUCE UN NUMERO MENOR A 100");
		}
		
		for(Integer i = 0; i < Varreglo.length; i++) {
			
			centro = (inicio + fin) / 2; 
			
			if(valorBuscar == Varreglo[centro]) {
				valorEncontrado = centro;
			}
				
			if(valorBuscar > Varreglo[centro]) {
				inicio = centro++;
			}
					
			if(valorBuscar < Varreglo[centro]) {
				fin = centro--;
			}
			
			if(centro < 0) {
				throw new BusquedaException("EL NUMERO NO FUE ENCONTRADO");
			}
			
		}
		
		if(valorEncontrado.equals(-1)){
			throw new BusquedaException("HARASHO, HARASHO MALYY IOL. LO SIENTO TU NUMERO NO FUE ENCONTRADO INTENTA DE NUEVO CRAK");
		}
		
		return valorEncontrado;
		
		
	}
	
	
	
	
	
	public static void main(String[]args) {
		ordenacionBurbuja();
		
		try {
			System.out.println("VALOR ENCONTRADO EN LA POSICION " + BusquedaBinaria(56) + "!");
			
		}catch(BusquedaException e) {
			System.out.println(" ");
			System.out.println(e.getMessage());
		}

	}
}
