
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
            "Receba um Bonus\nPoupança R$150\nCorrente R$50",
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
            while (true) { 

            try {
               
                String input = JOptionPane.showInputDialog(null, "Digite o Valor Do Deposito");

                        if(input == null || input.isBlank()){
                         JOptionPane.showMessageDialog(null,"Deposito Cancelado");
                         break;
                               
                        } 
                input = input.replace(",",".");
                
                float valor = Float.parseFloat(input);
                c1.depositar(valor);
                JOptionPane.showMessageDialog(null, "Deposito no Valor de R$" + valor + " Realizado Com Sucesso!");
                break;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro!! Digite Um Valor Valido");    
            } catch (IllegalArgumentException | IllegalStateException e) {
               JOptionPane.showMessageDialog(
                null,
                e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
               ); 
            
               }
            }
            break;
        case 2:
            while (true) { 

            try {
                String input = JOptionPane.showInputDialog(null, "Digite o Valor Do Saque");

                        if(input == null || input.isBlank()){
                         JOptionPane.showMessageDialog(null,"Saque Cancelado");
                         break;
                               
                        } 
                input = input.replace(",",".");
                
                float valor = Float.parseFloat(input);
                c1.sacar(valor);
                JOptionPane.showMessageDialog(null, "Saque no Valor de R$" + valor + " Realizado Com Sucesso!");
                break;
                        

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro!! Digite Um Valor Valido");    
            } catch (IllegalArgumentException | IllegalStateException e) {
               JOptionPane.showMessageDialog(
                null,
                e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
               ); 
            
               }
            }
            break;
        case 3:
            try {
                JOptionPane.showMessageDialog(null, c1.exibirDetalhes());   
            } catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(null,
                e.getMessage(),
                "ERRo!",
                JOptionPane.ERROR_MESSAGE
                );
            }
            
            
            break;
        case 4:
            try {
                c1.fecharConta();
                JOptionPane.showMessageDialog(null, "Conta Fechada Com Sucesso!","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        
            } catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                "ERRO!",
            JOptionPane.ERROR_MESSAGE
            );
            }
            
            break;
        default:
            JOptionPane.showMessageDialog(null,
            "Encerrando Programa....");
            cont = false;


            }
        }
        
    }
}

