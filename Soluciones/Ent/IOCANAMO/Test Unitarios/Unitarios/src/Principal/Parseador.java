package Principal;


public class Parseador {
  public Integer obtenerPrimerOperando(String expresion) {
	   String [] partes = expresion.split("=");
			   
	   String operador = obtenerOperador(expresion);
	   
	   String[] partes1 = partes[0].split("\\" + operador);
	   String primerOperador = partes1[0].trim();
	   Integer primerOperando = Integer.valueOf(primerOperador.substring(0, primerOperador.length()));
	   return primerOperando;
  }
  
  public Integer obtenerSegundoOperando(String expresion) {
	  String[] partes = expresion.split("=");
	  
	  String operador = obtenerOperador(expresion);
	  
	  String[] partes1 = partes[0].split("\\" + operador);
	  String segundoOperador = partes1[1].trim();
	  Integer segundoOperando = Integer.valueOf(segundoOperador);
	  return segundoOperando;
  }
  
  public String obtenerOperador(String expresion) {
	  String operadorRetorno ="+";
	  
	  if(expresion.indexOf('-')>0) {
		  operadorRetorno = "-";
	  }
	  
	  if(expresion.indexOf('*')>0) {
		  operadorRetorno = "*";
	  }
	  
	  if(expresion.indexOf('/')>0) {
		  operadorRetorno = "/";
	  }
	  return operadorRetorno;
  }
}

