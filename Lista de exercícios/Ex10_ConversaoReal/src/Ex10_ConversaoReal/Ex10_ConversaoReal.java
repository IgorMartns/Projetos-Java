package Ex10_ConversaoReal;

import java.util.Scanner;

public class Ex10_ConversaoReal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor da cotação do dólar: ");
		double cotacao = sc.nextDouble();
		
		System.out.println("Quantia de dólares para a converção: ");
		double qtdDolar = sc.nextDouble();
		
		double conversao = qtdDolar * cotacao;
		
		System.out.println("O valor da conversão de reais para dólares foi de "
				+ "US$"+String.format("%.2f", conversao));
		
		
		
		sc.close();
	}

}
