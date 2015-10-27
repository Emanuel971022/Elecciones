/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Estudiante
 */
public class Campaña {
    private Candidato[] candidatos;
    private Patrocinador[] patrocinadores;
    private int indCandidato = 0;
    private int indPatrocinador = 0;
    
    public Campaña(){
        candidatos = new Candidato[5];
        patrocinadores = new Patrocinador[5];
    }
    
    public boolean registrarCandidato(String cc, String nombre, String telefono,
            String gustos, String fechaPostulacion, String discurso){
        if(!verificarExistenciaCandidato(cc) & 
                indCandidato < candidatos.length && candidatos[indCandidato] == null){
            candidatos[indCandidato] = new Candidato(cc, nombre, telefono, gustos, fechaPostulacion, discurso);
            indCandidato++;
            return true;
        }
        
        return false;
    }
    
    public boolean registrarPatrocinador(String nit, String nombre, String dinero, String sector){
        if(indPatrocinador < patrocinadores.length && patrocinadores[indPatrocinador] == null){
            patrocinadores[indPatrocinador] = new Patrocinador(nit, nombre, dinero, sector);
            indPatrocinador++;
            return true;
        }
        
        return false;
    }
    
    private boolean verificarExistenciaCandidato(String ccCandidato){
        for(Candidato x: candidatos)
            if(x != null && x.getCc().equals(ccCandidato))
                return true;
        
        return false;
    }    
}
