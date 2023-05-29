package projects.java;

import java.util.Scanner;
import java.util.ArrayList;

public class listaCompras {
    public static void main(String[] args){
        Scanner scanNum = new Scanner(System.in);
        Scanner scanTexto = new Scanner(System.in);
        System.out.println("Quantos itens deseja adicionar ao carrinho? ");
        
        Integer tamanhoLista = scanNum.nextInt();

        System.out.println("Insira a sua lista de compras: ");
        ArrayList carrinho = new ArrayList<String>();
        
        for(var i=0; i<tamanhoLista;i++){
            String fruta = scanTexto.nextLine();
            carrinho.add(fruta);
        }
        System.out.println(carrinho);
    }
}
