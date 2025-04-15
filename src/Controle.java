public class Controle {

    final int N = 10;
    private int index = 0;
    private Empregado[] list = new Empregado[N];

    public void  inserir(Empregado empregado){
        this.list[index++] = empregado;
    }

    public Empregado pesquisar(long matricula){

        for(int i=0;i<index;i++){
            if (list[i].matricula == matricula){
                return list[i];
            }
        }
        return null;
    }

    public String listar(){

        String aux = "";

        for (int i=0;i<index;i++){
            aux += list[i].toString() + "\n";
            aux += "----------------------------------------------------------------------------------";
        }
        return aux;
    }
}
