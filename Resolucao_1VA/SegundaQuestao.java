import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) {
		//Chamando a biblioteca de console
		Scanner console = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		
		int num = console.nextInt();
		
		if(num >= 20 && num <= 90){
			System.out.println("N�mero dentro do intervalo.");
		}
		else{
			System.out.println("N�mero fora do intervalo.");
		}

	}

}
