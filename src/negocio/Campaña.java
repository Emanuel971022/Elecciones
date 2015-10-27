package negocio;

import java.util.ArrayList;

/**
 * 
 * @author Estudiante
 */
public class Campaña {
    private ArrayList<Candidato> candidatos;
    private ArrayList<Patrocinador> patrocinadores;
    private int indCandidato = 0;
    private int indPatrocinador = 0;
    
    public Campaña(){
        this.candidatos = new ArrayList<>();
        this.patrocinadores = new ArrayList<>();
    }
    
    public boolean registrarCandidato(String cc, String nombre, String telefono,
            String gustos, String fechaPostulacion, String discurso){
        
        return false;
    }
    
    public boolean registrarPatrocinador(String nit, String nombre, String dinero, String sector){

        
        return false;
    }
    
    private boolean verificarExistenciaCandidato(String ccCandidato){
        
        return false;
    }    
}
