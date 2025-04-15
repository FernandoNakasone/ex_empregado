public abstract class Empregado {

    long matricula;
    String nome;


    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String toString(){
        String aux = "";
        aux += "Matricula:" + matricula + "\n";
        aux += "Nome:" + nome + "\n";
        return aux;
    }
}
