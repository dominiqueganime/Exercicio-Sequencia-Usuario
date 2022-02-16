import java.util.Scanner;

public class Sequencia {

	static int numero;
	
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    
	    do {
	        System.out.print("Digite o utilizador: ");
	        numero = scanner.nextInt();
	 
	    } while (numero >= 0);

	    if (numero < 0) {
	    	System.out.print("A soma dos valores anteriormente imputados é: " );	
		}
 
 }
	
}
	
	
	

		
