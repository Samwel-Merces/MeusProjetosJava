import java.util.ArrayList;
import  java.util.Random;

public class Conta {
    Random rd = new Random();
    int id;
    Usuario usuario;
    double saldo;
    boolean ativo;
    ArrayList<String> extrato;
   

    public Conta(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0;
        this.ativo = true;
        this.id = rd.nextInt(9999) + 1000;
        this.extrato = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

  // Metodos
        public void sacar(double valor) {
            if(valor <=0) {
                throw new IllegalArgumentException("Valor invalido!");
            }
            if(valor > this.saldo){
            throw new IllegalArgumentException("Saldo Insuficiente!");
        } 
            this.saldo -= valor;
            String op = String.format("Saque - Valor R$ %.2f", valor);

            extrato.add(op);

        }

        public void depositar(double valor)throws Exception{
            if(valor <=0){
                throw new Exception("Valor Invalido");
            }
            this.saldo += valor;
            String op = String.format("Deposito - Valor R$ %.2f", valor);

            extrato.add(op);
        }


        public ArrayList<String> exibirExtrato(){
            return extrato;
        }
   
}
