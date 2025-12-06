import java.util.Random;
import javax.swing.JOptionPane;

public class AdivinheoNumero {
    public static void main(String[] args) {
        Random rd = new Random();

        JOptionPane.showMessageDialog(null, "Olá\n Seja Bem vindo, Adivinhe um número entre 1 e 100");
        JOptionPane.showMessageDialog(null, "Você tem 10 tentativas");

        int maxtentativas = 10;
        int numeroRandom = rd.nextInt(100) +1;
        int palpite = 0;
        int tentativa=0;


        do {
          String papiteStr = JOptionPane.showInputDialog(null,"Digite Seu Palpite\nVocê tem " + maxtentativas + " Restantes");
          try {
          palpite = Integer.parseInt(papiteStr);
          } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO!!\nPor Favor digite apenas números inteiros");
            continue;
          }

          tentativa ++;
          maxtentativas --;
          

          if(palpite < numeroRandom){
            JOptionPane.showMessageDialog(null, "Muito Baixo");
          } else if (palpite > numeroRandom){
            JOptionPane.showMessageDialog(null, "Muito alto");
          } else{
            JOptionPane.showMessageDialog(null,
            "Parabéns!!! Você acertou!\nO número secreto era: " + numeroRandom + 
            "\nVocê acertou em " + tentativa + " tentativas.");
            break;
          }
    
            
        } while (palpite!= numeroRandom && tentativa < 10);

       
        if(palpite != numeroRandom && tentativa == 10){
            JOptionPane.showMessageDialog(null, "Que Pena! Você alcançou o Número maximo de tentativas\nO Número Secreto era " + numeroRandom);
        }
        

        

        
        
    }

    
}
