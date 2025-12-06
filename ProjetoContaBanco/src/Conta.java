public class Conta {

    private int numConta;
    private String tipo;
    private String titular;
    private float saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public void exibirConta() {
        System.out.println("----------------------");
        System.out.println("Titular: " + getTitular());
        System.out.println("Tipo de conta: " + getTipo());
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Saldo Atual: " + getSaldo());
        System.out.println("Status da Conta: " + getStatus());
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);

        if (t.equalsIgnoreCase("CC")) {
            this.saldo = 50;
        } else if (t.equalsIgnoreCase("CP")) {
            this.saldo = 150;
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta não pode ser fechada: saldo positivo!");
        } else if (saldo < 0) {
            System.out.println("Conta não pode ser fechada: está em débito!");
        } else {
            status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (status) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado!");
        } else {
            System.out.println("Erro: conta fechada!");
        }
    }

    public void sacar(float valor) {
        if (status) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado!");
            } else {
                System.out.println("Erro: saldo insuficiente!");
            }
        } else {
            System.out.println("Erro: conta fechada!");
        }
    }

    public void pagarMensal() {
        int mensalidade = tipo.equalsIgnoreCase("CC") ? 12 : 20;

        if (status) {
            if (saldo >= mensalidade) {
                saldo -= mensalidade;
                System.out.println("Mensalidade de R$" + mensalidade + " paga!");
            } else {
                System.out.println("Erro: saldo insuficiente para pagar mensalidade!");
            }
        } else {
            System.out.println("Erro: conta fechada!");
        }
    }

   
    public int getNumConta() {
         return numConta; 
    }
    public void setNumConta(int numConta) {
         this.numConta = numConta; 
    }

    public String getTipo() {
    return tipo; 
    }
    public void setTipo(String tipo) {
        this.tipo = tipo; 
        }

    public String getTitular() {
    return titular; 
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo; 
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status; 
    }
    public void setStatus(boolean status) {
        this.status = status; 
    }
}
