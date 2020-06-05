
package calculadoraProject;

public class Calculadora {

	private Parseador parseador = new Parseador();
	
	public Integer sumar(Integer a, Integer b) {
		
		Integer suma = a+b;
		return suma;
	}
	
	public Integer restar(Integer a, Integer b) {
		
		Integer resta = a-b;
		return resta;
	}
	
	public Integer multiplicar(Integer a, Integer b) {
		
		Integer multiplicacion = a*b;
		return multiplicacion;
	}
	
	public double dividir(double primerNumero, double segundoNumero) throws BadOperatorException{
		
		if(segundoNumero==0) {
			throw new BadOperatorException("División por 0. No se puede realizar la operación de división.");
		}else {
			double division = primerNumero/segundoNumero;
			return division;
		}
	}
	
	public double computarExpresion(String expresion) throws BadOperatorException {
		
		String operador = parseador.obtenerOperador(expresion);
		int primerNumero = parseador.primerOperando(expresion);
		int segundoNumero = parseador.segundoOperando(expresion);
		
		
		switch(operador) {
			case "+":
				return sumar(primerNumero, segundoNumero);
			case "-":
				return restar(primerNumero, segundoNumero);
			case "*":
				return multiplicar(primerNumero, segundoNumero);
			case "/":
				return dividir(primerNumero, segundoNumero);
			default:
				throw new BadOperatorException("El operador no es valido");
		}
	
	}

}
