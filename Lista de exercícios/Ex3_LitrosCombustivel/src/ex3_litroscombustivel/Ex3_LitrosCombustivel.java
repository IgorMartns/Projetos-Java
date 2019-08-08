package ex3_litroscombustivel;

import java.util.Scanner;

public class Ex3_LitrosCombustivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tempo gasto na viagem: ");
        double tempo = sc.nextDouble();
        
        System.out.println("Velocidade média do veiculo: ");
        int velocidade = sc.nextInt();
        
        double distancia = tempo * velocidade;
        
        double litrosUsados = distancia / 12;
        
        System.out.println("A velocidade média do carro foi: "+velocidade);
        System.out.println("O tempo gasto na viagem foi: "+tempo);
        System.out.println("A distância percorrida foi "+distancia);
        System.out.println("Foram utilizados "+litrosUsados+" litros de"
                + " gasolina");
        
        
    }
    
}
