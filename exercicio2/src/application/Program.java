package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();

		int a = 0;
		int b = 1;
		
		while (a < numero) {
			int calc = a + b;
			a = b;
			b = calc;
		}
		
		if (a == numero) {
            System.out.printf("O número %d pertence à sequência de Fibonacci.\n", numero);
        } else {
            System.out.printf("O número %d não pertence à sequência de Fibonacci.\n", numero);
        }
		
			sc.close();
			
	}

}
