package br.com.bandtec.simuladoralertas;

public class Simulador {

    public static void main(String[] args) {
        
        // para acessar a variavel meuPC de dentro do metodo run, tenho que deixar ela como final.
        // variaveis final são variaveis que não podem ter seu valor atribuido após a declaração.
        // ex: final int i = 0;
        // i = 3;
        // no i = 3; daria erro porque já atribui valor para a variavel i antes e ela não pode ter o valor 
        // mudado.
    final ComputadorSimulado meuPC = new ComputadorSimulado("Lenovo", 65.0, 20.0);
        
        meuPC.temperaturaDentroDoPermitido();
                // crio um objeto do tipo Thread.
                // instancio ele com o new Thread().
                // essa {} com um metodo run dentro. é uma função anonima, 
                //mas não se preocupe em entender o que é isso.
                // se preocupe em entender como eu faço a thread e onde coloco o código 
                //que vai ser executado na thread.
                
        Thread monitoramentoAlerta = new Thread() {
        @Override
        public void run() {
            
                //Tudo que vai ser executado na Thread, tem que ser colocado aqui 
                //Fazer o while rodar eternamente.
            while (true) {
                
                // para não atribuir sempre o mesmo valor para a temperatura.
                // uso esse metodo que me retorna um numero randomico entre 0 e 1, multiplico esse número 
                // por 100.    
            meuPC.temperaturaAtual = Math.random() * 100;
            meuPC.temperaturaDentroDoPermitido();
            meuPC
            
                // faço a thread dormir por 2000 milisegundos(2 segundos).
                // depois desses 2000 milisegundos, o for será executado novamente.
                // esse try catch é paro caso se der erro, não parar a execução, já o Thread.sleep está 
                // dentro de um loop infinito, o netbeans fala para colocar isso.
            try{
                Thread.sleep(2000);
            } catch (InterruptedException ex) {}
                }
            }
        };
        
    //Toda vez que crio uma Thread tenho que iniciar ela
        monitoramentoAlerta.start();
    }
    
}
