
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {


        String men [] = {"Abrir Conta","Depositar","Sacar","Exibir Dados","Fechar Conta"};

        ContaBanco c1 = new ContaBanco();


    Boolean cont = true;
    while (cont) { 
        
    


    int op = JOptionPane.showOptionDialog(null,
    "men",
    "title",
    JOptionPane.DEFAULT_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    men,
    men
    );


    switch (op) {
        case 0:
            try { String nome = JOptionPane.showInputDialog(null, "Digite o nome do Titular");
            c1.criarConta()

                
            } catch (Exception e) {
            }
            
            break;
        case 1:
            
            break;
        case 2:
            
            break;
        case 3:
            
            break;
        case 4:
            
            break;
        default:
            JOptionPane.showMessageDialog(null,
            "Encerrando Programa....");
    }
        
        
    }
}
}
