import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//b^n = b xbxbx...xb (n vezes)
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite a base (b): ");
		int b = console.nextInt();
		
		System.out.println("Digite o expoente (n): ");
		int n = console.nextInt();
		
		int mult = 1;
		
		for(int i = 0; i < n; i = i + 1){
			mult = mult * b;
		}

		System.out.println("Resultado: " + mult);
	}

}
