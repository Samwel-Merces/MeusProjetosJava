import java.util.Random;

public class Luta {
    Random rd = new Random();

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void setDesafiado(Lutador dd){
        desafiado = dd;
    }

    public Lutador getDesafiado(){
        return desafiado;

    }




    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            aprovada = true;
            desafiante = l1;
            desafiado = l2;
        }else{
            System.out.println("Luta não pode acontecer!");
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }

    }
    

    public void lutar(){
        if(aprovada == true){
            desafiante.apresentar();
            desafiado.apresentar();
            int resultado =  rd.nextInt(3);

            System.out.println("##Resultado##\n");
            switch (resultado) {
                case 0 :
                    System.out.println("Empate!!!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1 :
                    System.out.println("desafiante: " + desafiante.getNome() + " Ganhou!!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                case 2 :
                    System.out.println("o Desafiado: " + desafiado.getNome() + " Ganhou!!!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                default:
                    
            }

         }else{ System.out.println("Luta não pode acontecer");


        
    }
}


}
