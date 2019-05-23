package ex2;

import entities.Funcionario;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.println("Seu nome: ");
        func.nome = sc.nextLine();

        System.out.println("Seu sálario bruto: ");
        func.salarioBruto = sc.nextDouble();

        System.out.println("Qual a taxa: ");
        func.taxa = sc.nextDouble();

        System.out.println("Empregado: " + func);

        System.out.println("Qual a porcentagem de aumento do sálario?");
        double porcentagem = sc.nextDouble();
        func.aumentarSalario(porcentagem);
        
        System.out.println("Dados atualizados: "+func);

    }

}
