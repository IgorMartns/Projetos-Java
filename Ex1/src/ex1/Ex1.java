package ex1;

import java.util.Scanner;
import entities.Retângulo;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retângulo retangulo = new Retângulo();

        System.out.println("Entre com a base do retângulo: ");
        retangulo.base = sc.nextDouble();

        System.out.println("Entre com a altura do retângulo: ");
        retangulo.altura = sc.nextDouble();
        
        System.out.println("AREA = "+retangulo.area());
        System.out.println("Perimetro = "+retangulo.perimetro());
        System.out.println("Diagonal = "+retangulo.diagonal());
        
        sc.close();
    }

}
