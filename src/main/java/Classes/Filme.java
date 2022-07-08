package Classes;

import java.util.*;

public class Filme{
    private String nomeFilme;
    private int classificacao;
    private int numeroCadastroFilme;
    private int numeroVendas = 0;
    public List<Sessao> listaSessoesFilmes = new ArrayList<>();

    public Filme(String nomeFilme, int classificacao){
        this.nomeFilme = nomeFilme;
        this.classificacao = classificacao;
        
    }

    //metodo status filme
    public String statusFilme(){
        return "Filme: " + nomeFilme + "\n" + "Classificação de idade: " + "\n" + "Número de cadastro do filme: " + "[" +numeroCadastroFilme +"]" + "\n\n";
    }   





    //metodos getters and setters
    public int getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getNumeroCadastroFilme() {
        return numeroCadastroFilme;
    }
    public void setNumeroCadastroFilme(int numeroCadastroFilme) {
        this.numeroCadastroFilme = numeroCadastroFilme;
    }
    
    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }
    
    public int getNumeroVendas(){
    return numeroVendas;
    }
    
    public void addNumeroVendas(int numerovendas){
    this.numeroVendas += numerovendas;
    }
    
}