
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        //Este é um Projeto muito simples que fiz baseado na aula do 5 do curso de POO do Professor Gustavo Guanabara

        Scanner sc = new Scanner(System.in);

         Conta conta = new Conta();

        int opcao;

        System.out.println(" ____                  _    _ _           _\r\n" + //
                        "| __ )  ___ _ __ ___  | |  | (_)_ __   __| | ___\r\n" + //
                        "|  _ \\ / _ \\ '_ ` _ \\ | |  | | | '_ \\ / _` |/ _ \\\r\n" + //
                        "| |_) |  __/ | | | | || |__| | | | | | (_| | (_) |\r\n" + //
                        "|____/ \\___|_| |_| |_| \\____/|_|_| |_|\\__,_|\\___/\r\n" + //
                        "");

        System.out.println("==== SISTEMA BANCÁRIO ====");

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Abrir Conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Pagar Mensalidade");
            System.out.println("5 - Exibir Dados da Conta");
            System.out.println("6 - Fechar Conta");
            System.out.println("0 - Encerrar");

            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    if (!conta.getStatus()) {
                        System.out.print("Digite o Nome do Titular: ");
                        conta.setTitular(sc.nextLine());

                        System.out.print("Digite o Número da Conta: ");
                        conta.setNumConta(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Digite o tipo (CC/CP): ");
                        String tipo = sc.nextLine();

                        conta.abrirConta(tipo);
                    } else {
                        System.out.println("Conta já está aberta!");
                    }
                    break;

                case 2:
                    if (conta.getStatus()) {
                        System.out.print("Valor do depósito: ");
                        float dep = sc.nextFloat();
                        conta.depositar(dep);
                    } else {
                        System.out.println("A conta precisa estar aberta!");
                    }
                    break;

                case 3:
                    if (conta.getStatus()) {
                        System.out.print("Valor do saque: ");
                        float saque = sc.nextFloat();
                        conta.sacar(saque);
                    } else {
                        System.out.println("A conta precisa estar aberta!");
                    }
                    break;

                case 4:
                    conta.pagarMensal();
                    break;

                case 5:
                    conta.exibirConta();
                    break;

                case 6:
                    conta.fecharConta();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema... até mais!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();

        

        
        
    }
}
