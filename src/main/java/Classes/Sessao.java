package Classes;

import java.util.ArrayList;
import java.util.List;

public class Sessao {
    
    private String dia;
    private int hora;
    private int minuto;
    private String horario;
    private int qntdMaxPessoas;
    private int horaInteiro;
    public List<Assento> listaAssentosOcupados = new ArrayList<>();

   

    public Sessao(String dia, int hora, int minuto, int qntdMaxPessoas){
        this.dia = dia;
        this.horario = hora + ":" + minuto;
        this.hora = hora;
        this.minuto = minuto;
        this.qntdMaxPessoas = qntdMaxPessoas;
    }

    public String statusSessao(){
        return "Dia: " + dia + "\n" +  "Horário: " +horario  +"\n"+ "Quantidade máxima de pessoas: " + qntdMaxPessoas;
    }



    //metodos getters and setters
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    

    public int getQntdMaxPessoas() {
        return qntdMaxPessoas;
    }
    public void setQntdMaxPessoas(int qntdMaxPessoas) {
        this.qntdMaxPessoas = qntdMaxPessoas;
    }

    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHoraInteiro() {
        return horaInteiro;
    }

    public void setHoraInteiro(int horaInteiro) {
        this.horaInteiro = horaInteiro;
    }

    /**
     * @return the id
     */

    /**
     * @param id the id to set
     */
}
