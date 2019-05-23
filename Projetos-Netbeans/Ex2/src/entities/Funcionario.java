package entities;

public class Funcionario {

    public String nome;
    public Double salarioBruto;
    public Double taxa;

    public double salarioLiquido() {
        return salarioBruto - taxa;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}
