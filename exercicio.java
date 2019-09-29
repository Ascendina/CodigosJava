import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner (System.in);
		int num = 0;
		int max = 0;
		int min = 10000;
		
		for(int i = 0; i < 3; i = i + 1){	
			//Obtendo novo dado
			System.out.println("Digite um número: ");
			num = console.nextInt();
			
			//encontrando valor min
			if(num < min){
				min = num;
			}
			
			//encontrando valor max
			if(num > max){
				max = num;
			}
			
		}
		
		System.out.println("Valor máximo: " + max);
		System.out.println("Valor mínimo: " + min);
		

	}

}
