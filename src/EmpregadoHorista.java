import java.text.DecimalFormat;

public class EmpregadoHorista extends Empregado{

    int totalDeHorasrabalhadas;
    double valorDaHoraTrabalhada;

    public double calcularSalario(){
        return totalDeHorasrabalhadas * valorDaHoraTrabalhada;
    }

    public String toString(){
        DecimalFormat dF = new DecimalFormat("R$#,##0.00");
        String aux = super.toString();
        aux += "Total de horas trabalhadas:" + totalDeHorasrabalhadas + "\n";
        aux += "Valor da hora trabalhada:" + dF.format(valorDaHoraTrabalhada);
        return aux;
    }
}
