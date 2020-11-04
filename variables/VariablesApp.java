package variables;

public class VariablesApp {
	 

	public static void main(String[] args) {
		
		/************************** Fase 1 *****************************************/
		
		String nom = "javi";
		String cognom1 = "benito";
		String cognom2 = "martinez";
		
		int dia = 22;
		int mes = 07;
		int any = 1988;
		
		System.out.print("Nombre: " +cognom1+ " " +cognom2+ ", " +nom+ "\n");
		System.out.print("Edad: " +dia+ "/" +mes+ "/" +any+ "\n");
		
		
		/************************** Fase 2 *****************************************/
		
		final int traspas = 1948;
		int temps = 4;
		int anys = 0;
		
		for(var i = traspas; i<= any; i++) {
			
			i += temps;
			anys++;
			
		}
		
		System.out.print("\nAnys de traspas en " +traspas+ " y " +any+ ": " +anys);
		
		
		

	}

}
