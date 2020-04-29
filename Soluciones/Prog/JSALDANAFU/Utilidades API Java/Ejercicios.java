import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Ejercicios {
	
	static String sFechas = "21/04/2015,12/06/1955,26/01/1985,18/06/1936,12/10/1492,25/12/2000,02/05/2018,13/10/1975,01/03/1991,20/10/1972,17/04/2020";
	
	
//	Esta función sirve para crear un un vFechas con formato yyyy-MM-dd sin ordenar
	public static Date [] cambiarFormato(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String [] mono = sFechas.split(",");
		Date [] vFechas =new Date [mono.length];

		for(int i = 0;i< mono.length;i++) {
			String dateString;
			String [] pelu;
			pelu = mono[i].split("/") ;	
			dateString = pelu [2] + "-" + pelu [1] + "-" + pelu [0];
			
			try {
				vFechas[i] = sdf.parse(dateString);
			} catch (ParseException e) {
                e.printStackTrace();
            } 
		}
		return vFechas;
		
	}
	
//	Esta función sirve para ordendar el vFechas que devuelve la función cambiarFormato
	public static void ordenacionBurbuja(Date [] a) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length -1 ; j++) {
				if (a[j].after(a[j + 1])) {
					Date tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(sdf.format(a[i]) + " ,");
		}
		
	}

	public static void main(String[] args){ 

		ordenacionBurbuja(cambiarFormato());
	}

}
