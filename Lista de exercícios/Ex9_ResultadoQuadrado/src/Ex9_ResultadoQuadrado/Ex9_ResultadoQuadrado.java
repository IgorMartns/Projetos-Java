package Ex9_ResultadoQuadrado;

import java.util.Scanner;

public class Ex9_ResultadoQuadrado {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro número: ");
		int a = sc.nextInt();
		
		System.out.println("Segundo número");
		int b = sc.nextInt();
		
		double valorA = Math.pow(a, 2);
		
		double valorB = Math.pow(b, 2);
		
		double diferenca = valorB - valorA;
		
		System.out.println("Primeiro número ao quadrado: "+valorA);

		System.out.println("Segundo número ao quadrado: "+valorB);
		
		System.out.println("A diferença entre os dois é de: "+diferenca);
		
		
		sc.close();
	}

}
