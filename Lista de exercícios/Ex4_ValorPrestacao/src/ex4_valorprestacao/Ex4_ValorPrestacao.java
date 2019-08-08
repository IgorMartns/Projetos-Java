package ex4_valorprestacao;

import java.util.Scanner;

public class Ex4_ValorPrestacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do produto: ");
        double valor = sc.nextDouble();
        
        System.out.println("Taxa da pretação: ");
        double taxa = sc.nextDouble();
        
        System.out.println("Tempo da prestação: ");
        double tempo = sc.nextDouble();
        
        double prestacao = valor + (valor * (taxa/100) * tempo);
        
        System.out.println("O valor da prestação é de R$"+prestacao);
    }
    
}
