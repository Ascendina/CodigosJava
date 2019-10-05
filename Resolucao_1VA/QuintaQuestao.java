import java.util.Scanner;

public class QuintaQuestao {

	public static void main(String[] args) {
		//Primeira forma de Resolver
		//Chamando a biblioteca de console
		/*Scanner console = new Scanner(System.in);

		//Obtendo primeiro número
		System.out.println("Digite um número: ");
		int num = console.nextInt();

		//Obtendo segundo número
		System.out.println("Digite outro número: ");
		int num1 = console.nextInt();

		//Obtendo terceiro número
		System.out.println("Digite mais um número: ");
		int num2 = console.nextInt();


		//Verificando se é par ou impar
		//Primeiro número
		if(num % 2 == 0){
			System.out.println(num + " é par!");
		}
		else{
			System.out.println(num + " é ímpar!");
		}

		//Segundo número
		if(num1 % 2 == 0){
			System.out.println(num1 + " é par!");
		}
		else{
			System.out.println(num1 + " é ímpar!");
		}

		//Terceiro número
		if(num2 % 2 == 0){
			System.out.println(num2 + " é par!");
		}
		else{
			System.out.println(num2 + " é ímpar!");
		}	*/	


		//Segunda forma de resolver

		//Chamando a biblioteca de console
		Scanner console = new Scanner(System.in);

		int num = 0;
		for (int i = 0; i < 3; i = i + 1){
			//Obtendo número
			System.out.println("Digite um número: ");
			num = console.nextInt();
			
			if(num % 2 == 0){
				System.out.println(num + " é par!");
			}
			else{
				System.out.println(num + " é ímpar!");
			}
			
		}
		

	}

}
