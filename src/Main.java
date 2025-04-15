public class Main {
    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];

        empregado[0] = new EmpregadoComissionado(1231231,"A",1245,100);
        empregado[1] = new EmpregadoHorista(11231,"B",12245,70);
        empregado[2] = new EmpregadoComissionado(121,"C",22645,60);

        for (Empregado e : empregado){
            System.out.println(e);
            System.out.println("------------------------------------------------------------------------------------");
        }

    }
}
