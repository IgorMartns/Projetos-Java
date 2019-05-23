package cursojava;

import Util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class CursoJava {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Calculator calc = new Calculator();

        System.out.println("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);

        double v = calc.volume(raio);

        System.out.println("Cirfunferencia: " + c);
        System.out.println("Cirfunferencia: " + v);
        System.out.println("Valor de PI: " + calc.PI);

        sc.close();

    }

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
        
    }    

    public static double volume(double raio) {
            
        return 4.0 * PI * raio * raio * raio / 3;
    }

}
