package projects.java;

import java.text.Format;
import java.util.Scanner;

public class tabuada{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número de 1 a 10:");
        
        Integer numero = scanner.nextInt();
        System.out.println("A tabuada de " + numero +" é:");
        for(var i=1;i<=10;i++){   
            Integer mult = i* numero;
            System.out.println(numero + " x " + i + ": " + mult);

        }
    }
}
