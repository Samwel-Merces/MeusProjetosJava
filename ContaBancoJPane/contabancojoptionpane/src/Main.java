
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {


        String men [] = {"Abrir Conta","Depositar","Sacar","Exibir Dados","Fechar Conta"};
       
        ContaBanco c1 = new ContaBanco();


    Boolean cont = true;
    while (cont) { 
        
    


    int op = JOptionPane.showOptionDialog(null,
    "Escolha Como Prosseguir",
    "Sistema Bancario",
    JOptionPane.DEFAULT_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    men,
    men
    );


    switch (op) {
        case 0:

            try {
                String nome = JOptionPane.showInputDialog(null, "Digite o nome do Titular");

            if(nome == null || nome.isBlank()){
                JOptionPane.showMessageDialog(null, "Erro ao Definir Nome");
            continue;
            }

             String tpv [] = {"Conta Poupança", "Conta Corrente"};
            
            int op2 = JOptionPane.showOptionDialog(null,
            "",
            "Escolha o Tipo de Conta",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            tpv,
            tpv
            );
            String tipo;

            if(op2 ==0){
                 tipo = "CP";
            } else if(op2 == 1){
                 tipo = "CC";
            } else{
                JOptionPane.showMessageDialog(null,"Erro Ao Definir tipo");
                continue;
            }


            c1.criarConta(nome,tipo);
                
            } catch (IllegalArgumentException | IllegalStateException e) {
               JOptionPane.showMessageDialog(
                null,
                e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
               );
            }
            
            

            

            


            
            
            
            break;
        case 1:
            
            break;
        case 2:
            
            break;
        case 3:
            JOptionPane.showMessageDialog(null, c1.exibirDetalhes());
            
            break;
        case 4:
            
            break;
        default:
            JOptionPane.showMessageDialog(null,
            "Encerrando Programa....");
            cont = false;
    }
        
        
    }
}
}
