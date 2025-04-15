import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado{

    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public double calcularSalario(){
        return totalDeVendas * comissao / 100;
    }

    public String toString(){
        DecimalFormat dF = new DecimalFormat("#,##0.00");

        String aux = super.toString();
        aux += "Total de vendas:R$" + dF.format(totalDeVendas) + "\n";
        aux += "Comissão:" + dF.format(comissao) + "% \n";
        aux += "Salario:R$" + dF.format(calcularSalario()) + "\n";
        return aux;
    }
}
