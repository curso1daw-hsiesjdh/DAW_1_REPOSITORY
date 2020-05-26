import Exception.BadOperatorException;
public class Calculadora {

    public Integer sumar(Integer sumando1, Integer sumando2){
        return sumando1+sumando2;
    }

    public Integer restar(Integer minuendo, Integer sustraendo){
        return minuendo-sustraendo;
    }

    public Integer multiplicar(Integer multiplicando1, Integer multiplicando2){
        return multiplicando1*multiplicando2;
    }

    public Double dividir(Integer dividendo, Integer divisor){
        return (double)dividendo / (double)divisor;
    }

    public Double computarExpresion(String expresion) throws BadOperatorException {
        Parseador parseador = new Parseador();
        Double resultado = 0.0;
        Integer primerOperando = parseador.obtenerPrimerOperando(expresion);
        Integer segundoOperando= parseador.obtenerSegundoOperando(expresion);
        String operador = parseador.obtenerOperador(expresion);
        if (operador.equals("+")){
            resultado = (double) sumar(primerOperando, segundoOperando);
        }
        if (operador.equals("-")){
            resultado = (double) restar(primerOperando, segundoOperando);
        }
        if (operador.equals("*")){
            resultado = (double) multiplicar(primerOperando, segundoOperando);
        }
        if (operador.equals("/")){
            resultado = dividir(primerOperando, segundoOperando);
        }
        return resultado;
    }
}
