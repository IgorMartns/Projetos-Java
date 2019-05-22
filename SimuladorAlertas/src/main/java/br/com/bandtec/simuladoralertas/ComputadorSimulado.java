package br.com.bandtec.simuladoralertas;

import java.util.ArrayList;
import java.util.List;

public class ComputadorSimulado {

//Atributos da classe 
    private String nomeComputador;
    private double temperaturaMaximaPermitida;
    private double temperaturaMinimaPermitida;
    public double temperaturaAtual = 47.0;
    private List<Double> temperaturasMonitoradas = new ArrayList<>();

    public ComputadorSimulado(String nome, Double tempMax, Double tempMin) {
        nomeComputador = nome;
        temperaturaMaximaPermitida = tempMax;
        temperaturaMinimaPermitida = tempMin;
    }

    ComputadorSimulado(String lenovo, int i, int i0, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void temperaturaDentroDoPermitido() {
        
        //Mostro a temperatura atual 
        System.out.println("Temperatura: " + temperaturaAtual);
        
        //Verifica se a temperatura está abaixo do permitido
        if (temperaturaAtual < temperaturaMinimaPermitida) {
            System.out.println("Temperatura abaixo do permitido, ALERTA!!!");
        } 
        //Verifica se a temperatura está acima do permitido
        else if (temperaturaAtual > temperaturaMaximaPermitida) {
            System.out.println("Temperatura acima do permitido, ALERTA!!!");
        } 
        //Se ela não estiver nem acima e nem abaixo, só mostro que a temperatura está ok!
        else {
            System.out.println("Temperatura ok");
        }
        // metodo size() de uma lista, me retornar o tamanho dela.
        // se a lista tiver, 10 itens, size() me retorna o número 10.
        System.out.println("Quantidade de temperaturas monitoradas: "
                + temperaturasMonitoradas.size());
        
        Double tempMedia = 0.0;
        for (int i = 0; i < temperaturasMonitoradas.size(); i++) {
        // pego o item no indice i e adiciono no temp media
        // o metodo get(), é igual quando escrevo um array e quero um elemento em certo indice,
        // lá escreve nomeArray[indice], em lista é nomeLista.get(indice).
        tempMedia += temperaturasMonitoradas.get(i);
        }
    }

    public void setTemperatura(Double novaTemperatura) {
        temperaturaAtual = novaTemperatura;
        temperaturasMonitoradas.add(novaTemperatura);
    }

}
