import java.util.Scanner;

public class duvidas1VA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		//respostas positivas
		int contador = 0;
		System.out.println("Preciso fazer algumas perguntas.");
		System.out.println("Telefonou para a v�tima?");
		String resposta = console.next();
		
		if(resposta.equals("sim")){
			contador = contador + 1;
		}
		
		System.out.println("Esteve no local do crime? ");
		resposta = console.next();
		
		if(resposta.equals("sim")){
			contador = contador + 1;
		}
		
		System.out.println("Mora perto da v�tima? ");
		resposta = console.next();
		
		if(resposta.equals("sim")){
			contador = contador + 1;
		}
		
		System.out.println("Devia para a v�tima? ");
		resposta = console.next();
		
		if(resposta.equals("sim")){
			contador = contador + 1;
		}
		
		System.out.println("J� trabalhou com a v�tima? ");
		resposta = console.next();
		
		if(resposta.equals("sim")){
			contador = contador + 1;
		}
		
		/*Processamento*/
		if(contador == 2){
			System.out.println("Pessoa SUSPEITA!");
		}
		else if(contador >= 3 && contador <= 4){
			System.out.println("Esta pessoa � um CUMPLICE!");
		}
		else if(contador == 5){
			System.out.println("Vc achou o ASSASSINO!");
		}
		else{
			System.out.println("INOCENTE!");
		}
		
	}

}
