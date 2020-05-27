package Programa;

public class Calculadora {

	public Integer sumar (Integer sumando1, Integer sumando2) {
		
		Integer resultado= sumando1 + sumando2;
		
		return resultado;
	}
	
public Integer multiplicar (Integer multiplicando1, Integer multiplicando2) {
		
		Integer resultado= multiplicando1 * multiplicando2;
		
		return resultado;
	}
	
public Integer restar (Integer sustraendo1, Integer sustraendo2) {
	
	Integer resultado= sustraendo1 - sustraendo2;
	
	return resultado;
}

public Double dividir (Integer dividendo1, Integer divisor) {
	
	Double resultado= dividendo1.doubleValue()/divisor.doubleValue();

	return resultado;
}
public double computarExpresion(String expresion) {
	
	
	 Parseador p1=new Parseador();
	 Integer Operando1=p1.obtenerPrimerOperando(expresion);
	 Integer Operando2=p1.obtenerSegundoOperando(expresion);
	 String Operador=p1.obtenerOperador(expresion);
	 Double resultado = null;
	 switch(Operador) 
	 {
	 case "+":
		 resultado=Double.valueOf(sumar(Operando1,Operando2));
		 break;
	 
	 case "-":
		 resultado=Double.valueOf(restar(Operando1,Operando2));
		 break;
		 
	 case "*":
		 resultado=Double.valueOf(multiplicar(Operando1,Operando2));
		 break;
		 
	 case "/":
		 resultado=Double.valueOf(dividir(Operando1,Operando2));
		 break;
	 }
	
	return resultado;
}

}
