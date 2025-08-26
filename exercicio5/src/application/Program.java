package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String texto = sc.nextLine();
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			char item = texto.charAt(i);
			System.out.println(item);
		}
		
		sc.close();
	}

}
