package marielysAPIsJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjercicioCinco {

	// remplazar "/" por "-"
	private static String remplazarChar(char charOld, char charNew, String cadena) {
		return cadena.replace(charOld, charNew);
	}

	// convertir string en array
	private static String[] stringToArray(String cadena) {
		cadena = remplazarChar('/', '-', cadena);
		String[] array = cadena.split(", ");
		return array;
	}

	// cambiar pattern de fecha de "dd-MM-yyyy" a "yyyy-MM-dd"

	static String cambiarFormato(String fecha) {
		String resultado = "";

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date d = null;

		try {
			d = sdf.parse(fecha);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		sdf.applyPattern("yyyy-MM-dd");
		resultado = sdf.format(d);
		return resultado;
	}

	// convertir array de string en array Date

	private static Date[] arrayStringToDateArray(String[] stringV) {
		Date[] array = new Date[stringV.length];

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (int index = 0; index < stringV.length; index++) {

			stringV[index] = cambiarFormato(stringV[index]);
			try {
				array[index] = sdf.parse(stringV[index]);
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		return array;
	}

	private static Date[] ordenarFechas(Date[] fechasV) {
		Date auxiliar;
		for (int i= 0; i < fechasV.length; i ++) {
			for(int index = 0; index < fechasV.length -1; index++) {
				if(fechasV[index].after(fechasV[index+1])) {
					auxiliar=fechasV[index+1];
					fechasV[index+1]=fechasV[index];
					fechasV[index]= auxiliar;
				}
			}
		}
		return fechasV;
	}

	private static void imprimirArray(Date[] array) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Date fecha : array) {

			System.out.println("Date= " + sdf.format(fecha));
		}
	}

	public static void main(String[] args) {
		// Dada la cadena de caracteres sFechas, generar un array de fechas tipo Date
		// con formato "yyyy-MM-dd" y ordenarlos acendente.

		String sFechas = "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
		imprimirArray(ordenarFechas(arrayStringToDateArray(stringToArray(sFechas))));

	}

}
