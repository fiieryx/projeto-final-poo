/*
 * O que quero testar?
 * Quero testar se a posição de um arrayList vai variando conforme itens são removidos dele
 */


import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
    ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
    
    listaInteiros.add(1);
    listaInteiros.add(2);
    listaInteiros.add(3);

    System.out.println("Posição 1: "+ listaInteiros.get(1)); 
    listaInteiros.remove(1);
    System.out.println("1 removido");
    System.out.println("Posição 1: "+ listaInteiros.get(1)); 
    

    }
}
