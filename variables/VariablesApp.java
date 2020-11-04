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
		
		int traspas = 1948;
		int temps = 4;
		int anys = 0;
		
		for(var i = traspas; i<= any; i++) {
			
			i += temps;
			anys++;
			
		}
		
		System.out.print("\nAnys de traspas en " +traspas+ " y " +any+ ": " +anys);
		
		
		/*************************** Fase 3 *************************************************/
		
		String resultado = "";
		int calc = 0;
		boolean cert = false;
		String frase1 = "\nEl any " +any+ " es de traspas";
		String frase2 = "\nEl any " +any+ " no es de traspas";
		
		System.out.print("\n\n");
		System.out.print("Els anys de traspas desde " +traspas+ " son:");
		
		for(var i = traspas; i < any; i++) {
			
			if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0) ){
				
				calc = i + temps;
				
				resultado += " " + calc;
	
			}
			
		}
		
		System.out.print(resultado);
		
		System.out.print("\n");
		
		if(any % 400 == 0 || (any % 4 == 0 && any % 100 != 0)) {
			cert = true;
			System.out.print(frase1);
			
		} else {
			cert = false;
			System.out.print(frase2);
			
		}
		
		/************************ Fase 4 **********************************/
		
		System.out.print("\n\n");
		
		System.out.print("Exemple de sortida per consola:\n");
		
		String nomComplet = "El meu nom és " +nom+ " " +cognom1+ " " +cognom2+ "\n";
		String dataNaixament = "Vaig néixer el " +dia+ "/" +mes+ "/" +any+ "\n";
		
		System.out.print(nomComplet);
		System.out.print(dataNaixament);
		
		if(any % 400 == 0 || (any % 4 == 0 && any % 100 != 0)) {
			cert = true;
			System.out.print("El menu any de neixament es de traspas\n");
			
		} else {
			cert = false;
			System.out.print("El menu any de neixament es de traspas\n");
			
		}

	}

}
