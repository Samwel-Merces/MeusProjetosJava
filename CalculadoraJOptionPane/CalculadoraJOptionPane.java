import javax.swing.JOptionPane;

public class CalculadoraJOptionPane {
    public static void main(String []args){

float numero1 =0;
float numero2 =0;
String entrada[] = {"+","-","*","/"};
Float resultado;
boolean entradaValida= false;


while (!entradaValida) {
    
try {
    String input1 = JOptionPane.showInputDialog(null,"Digite um Número");
    numero1 = Float.parseFloat(input1);
    entradaValida = true;
    
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null,"Erro!!!/\nPor favor Digite um número Valido");  
}
    }

int operacao = JOptionPane.showOptionDialog(
null,
"Escolha a Operação",
"Escolha"
,JOptionPane.DEFAULT_OPTION
,JOptionPane.QUESTION_MESSAGE,
null,
entrada,
entrada[0]
);

entradaValida = false;

while (!entradaValida) {
    try { String input2 = JOptionPane.showInputDialog(null, "Digite o Segundo Número");
    numero2 = Float.parseFloat(input2);
    entradaValida = true;
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,"Erro!!!\nDigite um número valido");
    }
}
 

    switch (operacao) {
        case 0:
        resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null,"Resultado: " + resultado); 
        break;
        case 1:
        resultado = numero1 - numero2;
        JOptionPane.showMessageDialog(null,"Resultado: " + resultado); 
        break;
        case 2:
        resultado = numero1 * numero2;
        JOptionPane.showMessageDialog(null,"Resultado: " + resultado); 
        break;
        case 3:
        resultado = numero1 / numero2;
        JOptionPane.showMessageDialog(null,"Resultado: " + resultado); 
        break;
    }

    }
    
}
