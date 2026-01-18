public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    public Lutador(String nome,
        String nacionalidade,
        int idade,
        float altura,
        float peso,
        int vitorias,
        int derrotas,
        int empates){

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }


    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    public float getPeso() {
        return peso;
    }


    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
        }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
      if(this.peso <52.2){
        this.categoria = "Invalido";
      }else if(this.peso <= 70.3){
        this.categoria = "Leve";
      }else if(this.peso <= 83.9){
        this.categoria= "Médio";
      }else if(this.peso <= 120.2){
        this.categoria = "Pesado";
      }else{
        this.categoria = "Invalido!";
      }
    }


    public int getVitorias() {
        return vitorias;
    }


    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }


    public int getDerrotas() {
        return derrotas;
    }


    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    public int getEmpates() {
        return empates;
    }


    public void setEmpates(int empates) {
        this.empates = empates;
    }

   //Especiais

    public void apresentar(){
        System.out.println("---------Apresentação--------------");
        System.out.println("E Agora!!!!!");
        System.out.println("O Lutador conhecido como: " + this.getNome());
        System.out.println("Diretamente do(a)" + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " Anos");
        System.out.println("Com cerca de " + this.getAltura() + " m de Altura");
        System.out.println("Pesando Incriveis: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias() + " Lutas ");
        System.out.println("Perdeu: " + this.getDerrotas() + " e ");
        System.out.println("Empatou: " + this.getEmpates());
    }

    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("é um Peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }

    public void ganharLuta(){
     this.setVitorias(this.getVitorias() + 1);   
    }

    public void perderLuta(){
     this.setVitorias(this.getDerrotas() + 1);   
    }
    
    public void empatarLuta(){
     this.setVitorias(this.getEmpates() + 1);   
    }

}
