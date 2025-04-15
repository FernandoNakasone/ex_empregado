import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado{

    double totalDeVendas;
    double comissao;

    public double calcularSalario(){
        return totalDeVendas * comissao / 100;
    }

    public String toString(){
        DecimalFormat dF = new DecimalFormat("#,##0.00");

        String aux = super.toString();
        aux += "Total de vendas:" + dF.format(totalDeVendas) + "\n";
        aux += "Comissão:" + dF.format(comissao) + "%";
        return aux;
    }
}
