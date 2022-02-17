import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sequencia {

	static int numero;
	
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    
	    List<Integer> listaNumeros = new ArrayList<>();
	    int numero = 0;
	    
//Pede que o usuario digite um utilizador até que a condição para cessar seja realizada:	 
	    
	    do {
	        System.out.print("Digite o utilizador: ");
	        numero = scanner.nextInt();
	        listaNumeros.add(numero);
	        
	        numero++;
	 
	    } while (numero >= 0);
	    
// Soma dos valores imputados durante o ciclo while:
	    
	    int soma = listaNumeros.stream().mapToInt(Integer::intValue).sum();
	    
	    
// Finalizar a sequencia caso um valor imputado seja negativo - E apresentação da soma dos valores imputados anteriormente:	 
	    
	    if (numero < 0) {
	       	System.out.println("A soma dos valores anteriormente imputados é: " + soma);
		}
	    	
	    }
       
	    	
 }
	

	
	
	

		
