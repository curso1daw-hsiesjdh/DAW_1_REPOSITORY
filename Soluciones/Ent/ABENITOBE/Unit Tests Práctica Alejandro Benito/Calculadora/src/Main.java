
public class Main {

	public static void main (String[] args) {
		Calculadora calculadora = new Calculadora();
		
		String expresion = "7 / 2";
		
		try {
			
			System.out.println("Suma : " + calculadora.sumar(-4, -2));
			
			System.out.println("Resta : " + calculadora.restar(-4, 5));
			
			System.out.println("Multiplicacion : " + calculadora.multiplicar(-2, 3));
			
			System.out.println("Division : " + calculadora.dividir(-7, -4));
			
			System.out.println("calcular : " + expresion);
			System.out.println("resultado : " + calculadora.computarExpresion(expresion));
			
		}catch(BadOperatorException e) {
			e.getMessage();
		}
		
	}

}
