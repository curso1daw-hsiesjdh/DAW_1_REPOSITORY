import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class API_Cinco {

	private static String noBarraInclinada (char aCambiar, char aAplicar, String cadena) {
		return cadena.replace(aCambiar, aAplicar);
	}

	private static String[] stringToArray(String string) {
		string = noBarraInclinada('/', '-', string);
		String[] array = string.split(", ");
		return array;
	}

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

	private static Date[] arrayStringToDateArray(String[] stringV) {
		Date[] array = new Date[stringV.length];

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (int i = 0; i < stringV.length; i++) {

			stringV[i] = cambiarFormato(stringV[i]);
			try {
				array[i] = sdf.parse(stringV[i]);
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		return array;
	}

	private static Date[] ordenacionBurbujaFechas(Date[] fechasV) {
		Date aux;
		for (int i= 0; i < fechasV.length; i ++) {
			for(int j = 0; j < fechasV.length -1; j++) {
				if(fechasV[j].after(fechasV[j+1])) {
					aux=fechasV[j+1];
					fechasV[j+1]=fechasV[j];
					fechasV[j]= aux;
				}
			}
		}
		return fechasV;
	}

	private static void mostrador (Date[] array) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Date fecha : array) {

			System.out.print(sdf.format(fecha) + ", ");
		}
	}

	public static void main(String[] args) {

		String sFechas = "21/04/2015, 12/06/1955, 26/01/1985, 18/06/1936, 12/10/1492, 25/12/2000, 02/05/2018, 13/10/1975, 01/03/1991, 20/10/1972, 17/04/2020";
		mostrador(ordenacionBurbujaFechas(arrayStringToDateArray(stringToArray(sFechas))));

	}
}