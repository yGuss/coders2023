package projects.java;

import java.util.Scanner;
import java.util.ArrayList;

public class frutaPromocao {
    public static void main(String[] args){
        Scanner scanTexto = new Scanner(System.in);
        String[] promo = {"banana", "maçã", "abacaxi", "melão", "mamão"};
        Integer tamanho = promo.length;
        System.out.println("A lista de frutas em promoção é: [banana, maçã, abacaxi, melão, mamão]");

        System.out.println("Qual fruta você deseja comprar hoje? ");
        String fruta = scanTexto.nextLine();
        
        for(var i=0; i<tamanho; i++){
            if(fruta.equals(promo[i])){
                System.out.println("Ótima escolha! Essa fruta está em promoção hoje");
            }
    }
}
}
