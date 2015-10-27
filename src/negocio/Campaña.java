package negocio;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Estudiante
 */
public class Campaña {
    private HashMap<String, ArrayList<Candidato>> candidatos;
    private ArrayList<Patrocinador> patrocinadores;
    private int patrocinioCampaña = 0;
    
    public Campaña(){
        this.candidatos = new HashMap<>();
        this.patrocinadores = new ArrayList<>();
    }
    
    /**
     * Registra un candidato en para las elecciones.
     * @param destino El puesto al que aspira el candidato en las elecciones.
     * @param miembro Objeto con toda la información del miembro del partido politico
     * @param fechaPostulacion Fecha de postulación a la candidatura
     * @param discurso Discurso convincente. :v
     * @return Retorna true si no existe un candidato con el mismo documento.
     */
    protected boolean registrarCandidato(String destino, Miembro miembro, 
            String fechaPostulacion, String discurso){
        if(!verificarExistenciaCandidato(miembro.getCc())){
            if(!candidatos.containsKey(destino)){
                candidatos.put(destino, new ArrayList<Candidato>());
            }
            
            ArrayList<Candidato> candidato = candidatos.get(destino);
            candidato.add(new Candidato(miembro.getCc(), miembro.getNombre(), 
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
    
    protected String candidatosPorDestino(String destino){
        String postulados = "";
        
        ArrayList<Candidato> cand = candidatos.get(destino);
        if(cand != null)
            for(Candidato x: cand)
                postulados += x.toString();
        
        return postulados;
    }
    
    /**
     * Verifica si el candidato a consultar existe
     * @param ccCandidato CC del candidato a consultar
     * @return Retorna true si encuentra a alguien registrado con la misma CC.
     */
    private boolean verificarExistenciaCandidato(String ccCandidato){
        for(String x: candidatos.keySet())
            for(Candidato y: candidatos.get(x))
                if(y.getCc().equals(ccCandidato))
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
    
    protected String concatenarInversionistas(){
        String inversionistas = "";
        setPatrocinioCampaña(0);
        
        for(Patrocinador x: patrocinadores){
            inversionistas += "Empresa: "+x.getNombre()+"\nDinero invertido: "+x.getDinero()+"\n\n";
        }
        
        return inversionistas;
    }
    
    protected void sumarPatrocinios(){
        for(Patrocinador x: patrocinadores)
            patrocinioCampaña = patrocinioCampaña + x.getDinero();
    }

    protected int getPatrocinioCampaña(){
        return patrocinioCampaña;
    }

    protected void setPatrocinioCampaña(int patrocinioCampaña){
        this.patrocinioCampaña = patrocinioCampaña;
    }
    
    
}
