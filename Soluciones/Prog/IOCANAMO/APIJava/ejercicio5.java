package util;
import java.text.ParseException; 
import java.text.SimpleDateFormat;
import java.util.Date;

public class ejercicio5 {
	public static Date[] formatChange(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String sFechas = "21/04/2015,12/06/1955,26/01/1985,18/06/1936,12/10/1492,25/12/2000,02/05/2018,13/10/1975,01/03/1991,20/10/1972,17/04/2020";
		String[]sFechas2=sFechas.split(",");
		Date [] vFechas=new Date [sFechas2.length];
		for(int i=0;i<sFechas2.length;i++){
			try {
				vFechas[i]=sdf.parse(sFechas2[i]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return vFechas;
	}
    
	public static void order(Date[]a){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date orden;
		for (int i=0;i<a.length-1;i++){
			for(int j=0; j<a.length-1;j++){
				if (a[j].after(a[j+1])) {
					orden=a[j+1];
					a[j+1]=a[j];
					a[j]=orden;
				}
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(sdf.format(a[k])+"");
		}
	}
	public static void main(String[]args){
		order(formatChange());
	}
}
