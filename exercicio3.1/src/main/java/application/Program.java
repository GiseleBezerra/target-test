package application;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Object ob = new JSONParser().parse(new FileReader("dados.json"));
        JSONArray jsonArray = (JSONArray) ob;
        
        double[] faturamento = new double[30];
        
        int i = 0;
        for (Object obj : jsonArray) {
            JSONObject faturamentoDia = (JSONObject) obj;
            
            Double valor = (Double) faturamentoDia.get("valor");
            
            faturamento[i] = valor;
            i++;
            
            
        }
        
        double menorValor = faturamento[0];
		double maiorValor = faturamento[0];
		
		for (double valor : faturamento) {
			if (valor > maiorValor) {
				maiorValor = valor;
			}
			
			if (valor < menorValor && valor != 0) {
				menorValor = valor;
			}
		}
		
		double somaFaturamento = 0.0;
		double mediaFaturamento = 0.0;
		int qtdDiasFaturamentoZero = 0;
		for (double valor : faturamento) {
			if (valor != 0) {
				somaFaturamento += valor;
			}
			else {
				qtdDiasFaturamentoZero++;
			}
		}
		
		mediaFaturamento = somaFaturamento / faturamento.length - qtdDiasFaturamentoZero;
		
		int qtdDiasSuperiorMediaFaturamento = 0;
		for (double valor : faturamento) {
			if (valor > mediaFaturamento) {
				qtdDiasSuperiorMediaFaturamento++;
			}
		}
		
		System.out.println("O menor valor de faturamento é: " + menorValor);
		System.out.println("O maior valor de faturamento é: " + maiorValor);
		System.out.println("Quantidade de dias em que o valor de faturamento diário foi superior à média mensal: " + qtdDiasSuperiorMediaFaturamento);
    }
}