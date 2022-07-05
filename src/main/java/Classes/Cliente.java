package Classes;

public class Cliente {
    private String nomeCliente;
    private int idade;
    private boolean estudante;
    private int numeroCadastroCliente;


    public Cliente(String nomeCliente, int idade, boolean estudante){
        this.nomeCliente = nomeCliente;
        this.idade = idade;
        this.estudante = estudante;
    }

    public String statusCliente(){
        return "Nome: " + nomeCliente +"\n"+ "Idade: " + idade + "\n" + "Estudante: " + estudante + "Numero de cadastro do cliente: " + numeroCadastroCliente + "\n\n";
    }

    
    //metodos getters and setters
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public boolean getEstudante() {
        return estudante;
    }
    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public int getNumeroCadastroCliente() {
        return numeroCadastroCliente;
    }


    public void setNumeroCadastroCliente(int numeroCadastroCliente) {
        this.numeroCadastroCliente = numeroCadastroCliente;
    }
}
