package entities;

public class Notas {

    public String nome;
    public Double Trimestre1;
    public Double Trimestre2;
    public Double Trimestre3;
    
    public double finalSemestre() {
        return Trimestre1 + Trimestre2 + Trimestre3;
    }
    public double notaMinima() {
        if (finalSemestre() < 60) {
            return 60 - finalSemestre();
        } else {
            return 0;
        }
    }
}
