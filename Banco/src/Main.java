import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de Contas Bancarias");
        Banco banco = new Banco();
        Usuario u = null;
        char op;

        while (true){
            try {
                System.out.println("----------------------------");
                System.out.println("Escolha uma Opção:");
                System.out.println("1 - Criar Usuário");
                System.out.println("2 - Criar Conta");
                System.out.println("3 - Realizar Depósito");
                System.out.println("4 - Realizar Saque");
                System.out.println("5 - Exibir Extrato");
                System.out.println("6 - Listar Contas");
                System.out.println("0 - Encerrar Programa\n");
                op = sc.next().charAt(0);
                
            } catch (Exception e) {
                System.out.println("Digite um");
                sc.nextLine();
                
            }
        
        

        switch (op) {
            case 0:
                System.out.println("Encerrando Programa....");
                return;
            case 1:
                System.out.println("Digite nome do usuario");
                String nome = sc.nextLine();
                System.out.println("Digite CPF do usuario");
                String cpf = sc.nextLine();
                System.out.println("Digite Email do Usuario");
                String email = sc.nextLine();
                System.out.println("Usuario Criado com Sucesso!");
               
            case 2:
                Conta c1 = new Conta(u);
                banco.contas.add(c1);
                System.out.println("Conta criada com Sucesso");
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                System.out.println(banco.exibirContas());
                
                break;
        
            default:
                System.out.println("Opção Invalida...");
                break;
        }
       

        }
    }
}