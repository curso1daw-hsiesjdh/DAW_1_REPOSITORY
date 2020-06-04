
public class Principal {

	public static void main(String[] args) {
		String firstry = " 10/5 ";
		CalculadoraReal secondtry = new CalculadoraReal();
		
		try {
			System.out.println("Calculando: " + firstry);
			System.out.println("El resultado: " + secondtry.computarExpresion(firstry));	
		}catch(BadOperatorException e) {
			e.getMessage();
		}
		
	}

}

