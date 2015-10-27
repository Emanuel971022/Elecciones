package negocio;

import java.util.ArrayList;

/**
 * 
 * @author Estudiante
 */
public class Campaña {
    private ArrayList<Candidato> candidatos;
    private ArrayList<Patrocinador> patrocinadores;
    
    public Campaña(){
        this.candidatos = new ArrayList<>();
        this.patrocinadores = new ArrayList<>();
    }
    
    /**
     * Registra un candidato en para las elecciones.
     * @param miembro Objeto con toda la información del miembro del partido politico
     * @param fechaPostulacion Fecha de postulación a la candidatura
     * @param discurso Discurso convincente. :v
     * @return Retorna true si no existe un candidato con el mismo documento.
     */
    protected boolean registrarCandidato(Miembro miembro, String fechaPostulacion,
            String discurso){
        if(!verificarExistenciaCandidato(miembro.getCc())){
            candidatos.add(new Candidato(miembro.getCc(), miembro.getNombre(), 
                    miembro.getTelefono(), miembro.getGustos(), fechaPostulacion, discurso));
            return true;
        }
                
        return false;
    }
    
    /**
     * Registra un patrocinador para las elecciones
     * @param patrocinador Objeto patrocinador
     * @return Retorna true si no existe otro patrocinador así y lo registra
     */
    protected boolean registrarPatrocinador(Patrocinador patrocinador){
        if(!verificarExistenciaPatrocinador(patrocinador.getNit())){
            patrocinadores.add(patrocinador);
            return true;
        }
        
        return false;
    }
    
    /**
     * Verifica si el candidato a consultar existe
     * @param ccCandidato CC del candidato a consultar
     * @return Retorna true si encuentra a alguien registrado con la misma CC.
     */
    private boolean verificarExistenciaCandidato(String ccCandidato){
        for(Candidato x: candidatos)
            if(x.getCc().equals(ccCandidato))
                    return true;
        
        return false;
    }
    
    /**
     * Verifica si el patrocinador a consultar existe
     * @param nitPatrocinador  NIT del patrocinador a consultar
     * @return Retorna true si encuentra una empresa registrado con la misma NIT.
     */
    private boolean verificarExistenciaPatrocinador(String nitPatrocinador){
        for(Patrocinador x: patrocinadores)
            if(x.getNit().equals(nitPatrocinador))
                return true;
        
        return false;
    }
}
