
public class Usuario {

    private String nome;
    private String email;
    private String cpf;

    public Usuario(String nome, String email, String cpf) {
        if (!verificarNome(nome)) {
            throw new IllegalArgumentException("Nome Invalido!");
        }

        if (!verificarCpf(cpf)) {
            throw new IllegalArgumentException("CPF Invalido!");
        }

        this.nome = nome;
        this.email = email;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean verificarNome(String nome) {

        if (nome == null || nome.isEmpty() || nome.trim().length() < 3) {
            return false;
        }
        return true;
    }

    public boolean verificarCpf(String cpf) {
        cpf = cpf.trim();

        if (cpf == null || cpf.isEmpty()) {
            return false;
        }

        cpf = cpf.replace(",", "")
                .replace(".", "")
                .replace("-", "");

        if (cpf.length() != 11) {
            return false;
        }

        return true;

    }

    public boolean verificarEmail(String email) {
        if (email == null || email.length() < 10) {
            return false;
        }
        if (email.contains("@") || email.contains(".")) {
            return true;
        } else {
            return false;
        }
    }
}
