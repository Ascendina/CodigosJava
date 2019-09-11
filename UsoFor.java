import java.util.Scanner;

public class UsoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i = 0; i<= 5; i = i + 1){
			System.out.println(i);
		}*/

		
	/*Mostrar no console os números pares entre 0 e 50*/
		
		//PARES
		/*for(int i = 0; i <= 50; i = i + 2){
			System.out.println(i);
		}
		
		for(int i = 0; i <= 50; i = i + 1){
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
		
		//IMPARES
		for(int i = 1; i <= 50; i = i + 2){
			System.out.println(i);
		}
		
		for(int i = 0; i <= 50; i = i + 1){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}*/
		
		
		/*Pegar 5 notas com o usuário e apresentar
		 * a média no console*/
		
		Scanner console = new Scanner(System.in);
		
		float nota = 0;
		float media = 0;
		
		for(int i = 0; i < 5; i = i + 1){
			//Obtendo nota
			System.out.println("Digite uma nota: ");
			nota = console.nextFloat();
			
			//Calculando média
			media = media + nota;
		}
		
		System.out.println(media/5);
		
		
	}

}
