import java.util.Random;

public class ContaBanco {
    private String titular;
    private String tipo;
    private int numeroConta;
    private float saldo;
    private boolean ativo;


    
    public ContaBanco() {
        Random rd = new Random();
        this.numeroConta = rd.nextInt(99999) + 11111;
    }


    public String Sacar(float valor){
       if(this.ativo){
         if(valor >=0 ){
            return "Valor Invalido!";
        }
        this.setSaldo(this.getSaldo() + valor);
        return "Saque no valor de: " + valor + " Realizado com Sucesso!!";
       } 
       return "Impossivel Sacar, Conta Fechada!";
    }

    public String depositar(float valor){
        if(this.ativo){
            if(valor >=0){
            return "Valor Invalido!!";
        } else if(valor > saldo){
            return "Saldo Insuficiente!!";
        }
        this.setSaldo(this.getSaldo() - valor);
        return "Deposito no Valor de: " + valor + " Realizado com Sucesso!";
        }
        return "Impossivel Depositar, Conta Fechada!";
    }


    public String criarConta(){
        if(this.ativo){
            return "Conta já está ativa";
        }
        this.setTitular(titular);
        return "";
    }

    public String exibirDetalhes(){
        String aux;
        if(this.ativo){
            aux = "Ativa";

        }else{
            aux = "Desativada";
        }
        return "Titular da Conta: " + this.getTitular() +
                "Numero Da Conta: " + this.getNumeroConta() +
                "Tipo de Conta" + this.getTipo() +
                "Saldo da Conta: R$" + this.getSaldo() +
                "Status da Conta: " + aux; 
    }



    public String getTitular() {
        return titular;
    }

    public String setTitular(String titular) {
        if(titular.isEmpty()){
            return "Por favor Insira um nome valido";
        }
        this.titular = titular;
            return "";

    }

    public String getTipo() {
        return tipo;
    }

    public String setTipo(String tipo) {
        if(tipo.equalsIgnoreCase("CC")){
            this.tipo = "CC";
            return "Conta Corrente Definida";
        }else if(tipo.equalsIgnoreCase("CP")){
            this.tipo = "CP";
            return "Conta Poupança Definida";
        }else{
            return "Tipo Invalido";
        }
        
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }



    
    
}
