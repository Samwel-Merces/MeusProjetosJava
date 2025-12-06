import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       boolean continuar = true;

       System.out.println("Olá\n Seja bem vindo ao conversor de temperatura Celsius/Fahrenheit");

       while(continuar){

       System.out.println("\nEcolha\n(1)Celsius para fahrenheit\n(2)fahrenheit para Celsius\n");
       int esc = sc.nextInt();

       while(esc != 1 && esc!= 2){
        System.out.println("Erro escolha uma opção valida");
        esc = sc.nextInt();
       }

       float resultado = 0f;

       if(esc ==1){
        System.out.println("Digite o Valor em Celcius");
        float valor = sc.nextFloat();

        resultado = (valor * 9/5) +32;
        System.out.printf("%.2f °C equivale a %.2f °F%n", valor, resultado);
            
        }
       

       if(esc ==2){
        System.out.println("Digite o Valor em Fahrenheit");
        float valor = sc.nextFloat();

        resultado = (valor -32) * 5/9;
        System.out.printf("%.2f °F equivale a %.2f °C%n", valor, resultado);

       
        
       }
        
       System.out.println("\nDeseja continuar ?  S / N");
        sc.nextLine();
       String Esccontinuar = sc.nextLine();
        if(!Esccontinuar.toUpperCase().equals("S")){
            System.out.println("Fechando programa.................");
            continuar = false;
    }


    } 


    }
}
    
