
public class Main {

	public static void main(String[] args) {
		String expresion = "100/10";
		Calculadora calculadora = new Calculadora();
		
		try {
			System.out.println("calcular : " + expresion);
			System.out.println("resultado : " + calculadora.computarExpresion(expresion));	
		}catch(BadOperatorException e) {
			e.getMessage();
		}
		
	}

}
