package Conta;

import Entidades.Conta;
import java.util.Scanner;

public class CadastroConta {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Conta conta;
        
        System.out.println("Entre com o número da conta: ");
        int numeroConta = sc.nextInt();
        
        System.out.println("Entre com o titular da conta: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        
        System.out.println("Deseja fazer um depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);
        
        if (resposta == 's'){
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(nomeTitular, numeroConta, depositoInicial);
        }
        else {
            conta = new Conta(nomeTitular, numeroConta);
        }
        
        System.out.println("");
        System.out.println("Dados da conta: ");
        System.out.println(conta);
        
        System.out.println("");
        System.out.print("Entre com um valor de depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados atualizados: ");
        System.out.println(conta);
        
        System.out.println("");
        System.out.print("Entre com um valor de saque: ");
        double valorSaque = sc.nextDouble();
        conta.retirada(valorSaque);
        System.out.println("Dados atualizados: ");
        System.out.println(conta);
    
    }
    
}
