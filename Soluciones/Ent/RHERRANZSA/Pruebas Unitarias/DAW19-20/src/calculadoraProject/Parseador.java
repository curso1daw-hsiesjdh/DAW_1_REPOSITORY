package calculadoraProject;

public class Parseador {
	
		/**
		 * 
		 * @param a Parametro el cual se utiliza para sacar el operador de la expresión matemática
		 * @return devuelve operador de la expresión matemática
		 */
	
		public String obtenerOperador(String a) {
			
			a = a.trim();
			String operador = "";
			int nsig = 0;
			int posOp = -1;
			
			for(int i=0;i<a.length();i++) {
				
				char op = a.charAt(i);
				switch (op) {
					
				case '+':
				case '-':
				case '*':
				case '/':
					operador = String.valueOf(op);
					posOp = i;
					nsig++;
					if(i==0) {
						nsig--;
					}
					break;
				default:
					break;	
				}
			}
			if(nsig>1) {
				
				posOp=posOp-1;
				operador = String.valueOf(a.charAt(posOp));
			}	
			return operador;
		}

		/**
		 * 
		 * @param a Parametro el cual se utiliza para sacar su primer operando
		 * @return develve el primer operando de la expresión matemática introducida
		 */
		
		public Integer primerOperando(String a) {
			
			a = a.trim();
			Integer priOp = -1;	
			int posOp = -1;
			int nsig = 0;
			
			for(int i=0;i<a.length();i++) {
				
				char op = a.charAt(i);
				switch (op) {
					
				case '+':
				case '-':
				case '*':
				case '/':
					  posOp = i;
					  nsig++;
					  if(i==0) {
							nsig--;
						}
					break;
				default:
					break;	
				}
			}
			if(nsig>1) {
				posOp = posOp-1;
			}
			priOp = Integer.parseInt(a.substring(0, posOp));
			return priOp;
		}
		
		/**
		 * 
		 * @param a Parametro el cual se utiliza para sacar su segundo operando
		 * @return develve el segundo operador de la expresión matemática introducida
		 */
		
		public Integer segundoOperando(String a) {
			
			a = a.trim();
			Integer segOp = -1;
			int nsig = 0;
			int posOp = -1;
			
			for(int i=0;i<a.length();i++) {
				
				char op = a.charAt(i);
				switch (op) {
					
				case '+':
				case '-':
				case '*':
				case '/':
					posOp = i;
					nsig++;
					if(i==0) {
						nsig--;
					}
					break;
				default:
					break;
				}
			}
			if(nsig>1) {
				posOp--;
			}
			segOp = Integer.parseInt(a.substring(posOp+1));
			
			return segOp;
		}		
}
