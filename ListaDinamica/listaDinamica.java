
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class listaDinamica {

public static void main(String[] args) {
    
    JOptionPane.showMessageDialog(null, "Seja bem Vindo A lista Dinamica \n Adicione e remova itens a vontade");

    boolean continuar = true;
     ArrayList<String> lista = new ArrayList<>();

    while(continuar){
   
    String var1 [] = {"Adicionar","Remover","Exibir Lista","Encerrar Programa"};

    int op = JOptionPane.showOptionDialog(
    null,
    "Adicionar Item | Remover Item | Exibir Lista | Fechar Programa",
    "O Que deseja fazer",
    JOptionPane.DEFAULT_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    var1,
    var1[0]
    );

    if(op==0){
        String addItem = JOptionPane.showInputDialog(null,"Digite o Item a ser adicionado na lista");
        if(addItem !=null && !addItem.trim().isEmpty()){
            lista.add(addItem);
            JOptionPane.showMessageDialog(null,"Item adicionado com Sucesso!");
             System.out.println(lista);
        }else{
        JOptionPane.showMessageDialog(null,"Item não pode ser vazio","Erro!!",JOptionPane.ERROR_MESSAGE);
        }
    }else if(op==1){
       String remoitem = JOptionPane.showInputDialog(null,"Digite o item a ser removido");
       boolean remove = lista.remove(remoitem);
       if(remove){
        JOptionPane.showMessageDialog(null,"Item removido com sucesso!!");
       } else {
        JOptionPane.showMessageDialog(null, "Item não encontrado","Erro!!!",JOptionPane.ERROR_MESSAGE);
       }
    } else if(op==2){
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "lista está vazia","ERRO!",JOptionPane.ERROR_MESSAGE);
        } else{
        JOptionPane.showMessageDialog(null,lista);
        }
    } else {
        JOptionPane.showMessageDialog(null,"Encerrando programa.....");
        continuar = false;
    }

    }
}
    
}
