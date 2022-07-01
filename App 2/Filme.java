import java.util.ArrayList;

public class Filme{
    private String nomeFilme;
    private int classificacao;
    private int numeroCadastroFilme;
    ArrayList<Sessao> listaSessoesFilmes;

    public Filme(String nomeFilme, int classificacao){
        this.nomeFilme = nomeFilme;
        this.classificacao = classificacao;
        listaSessoesFilmes = new ArrayList<Sessao>();
        
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
}