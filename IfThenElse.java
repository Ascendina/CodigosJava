import java.util.Scanner;

public class IfThenElse {

	public static void main(String[] args) {
		
		
		
		
		/*boolean caso = true;
		
		if(caso == true){
			System.out.println("Aqui ele casou");
		}
		else{
			System.out.println("Aqui ele N�O casou");
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
		 * menos 12 anos - crian�a
		 * */
		
		/*if(idade >= 60){
			System.out.println("Voc� � idoso!");
		}
		else if(idade >= 25 && idade < 60){
			System.out.println("Voc� � adulto!");
		}
		else if(idade >= 12 && idade < 25){
			System.out.println("Voc� � adolescente!");
		}
		else{
			System.out.println("Voc� � crian�a!");
		}
		*/
		
		/*
		 * L� um numero do console e verificar se ele
		 * � divisivel ou n�o por 5*/
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int numero = console.nextInt();
		
		if(numero % 5 == 0){
			System.out.println("Divis�vel por 5!");
		}
		else{
			System.out.println("N�o � divis�vel por 5!");
			
			if(numero % 2 == 0){
				System.out.println("� par!");
			}
			else{
				System.out.println("� impar!");
			}
		}
		
 
	}//fim do main

}//fim da classe
