import java.util.Scanner;

public class TerceiraQuestao {

	public static void main(String[] args) {
		//Chamando a biblioteca de console
		Scanner console = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		int num = console.nextInt();
		
		if(num > 50){
			System.out.println("O número é maior que 50.");
		}
		else if(num == 50){
			System.out.println("O número é 50.");
		}
		else{
			System.out.println("O número é menor que 50.");
		}

	}

}
