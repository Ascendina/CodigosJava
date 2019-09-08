import java.util.Scanner;

public class ExercicioIfElse {

	public static void main(String[] args) {
		//Obtem dado
		/*Scanner console = new Scanner(System.in);
		System.out.println("Digite um número:");
		int n1 = console.nextInt();
		
		System.out.println("Digite outro número: ");
		int n2 = console.nextInt();
		
		//Escolhe e imprime
		if(n1>n2){
			System.out.println(n1);
		}
		else{
			System.out.println(n2);
		}*/
		
		/*Scanner console = new Scanner(System.in);
		System.out.println("Digite uma letra (F ou M):");
		String letra = console.next();
		
		if(letra.equals("M")){
			System.out.println("Masculino");
		}
		else if(letra.equals("F")){
			System.out.println("Feminino");
		}
		else{
			System.out.println("Sexo Inválido!");
		}*/
		
		/*Scanner console = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String nome = console.next();
		
		if(nome.equals("a") || nome.equals("e") || nome.equals("i") || nome.equals("o") || nome.equals("u") ){
			System.out.println("É Vogal!");
		}
		else{
			System.out.println("É Consoante!");
		}*/
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		float nota1 = console.nextFloat();
		
		System.out.println("Digite outra nota: ");
		float nota2 = console.nextFloat();
		
		
		float media = (nota1 + nota2)/2;
		
		if(media >= 7 && media < 10){
			System.out.println("Aprovado!");
		}
		else if(media < 7){
			System.out.println("Reprovado!");
		}
		else if(media == 10){
			System.out.println("Aprovado com distinção!");
		}
	}

}
