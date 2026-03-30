import java.util.ArrayList;

public class Banco {
    String nome;
    ArrayList<Conta> contas;
    Usuario usuario;

    public Banco() {
      this.contas = new ArrayList<>();
      
    }




    @Override
    public String toString() {
      if(contas.isEmpty()){
        return "Nenhuma conta para Exibir";
      }
      return "Banco: contas: " + contas + "";
    }




    public String exibirContas(){ 
      return contas.toString();
    }

}
