
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Douglas
 */
public class Medico extends Pessoa {
    
    private String CRM;
    private ArrayList<Especialidades> especialidade;
    private ArrayList<PlanoSaude> planosConveniados;
    private HashMap<String,HorarioAtendimento> horarioAtend; 

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public ArrayList<Especialidades> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(ArrayList<Especialidades> especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<PlanoSaude> getPlanosConveniados() {
        return planosConveniados;
    }

    public void setPlanosConveniados(ArrayList<PlanoSaude> planosConveniados) {
        this.planosConveniados = planosConveniados;
    }

    public HashMap<String, HorarioAtendimento> getHorarioAtend() {
        return horarioAtend;
    }

    public void setHorarioAtend(HashMap<String, HorarioAtendimento> horarioAtend) {
        this.horarioAtend = horarioAtend;
    }
    
}
