package operadorescomparativos;

public class OperadoresComparativos {

    public static void main(String[] args) {
      
        int a = 10;
        boolean c1 = a < 10;
        boolean c2 = a < 20;
        boolean c3 = a > 10;
        boolean c4 = a > 5;
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        System.out.println("-------------------------");
        
        boolean c5 = a <= 10;
        boolean c6 = a >= 10;
        boolean c7 = a == 10;
        boolean c8 = a != 10;
        
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        
        System.out.println("-------------------------");
        
        boolean co1 = 2 > 3 || 4 != 5;
        boolean co2 = !(2 > 3) && 4 != 5;
        
        System.out.println(co1);
        System.out.println(co2);
        
        System.out.println("-------------------------");
        
        boolean co3 = 10 > 5;
        boolean co4 = co1 || co2 && co3;
        
        System.out.println(co3);
        System.out.println(co4);
    }
    
}
