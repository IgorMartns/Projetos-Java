package Entidades;

public class Conta {

    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public Conta(String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public Conta(String nomeTitular, int numeroConta, double depositoInicial) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        deposito(depositoInicial);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }    
    
    public void deposito(double saldoTotal){
        saldo += saldoTotal;
    }
    
    public void retirada(double saldoTotal){
        saldo -= saldoTotal + 5;
    }

    @Override
    public String toString() {
        return "Entidades{" + "nomeTitular: " 
                + nomeTitular 
                + ", numeroConta: " 
                + numeroConta 
                + ", saldo R$" 
                + saldo + '}';
    }    
}
    

