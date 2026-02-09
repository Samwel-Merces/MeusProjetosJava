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
        this.saldo = 0f;
    }


    public void Sacar(float valor){
        if(!this.ativo){
            throw new IllegalArgumentException("Erro! Conta Inativa");
        }

        if(valor <=0){
            throw new IllegalArgumentException("Erro! Valor de Saque invalido");
        }

        this.setSaldo(this.getSaldo() - valor);

       
    }

    public String depositar(float valor){
        if(!this.ativo){
            return "Erro! Conta Fechada";
        }
        if(valor >= 0){
            return "Valor Invalido";
        }
        this.setSaldo(this.getSaldo() + valor);
        return "Deposito no valo de R$" + valor + " Realizado com Sucesso!";
    }


    public String criarConta(){
        if(this.ativo){
            return "Conta já está ativa";
        }
        this.setTitular(titular);
        return "Titular Definido com Sucesso!";
        
    }

    public String exibirDetalhes(){
        String aux;
        if(this.ativo){
            aux = "Ativa";

        }else{
            aux = "Desativada";
        }
        return "Titular da Conta: " + this.getTitular() +
                "\nNumero Da Conta: " + this.getNumeroConta() +
                "\nTipo de Conta" + this.getTipo() +
                "\nSaldo da Conta: R$" + this.getSaldo() +
                "\nStatus da Conta: " + aux; 
    }



    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular == null || titular.isBlank()){
            throw new IllegalArgumentException("Nome Invalido");
        }
        this.titular = titular;
        
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
