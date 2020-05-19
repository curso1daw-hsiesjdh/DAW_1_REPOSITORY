
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String e = "7 + 2";
		Calculadora c = new Calculadora();
		
		System.out.println("La operacion es la siguiente: " + e);
		try {
			System.out.println("El resultado de la operacion es de: " + c.computarExpresion(e));
		} catch (BadOperatorException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
