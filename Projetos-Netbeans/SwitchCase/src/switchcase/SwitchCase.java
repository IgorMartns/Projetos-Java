package switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        String dia;
        
        switch (x){
            case 1:
            dia = "Segunda";
            break;
        case 2:
            dia = "Terça";
            break;
        case 3:
            dia = "Quarta";
            break;
        case 4:
            dia = "Quinta";
            break;
        case 5:
            dia = "Sexta";
            break;
        case 6:
            dia = "Sábado";
            break;
        case 7:
            dia = "Domingo";
            break;
        default:
            dia = "Data inválida";
        
            System.out.println("Data inválida");
        }
        
        System.out.println("Dia: " + dia);
        
        sc.close();
    }
    
}
