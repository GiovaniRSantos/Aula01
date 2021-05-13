import java.util.Scanner;

public class ProgramaNome {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		var nome = leitor;
		var sobrenome = leitor;
		
		System.out.println("Por favor, digite seu nome completo");
		System.out.println("Olá " + nome.nextLine());
		//nextLine() serve para guardar mais de uma string ao digitar no leitor
		
		leitor.close();
		//Após terminar de usar a instancia do obj, deve desligar usando .close();
	}
}
