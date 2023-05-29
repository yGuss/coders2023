package projects.java;

import java.util.Scanner;

public class converterTemperatura{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit:");

        Float tempCelsius = scanner.nextFloat();
        Float resultado = (tempCelsius * 9/5) + 32;
        System.out.println("O equivalente a " +tempCelsius +" ºC é: "+ resultado + " ºF");
    }
}