import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca su peso");
        double peso=entrada.nextDouble();
        if (peso>70){
            System.out.println("Estás gordo");
            
        } 
        else if(peso>60){
            System.out.println("Estás normal");
        }
        else if(peso>=50){
            System.out.println("Estás delgado");
        }
        else{
            System.out.println("Estás muy delgado");
     }
    }
}