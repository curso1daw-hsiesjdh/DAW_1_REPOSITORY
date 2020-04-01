public class EjercicioWrapper {
	
	
  public static Integer []arrayInteger=new Integer [20];
  
  
  public static void arrayNumerosAleatorios(){
	 
	for (int a=0;a<arrayInteger.length;a++){ 
		
		arrayInteger[a] =(int)(Math.random()*10);
		
		System.out.print(arrayInteger[a] + " ");
		
	}
	
	  System.out.println("<-- Array desordenado.");
  }
  

  public static int busquedaBinaria(Integer n){
	  
	  Integer longitud = arrayInteger.length;
	  Integer pmayor=longitud-1;
	  Integer pcentral;
	  Integer pmenor=0;
	 
	  ordenacionBurbuja();
	  
	   while(pmenor<=pmayor){
		   
	     pcentral=(pmayor+pmenor)/2;
	     
	     if(arrayInteger[pcentral].equals(n)) {
	    	 
	    	 return pcentral;
	    	 
	     } else if(n < arrayInteger [pcentral] ){
	    	 
	        pmayor=pcentral-1;
	        
	     }else {
	    	 
	       pmenor=pcentral+1;
	       
	     }
	     
	   }
	   
	   return -1;
	 }

  public static void ordenacionBurbuja(){
	  Integer aux;
	  arrayNumerosAleatorios();
		 
		for (int i=0;i<arrayInteger.length-1;i++){
			
			  for (int j=0;j<arrayInteger.length-1;j++){
				  
				  if(arrayInteger[j]>arrayInteger[j+1]){
					  
					aux=arrayInteger[j];
					arrayInteger[j]=arrayInteger[j+1];
					arrayInteger[j+1]=aux;
				  }
			  }
		  }
		
		
		
		  for(int i=0;i<arrayInteger.length;i++){
			  
			  System.out.print(arrayInteger[i]+" ");
			  
		  }
		  
		  System.out.println("<-- Array Ordenado.");
	}
  
	public static void main(String[] args) {
		
		Integer i1 = new Integer((int)(Math.random()*10)); // Usar este si se quiere que busque numeros aleatorios.
		
//		Integer i1 = new Integer((int)(9)); 			   // Usar este si se quiere poner un valor en concreto.
		
	 System.out.println("El numero "+i1.toString()+" se encuentra en el índice: "+busquedaBinaria(i1));
	 

	 System.out.println("Si el número del índice es -1, el número no aparece en el array aleatorio.");

	}
}