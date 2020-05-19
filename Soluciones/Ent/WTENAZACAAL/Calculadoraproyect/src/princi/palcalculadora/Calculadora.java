package princi.palcalculadora;

public class Calculadora {
	
	Parseador parseador = new Parseador();
	
	/***
	 * 
	 * @param sumando PRIMER OPERANDO DE LA OPERACION SUMA
	 * @param sumando2 SEGUMNDO OPERANDO DE LA OPERACION SUMA
	 * @return VALOR DE RETORNO DE LA OPERACION SUMA
	 */
	public Integer sumar(Integer sumando, Integer sumando2) {
		Integer suma = sumando + sumando2;
		return suma;
	}
	
	/***
	 * 
	 * @param multiplicando1 PRIMER OPERANDO DE LA OPERACION MULTIPLICAR
	 * @param multiplicando2 SEGUNDO OPERANDO DE LA OPERACION MULTIPLICAR
	 * @return VALOR DE RETORNO DE LA OPERACION MULTIPLICAR
	 */
	public Integer multiplicar(Integer multiplicando1, Integer multiplicando2) {
		int multiplicacion = multiplicando1 * multiplicando2;
		return multiplicacion;
	}
	
	/***
	 * 
	 * @param minuendo PRIMER OPERANDO DE LA OPERACION RESTAR
	 * @param sustraendo SEUNFO OPERANDO DE LA OPERACION RESATAR
	 * @return VALOR DE RETORNO DE LA OPERACION RESTAR
	 */
	public Integer restar(Integer minuendo, Integer sustraendo) {
		Integer resta = minuendo - sustraendo;
		return resta;
	}
	
	/***
	 * 
	 * @param dividendo OPERADOR DIVIDENDO O NUMERADOR DE LA OPERACION DIVIDIR
	 * @param divisor OPERADIR DIVISOR DE LA OPERACION DIVIDIR
	 * @return resultado de la division
	 */
	public Double dividir(Integer dividendo, Integer divisor) throws BadOperatorException{
		Double result = (double) 0;
		 if(divisor.equals(0)) {
			 throw new BadOperatorException("División por 0. No se puede realizar la operación de división)");
		 }
		 result = (double) (dividendo / divisor);
		 //Double cociente = Double.valueOf(result);
		 return result;
	}
	
	/***
	 * 
	 * @param Stringexpresion CADENA DE CARACTERES QUE REPRESENTA UNA EXPRESION MATEMATICA 
	 * @return DEVUELVE EL RESULTADO DE HABER EVALUADO LA EXPRESION MATEMATICA
	 * @throws BadOperatorException EXCEPSION SI EL OPERADOR INTRODUCIDO NO ES EL CORRECTO SALTARA LA EXCEPCION
	 */
	public double computarExpresion(String expresion) throws BadOperatorException {
		Integer number = parseador.obtenerPrimerOperando(expresion);
		Integer number2 = parseador.obtenerSegundoOperando(expresion);
		String operador = parseador.obtenerOperador(expresion);
		double resultado= 0.0;
		
		
		switch(operador) {
			case "+":
				resultado= this.sumar(number,number2);
			break;
			case "-":
				resultado= this.restar(number,number2);
			break;
			case "*":
				resultado= this.multiplicar(number,number2);
			break;
			case "/":
				resultado= this.dividir(number,number2);
			break;
			default:
				throw new BadOperatorException("Lo siento el operador introducido es incorrecto.");
		}
		return resultado;
	}
}

