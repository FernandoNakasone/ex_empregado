import java.text.DecimalFormat;

public class EmpregadoHorista extends Empregado{

    int totalDeHorasrabalhadas;
    double valorDaHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasrabalhadas, double valorDaHoraTrabalhada) {
        super(matricula, nome);
        this.totalDeHorasrabalhadas = totalDeHorasrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public double calcularSalario(){
        return totalDeHorasrabalhadas * valorDaHoraTrabalhada;
    }

    public String toString(){
        DecimalFormat dF = new DecimalFormat("#,##0.00");
        String aux = super.toString();
        aux += "Total de horas trabalhadas:" + totalDeHorasrabalhadas + "\n";
        aux += "Valor da hora trabalhada:R$" + dF.format(valorDaHoraTrabalhada);
        aux += "Salario:R$" + dF.format(calcularSalario());
        return aux;
    }
}
