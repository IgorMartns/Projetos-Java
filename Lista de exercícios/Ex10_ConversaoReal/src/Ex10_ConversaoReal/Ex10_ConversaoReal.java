package Ex10_ConversaoReal;

import java.util.Scanner;

public class Ex10_ConversaoReal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor da cota��o do d�lar: ");
		double cotacao = sc.nextDouble();
		
		System.out.println("Quantia de d�lares para a conver��o: ");
		double qtdDolar = sc.nextDouble();
		
		double conversao = qtdDolar * cotacao;
		
		System.out.println("O valor da convers�o de reais para d�lares foi de "
				+ "US$"+String.format("%.2f", conversao));
		
		
		
		sc.close();
	}

}
