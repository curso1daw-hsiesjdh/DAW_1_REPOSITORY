package quintoejercicio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjercicioCinco {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	public static String fechas = "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
	public static String[] fechasSeparadas = fechas.split(",");
	public static Date [] vFechas = new Date [fechasSeparadas.length];


	
	
	public static Date[] cambiarFormato() throws ParseException{
		
		for(int i = 0; i < fechasSeparadas.length; i++){

			vFechas[i] = sdf.parse(fechasSeparadas[i]);
		}
		
		return vFechas;
	}
	

	public static void ordenar(Date[]fecha){
		
		Date asc;
		
		for (int i=0; i < vFechas.length; i++){
			
			for(int j=0; j < vFechas.length - 1; j++){
				
				if (vFechas[j].after(vFechas[j+1])) {
					
					asc = vFechas[j+1];
					vFechas[j+1] = vFechas[j];
					vFechas[j] = asc;
				}
			}
		}
		for(int i=0;i<fecha.length;i++){
			System.out.println(sdf1.format(fecha[i]));
			System.out.println(fecha[i] + "\n");
		}
	}
	

	
	
	
	public static void main(String[] args) {
		System.out.println("Ejercicio 5\n" + 
				"Dada la cadena de caracteres sFechas, en el que se guardan fechas separadas por comas con el formato\n" + 
				"días/mes/año, generar un array vFechas en el que cada posición del array será un objeto de tipo Date con\n" + 
				"formato yyyy-MM-dd, con todas las fechas de sFechas. Dicho array deberá ser ordenado de manera\n" + 
				"ascendente.\n" + 
				"sFechas = “21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018,\n" + 
				"13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020”\n");
		
		try {
			
			ordenar(cambiarFormato());
			
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
	
	}

}

