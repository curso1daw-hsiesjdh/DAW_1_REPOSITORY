import Exception.BadOperatorException;

public class Parseador {

    public String obtenerOperador(String expresion) throws BadOperatorException {
        expresion=expresion.replaceAll("\\s+","");
        String operador="";
        int k=0;
        for (int i =1; i<expresion.length()-1; i++){
            if (expresion.charAt(i) == '+' && k==0){
                operador= "+";
                k++;
            }
            else if (expresion.charAt(i) == '-' && k==0){
                operador= "-";
                k++;
            }
            else if (expresion.charAt(i) == '*' && k==0){
                operador= "*";
                k++;
            }
            else if (expresion.charAt(i) == '/' && k==0){
                operador= "/";
                k++;
            }
        }
        if (k==0){
            throw new BadOperatorException("Operador no válido o en posición incorrecta");
        }

        return operador;
    }

    public Integer obtenerPrimerOperando(String expresion) throws BadOperatorException {
        return Integer.parseInt(expresion.substring(0, expresion.indexOf(obtenerOperador(expresion))).replaceAll("\\s+",""));
    }

    public Integer obtenerSegundoOperando(String expresion) throws BadOperatorException {
        int index = expresion.indexOf(obtenerOperador(expresion));
        return Integer.parseInt(expresion.substring(index+1).replaceAll("\\s+",""));
    }
}
