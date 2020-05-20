
public class Calculadora {
	
	public Integer sumar (Integer sumando1, Integer sumando2) {
		return sumando1 + sumando2;
	}
	
	public Integer multiplicar (Integer multiplicando1, Integer multiplicando2) {
		return multiplicando1 * multiplicando2;
	}
	
	public Integer restar (Integer minuendo, Integer sustraendo){
		return minuendo - sustraendo;
	}
	
	public double dividir (Integer dividendo, Integer divisor) {
		return (double)dividendo / (double)divisor;
	}
	
	public double computarExpresion (String expresion) throws BadOperatorException {
		Parseador parseador = new Parseador();
		int operando1 = parseador.obtenerPrimerOperando(expresion);
		int operando2 = parseador.obtenerSegundoOperando(expresion);
		
		switch(parseador.obtenerOperador(expresion)) {
			case "+":{
				return sumar (operando1, operando2);
			}
			case "*":{
				return multiplicar (operando1, operando2);
			}
			case "-":{
				return restar (operando1, operando2);
			}
			case "/":{
				return dividir(operando1, operando2);
			}
			default:{
				throw new BadOperatorException("Error! La operación no es válida");
			}
		}
	}
}
