package negocio;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * La clase campaña es una clase que guarda la información de la campaña de un partido 
 * politico, tiene un HashMap con los candidatos agrupados por destino y un ArrayList con
 * los patrocinadores de la campaña.
 * @author Estudiante
 * @version 1.0
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
            if(!candidatos.containsKey(destino))
                candidatos.put(destino, new ArrayList<Candidato>());
            
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
    
    /**
     * Concatena la información de los candidatos a un destino de la campaña.
     * @param destino Destino al que aspira el candidato
     * @return Retorna la información de los candidatos
     */
    protected String candidatosPorDestino(String destino){
        String postulados = "";
        
        ArrayList<Candidato> cand = candidatos.get(destino);
        if(cand != null)
            for(Candidato x: cand)
                postulados += x.toString();
        
        return postulados;
    }
    
    /**
     * Concatena los nombres de los candidatos por destinos
     * @param destino Destino aspirado
     * @return Retorna un String con los nombres de los candidatos.
     */
    protected String candidatosPorDestinoSoloNombre(String destino){
        String postulados = "";
        
        ArrayList<Candidato> cand = candidatos.get(destino);
        if(cand != null)
            for(Candidato x: cand)
                postulados += x.getNombre()+"~";
        
        return postulados;
    }
    
    /**
     * Registra un voto al candidato.
     * @param candidato Candidato
     * @param destino Destino aspirado
     * @return Retorna true cuando se registra el voto.
     */
    protected boolean registrarVoto(String candidato, String destino){
        for(String x: candidatos.keySet())
            if(x.equals(destino))
                for(Candidato y: candidatos.get(x))
                    if(y.getNombre().equals(candidato)){
                        y.setVotos(y.getVotos()+1);
                        return true;
                    }
        
        return false;
    }
    
    /**
     * Agrupa los candidatos sin importar su destino en un rango de votos recibidos.
     * @param rango Rango de votos a agrupar.
     * @return Retorna un String con la información de los candidatos.
     */
    protected String mostrarVotosPorRango(String rango){
        String votaciones = "";
        
        for(String x: candidatos.keySet())
            for(Candidato y: candidatos.get(x))
                if(rango.equals("0 - 5 Votos") && y.getVotos() >= 0 && y.getVotos() <= 5)
                    votaciones += "Destino: "+x+"\n"+y.toString();
                else if(rango.equals("6 - 10 Votos") && y.getVotos() >= 6 && y.getVotos() <= 10)
                    votaciones += "Destino: "+x+"\n"+y.toString();
                else if(rango.equals("11 - 15 Votos") && y.getVotos() >= 11 && y.getVotos() <= 15)
                    votaciones += "Destino: "+x+"\n"+y.toString();
                else if(rango.equals("16 votos en adelante") && y.getVotos() >= 16)
                    votaciones += "Destino: "+x+"\n"+y.toString();
            
        return votaciones;
    }
    
    //-------------------------REQUERIMIENTOS OPERACIONALES--------------------//
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
    
    /**
     * Concatena los inversionistas de la campaña
     * @return Retorna la información de los inversionistas a la campaña.
     */
    protected String concatenarInversionistas(){
        String inversionistas = "";
        setPatrocinioCampaña(0);
       
        for(Patrocinador x: patrocinadores)
            inversionistas += "Empresa: "+x.getNombre()+"\nDinero invertido: "+x.getDinero()+"\n\n";
        
        return inversionistas;
    }
    
    /**
     * Suma la cantidad de dinero aportado a la campaña.
     */
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
