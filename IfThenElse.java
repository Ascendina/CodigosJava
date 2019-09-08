import java.util.Scanner;

public class IfThenElse {

	public static void main(String[] args) {
		
		
		
		
		/*boolean caso = true;
		
		if(caso == true){
			System.out.println("Aqui ele casou");
		}
		else{
			System.out.println("Aqui ele NÃO casou");
		}*/
		
		
		
		/*Scanner console = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		
		int idade = console.nextInt();
		
		System.out.println("Idade obtida: " + idade);
		*/
		/*
		 * Pessoa mais do que 60 anos - idosa
		 * estiver entre 60 e 25 anos - adulta
		 * 12 e 25 anos - adolescente
		 * menos 12 anos - criança
		 * */
		
		/*if(idade >= 60){
			System.out.println("Você é idoso!");
		}
		else if(idade >= 25 && idade < 60){
			System.out.println("Você é adulto!");
		}
		else if(idade >= 12 && idade < 25){
			System.out.println("Você é adolescente!");
		}
		else{
			System.out.println("Você é criança!");
		}
		*/
		
		/*
		 * Lê um numero do console e verificar se ele
		 * é divisivel ou não por 5*/
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int numero = console.nextInt();
		
		if(numero % 5 == 0){
			System.out.println("Divisível por 5!");
		}
		else{
			System.out.println("Não é divisível por 5!");
			
			if(numero % 2 == 0){
				System.out.println("É par!");
			}
			else{
				System.out.println("É impar!");
			}
		}
		
 
	}//fim do main

}//fim da classe
