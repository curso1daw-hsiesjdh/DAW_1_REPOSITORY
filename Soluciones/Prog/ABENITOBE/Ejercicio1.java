
public class Ejercicio1 {
	public static void NumerosAleatorios(Integer [] num){
	 	
		for (int i = 0; i < num.length; i++){
			int aleatorio = (int) (Math.random()* 100 + 1);
			num[i] = aleatorio;
		}
	}
	
	public static void ArrayAleatorio(Integer [] num){
		
		for (int i = 0; i < num.length; i++){
			System.out.print(num[i]+"  ");
		}
		System.out.print("\n");
	}
	
	
	public static void OrdenarMenoraMayor(Integer [] v){
		
		 int aux = 0;
	     
		 for (int i = 0; i < v.length - 1; i++){
			 
	         for (int j = 0; j < v.length - i - 1; j++){
	        	 int n = v[j + 1].intValue();
	        	 int m = v[j].intValue();
	        	 
	             if (n < m) {
	                 aux = n;
	                 n = m;
	                 m = aux;
	             }
	             v[j + 1] = Integer.valueOf(n);
	             v[j] = Integer.valueOf(m);
	         }
	     }
	}
	
	public static void ArrayOrdenado(Integer [] v){
		
		for(int z = 0; z < v.length; z++){
			 System.out.print(v[z] + "  ");
		 }
		 System.out.print("\n");
	}
	
	
	public static int BusquedaBinaria (Integer [] num, int v){
		int inicio = 0;
		int centro = 0;
		int fin = num.length - 1;
		
		while (inicio <= fin){				 
			centro = (fin + inicio) / 2;
			
			if (num[centro] == v){ 
				return centro;
			}
			else if (v < num[centro]){
				fin = centro - 1;
			}	
			else{ 
				inicio = centro + 1;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		
		Integer [] num = new Integer [20];
		int pos = 0;
		
		System.out.println("Relleno el vector con números aleatorios...");		
		NumerosAleatorios(num);
		
		System.out.println("Muestro el vector con numeros aleatorio:");
		ArrayAleatorio(num);
		
		System.out.println("Ordeno el vector de menor a mayor...");
		OrdenarMenoraMayor(num);
		
		System.out.println("Muestro el vector ordenado:");
		ArrayOrdenado(num);
		
		pos=BusquedaBinaria(num, 40);
		if (pos>-1){
		System.out.println("El numero buscado está en la posición:  " + pos);}
		else{
		System.out.println("El numero no se encuentra en el array");
		}
	}
}
