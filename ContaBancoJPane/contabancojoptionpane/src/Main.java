
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

        String men [] = {"Abrir Conta","Depositar","Sacar","Exibir Dados","Fechar Conta"};


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
