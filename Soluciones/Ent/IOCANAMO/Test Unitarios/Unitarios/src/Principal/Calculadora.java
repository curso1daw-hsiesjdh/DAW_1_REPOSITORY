package Principal;

public class Calculadora {
	public Parseador parseador = new Parseador();
 public Integer sumar(Integer sumando1, Integer sumando2) {
	 Integer suma=sumando1+sumando2;
	 return suma;
 }
 
 public Integer multiplicar(Integer multiplicando1, Integer multiplicando2) {
	 Integer multiplicacion=multiplicando1*multiplicando2;
	 return multiplicacion;
 }
 
 public Integer restar(Integer minuendo, Integer sustraendo) {
	 Integer resto=minuendo-sustraendo;
	 return resto;
 }
 
 public Double dividir(Integer dividendo, Integer divisor) throws BadOperatorException {
	 Integer solucion = 0;
	 if(divisor.equals(0)) {
		 throw new BadOperatorException("División por 0. No se puede realizar la operación de división)");
	 }
	 solucion=dividendo/divisor;
	 Double cociente = Double.valueOf(solucion);
	 return cociente;
 }
 
 public Double computarExpresion(String expresion) {
	 String operador = parseador.obtenerOperador(expresion);
	 Double solucion=0.0;
	 
	 switch(operador) {
	 case "+":
		 Integer sumando1 = parseador.obtenerPrimerOperando(expresion);
		 Integer sumando2 = parseador.obtenerSegundoOperando(expresion);
		 Integer suma = this.sumar(sumando1, sumando2);
		 solucion = Double.valueOf(suma);
		 break;
	 case "-":
		 Integer minuendo = parseador.obtenerPrimerOperando(expresion);
		 Integer sustraendo = parseador.obtenerSegundoOperando(expresion);
		 Integer resto = this.restar(minuendo, sustraendo);
		 solucion = Double.valueOf(resto);
		 break;
	 case "*":
		 Integer multiplicando1 = parseador.obtenerPrimerOperando(expresion);
		 Integer multiplicando2 = parseador.obtenerSegundoOperando(expresion);
		 Integer multiplicacion = this.multiplicar(multiplicando1, multiplicando2);
	     solucion = Double.valueOf(multiplicacion);
	     break;
	 case "/":
		 Integer dividendo = parseador.obtenerPrimerOperando(expresion);
		 Integer divisor = parseador.obtenerSegundoOperando(expresion);
		 try {
			solucion = this.dividir(dividendo, divisor);
		} catch (BadOperatorException e) {
			e.printStackTrace();
		}
		 break;
	 default:
		 System.out.println("El operador introducido en la expresion no coincide con la sintaxis");
	 }
	 return solucion;
 }
}
