/*
 * o que quero testar?
 * se o bubble sort funciona com classes e arrayList
 */
import java.util.ArrayList;

public class teste2 {
    public static void main(String[] args) {
        ArrayList<Sessao> listSessao = new ArrayList<Sessao>();

        Sessao um = new Sessao("Sabado", "1", "0", 35);
        Sessao dois = new Sessao("Sabado", "2", "0", 35);
        Sessao tres = new Sessao("Sabado", "3", "0", 35);

        listSessao.add(tres);
        listSessao.add(dois);
        listSessao.add(um);



        System.out.println("Sem ordenar");
        for(int i =0; i< listSessao.size(); i ++){
            System.out.printf("[%d]\n", i+1);
            System.out.println(listSessao.get(i).statusSessao());
        }

        Sessao aux;
        for(int cont = 0; cont < listSessao.size(); cont++){
            for(int i = 0; i < listSessao.size()-1; i++){
                if(listSessao.get(i).getHoraInteiro() > listSessao.get(i+1).getHoraInteiro()){
                    aux = listSessao.get(i);
                    listSessao.set(i,listSessao.get(i+1));
                    listSessao.set(i+1,aux);
                }
            }
        }


        System.out.println("Com ordenar");
        for(int i =0; i< listSessao.size(); i ++){
            System.out.printf("[%d]\n", i+1);
            System.out.println(listSessao.get(i).statusSessao());
        }


        

    }
    
}
