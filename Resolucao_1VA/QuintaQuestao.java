import java.util.Scanner;

public class QuintaQuestao {

	public static void main(String[] args) {
		//Primeira forma de Resolver
		//Chamando a biblioteca de console
		/*Scanner console = new Scanner(System.in);

		//Obtendo primeiro n�mero
		System.out.println("Digite um n�mero: ");
		int num = console.nextInt();

		//Obtendo segundo n�mero
		System.out.println("Digite outro n�mero: ");
		int num1 = console.nextInt();

		//Obtendo terceiro n�mero
		System.out.println("Digite mais um n�mero: ");
		int num2 = console.nextInt();


		//Verificando se � par ou impar
		//Primeiro n�mero
		if(num % 2 == 0){
			System.out.println(num + " � par!");
		}
		else{
			System.out.println(num + " � �mpar!");
		}

		//Segundo n�mero
		if(num1 % 2 == 0){
			System.out.println(num1 + " � par!");
		}
		else{
			System.out.println(num1 + " � �mpar!");
		}

		//Terceiro n�mero
		if(num2 % 2 == 0){
			System.out.println(num2 + " � par!");
		}
		else{
			System.out.println(num2 + " � �mpar!");
		}	*/	


		//Segunda forma de resolver

		//Chamando a biblioteca de console
		Scanner console = new Scanner(System.in);

		int num = 0;
		for (int i = 0; i < 3; i = i + 1){
			//Obtendo n�mero
			System.out.println("Digite um n�mero: ");
			num = console.nextInt();
			
			if(num % 2 == 0){
				System.out.println(num + " � par!");
			}
			else{
				System.out.println(num + " � �mpar!");
			}
			
		}
		

	}

}
