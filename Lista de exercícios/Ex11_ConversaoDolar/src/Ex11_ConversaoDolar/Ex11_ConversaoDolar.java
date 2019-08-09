package Ex11_ConversaoDolar;

import java.util.Scanner;

public class Ex11_ConversaoDolar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("valor da cotação do dólar: ");
		double cotacao = sc.nextDouble();

		System.out.println("Quantia de reais para a conversao: ");
		double reais = sc.nextDouble();

		double conversao = reais / cotacao;

		System.out.println("O valor da conversão de dólares para reais foi de "
				+ "R$"+ String.format("%.2f", conversao));

		sc.close();

	}
}
