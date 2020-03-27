
public class EjercicioWrapper1 {
	
	static Integer [] v =  new Integer [10];
	
	static void numerosAleatorios () { //Hago una función para que me de veinte valores enteros entre 0 - 100.
		
		System.out.println("Establezcamos " + v.length + " valores aleatorios: ");
		
		for (Integer i = 0; i < v.length; i++) {
			v [i] = (int) (Math.random()*100); //El random*100 sirve para poner numeros aleatorios hasta 100.
			System.out.print(v [i] + ", ");
		}
	}
	
	static void menorToMayor () {
		Integer auxiliar = new Integer (0);
		
		for (Integer contador = 0; contador < v.length; contador++) {
			for(Integer flecha = 1; flecha < v.length-contador; flecha++) {
				//Imaginemos que tenemos dos flechas: una va a ser 'flecha-1' (inicia en 0) y otra 'flecha' (inicia en 1).
				//Todo esto lo hago para no hacer una 'flecha1' y una 'flecha2' que complique más el ejercicio.
				if (v[flecha-1] > v[flecha]) {
					auxiliar = v [flecha-1];
					v[flecha-1] = v[flecha];
					v[flecha] = auxiliar;
				}
			}
		}
		
		// Imprimo el resultado ordenado.
		
		System.out.println("Ordenado de menor a mayor queda así: ");
		for (Integer i = 0; i < v.length; i++) {
			System.out.print(v[i] + ", ");
		}
		
		
	}
	
	static void busquedaBinaria (int ValorBuscado) {
		Integer ApuntadorPM = new Integer ("0");
		Integer flechita1 = new Integer ("0");
		Integer flechita2 = new Integer (v.length - 1);
		
		while (flechita1 <= flechita2) {
			ApuntadorPM = (int) (flechita1+flechita2)/2; // Saco un apuntador que esté en el medio, como debe ser un entero, hago un casting '(int)'.
			
			if (v[ApuntadorPM] < ValorBuscado) {
				flechita1 = ApuntadorPM + 1;
			} else if (v[ApuntadorPM] > ValorBuscado) {
				flechita2 = ApuntadorPM - 1;
			} else { // Si v[ApuntadorPM] == ValorBuscado:
				System.out.println("Elemento encontrado en la posición: " + (ApuntadorPM + 1)); // +1 para no confundir al lector.
				break; // Si no pongo break, me va a mostrar ese mensaje hasta el Día del Juicio Final.
			}
		}
		
		if (v[ApuntadorPM] != ValorBuscado) {
			System.out.println("El valor '" + ValorBuscado + "' no existe dentro del arreglo."); // Obvio, microbio.
		}
	}
	
	public static void main (String [] args) {
		numerosAleatorios();
		System.out.println();//Línea nueva para el próximo programa.
		menorToMayor();
		System.out.println();//Línea nueva para el próximo programa.
		busquedaBinaria (20); //INTRODUCIR NÚMERO QUE QUIERES QUE EL PROGRAMA BUSQUE.
	}
}
