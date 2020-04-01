public class EjercicioAlgoritmo {
	 static Integer []v=new Integer [20];
  public static void arrayNumerosAleatorios(){
	  // Reservamos memoria para el array de 20 numeros aleatorios.
	for(int i=0;i<v.length;i++){ // Este bucle for lo que hace es por cada valor de "i" generar un numero aleatorio en cada unidad del array
		                         // esto se consigue con el comando Math.random. Si fuera el caso de que no quisiesemos  
		                         // tomar el valor 0, se tendria que añadir despues de la operacion con el math.random, un "+1".		                          
		v[i] =(int)(Math.random()*20);
		System.out.print(v[i] + " ");
	}
	System.out.println("");
  }
  public static void ordenBurbuja(){
		arrayNumerosAleatorios();
		  Integer orden; // Un cadena sin valor que posteriormente sera de mucha utilidad
		  for(int i=0;i<v.length-1;i++){ // Con este for pasamos por todas las posiciones del array.
			  for(int j=0;j<v.length-1;j++){ // y con este haremos posible la ordenacion del contenido del array.
				  if(v[j]>v[j+1]){ // Esto se traduce como: if (NumeroActual del array > NumeroActual del array + 1 posicion)
					               // Se mete dentro del if y haciendo uso de "orden" se consigue intercambiar el numeroactual con 
					               // el numero que estaba a una posicion a su derecha
					               // es decir orden inicialmente coje el valor de v[j] para preservar el numero 
					               // posteriormente v[j] sustituye su contenido con el que tenia a su derecha
					               // Por ultimo v[j+1](Que era el que tenia a la derecha v[j]) recupera el contenido de v[j]
					               // igualando su contenido al de "orden" logrando asi el intercambio.
					orden=v[j];
					v[j]=v[j+1];
					v[j+1]=orden;
				  }
			  }
		  }
		  for(int i=0;i<v.length;i++){ //finalmente una vez ordenado, con este for lo que se logra es ir imprimiendo por pantalla los valores
			                           // de todas las posiciones del array ordenados
			  System.out.print(v[i]+" ");
		  }
		  System.out.println("");
	}
  public static int busqueda(Integer a){
	  ordenBurbuja();
	  Integer n = v.length;
	  Integer centro;
	  Integer inf=0;
	  Integer sup=n-1;
	   while(inf<=sup){
	     centro=(sup+inf)/2;
	     if(v[centro].equals(a)) {
	    	 return centro;
	     } else if(a < v [centro] ){
	        sup=centro-1;
	     }
	     else {
	       inf=centro+1;
	     }
	   }
	   return -1;
	 }

	public static void main(String[] args) {
		Integer c1 = new Integer(6);
	 System.out.println(busqueda(c1) + " es la posición del numero en el array ordenado");

	}
}
