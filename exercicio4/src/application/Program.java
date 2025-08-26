package application;

public class Program {

	public static void main(String[] args) {
		
		double[] faturamento = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
		
		double somaTotal = 0.0;
		
		for (double valor : faturamento) {
			somaTotal += valor;
		}
		
		int estado = 0;
		for (double valor : faturamento) {
			double porcentagemEstado = valor / somaTotal * 100;
			switch(estado) {
			case 0:
				System.out.printf("São Paulo com faturamento de R$ %.2f representa %.1f%% do valor total mensal da distribuidora.\n", valor, porcentagemEstado );
				estado++;
				break;
			
			case 1:
				System.out.printf("Rio de Janeiro com faturamento de R$ %.2f representa %.1f%% do valor total mensal da distribuidora.\n", valor, porcentagemEstado );
				estado++;
				break;
				
			case 2:
				System.out.printf("Minas Gerais com faturamento de R$ %.2f representa %.1f%% do valor total mensal da distribuidora.\n", valor, porcentagemEstado );
				estado++;
				break;
				
			case 3:
				System.out.printf("Espírito Santo com faturamento de R$ %.2f representa %.1f%% do valor total mensal da distribuidora.\n", valor, porcentagemEstado );
				estado++;
				break;
				
			case 4:
				System.out.printf("Outros estados com faturamento de R$ %.2f representa %.1f%% do valor total mensal da distribuidora.\n", valor, porcentagemEstado );
				break;
				
				
			}
		}
		
	}

}
