package Ex9_ResultadoQuadrado;

import java.util.Scanner;

public class Ex9_ResultadoQuadrado {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro n�mero: ");
		int a = sc.nextInt();
		
		System.out.println("Segundo n�mero");
		int b = sc.nextInt();
		
		double valorA = Math.pow(a, 2);
		
		double valorB = Math.pow(b, 2);
		
		double diferenca = valorB - valorA;
		
		System.out.println("Primeiro n�mero ao quadrado: "+valorA);

		System.out.println("Segundo n�mero ao quadrado: "+valorB);
		
		System.out.println("A diferen�a entre os dois � de: "+diferenca);
		
		
		sc.close();
	}

}
