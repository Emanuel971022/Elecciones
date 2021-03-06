package negocio;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * Clase contenedora del negocio en el proyecto.
 * @author Emanuel Martínez Pinzón
 * @version 1.0
 */
public class Eleccion {
    private final HashMap<PartidoPolitico, ArrayList<Miembro>> partidos_Politicos;
    private final ArrayList<Patrocinador> patrocinadores;
    
    public Eleccion() {
        this.partidos_Politicos = new HashMap<>();
        this.patrocinadores = new ArrayList<>();
    }
    
    //-----------------------REQUERIMIENTOS FUNCIONALES------------------------//
    /**
     * Registra un partido politico en el sistema.
     * @param id Identificador unico del partido politico
     * @param nombre Nombre distintivo del partido politico
     * @param fechaCreacion Fecha de creación del partido politico
     * @param resumen Resumen de las ideas del partido politico
     * @param dineroPublico Si el partido recibe dineros del estado
     * @return Retorna true si no existe un partido politico con la misma 
     * información y puede añadirlo a la estructura.
     */
    public boolean registrarPartidoPolitico(String id, String nombre, 
            String fechaCreacion, String resumen, boolean dineroPublico){
        PartidoPolitico partido = new PartidoPolitico(id, nombre, fechaCreacion, 
                resumen, dineroPublico);
        if(!partidos_Politicos.containsKey(partido)){
            partidos_Politicos.put(partido, new ArrayList<Miembro>());
            return true;
        }
        
        return false;
    }
    
    /**
     * Registra un miembro al sistema.
     * @param idPartido Identificador del partido politico al cual pertenece el miembro.
     * @param cc Documento de identificacion del miembro del partido politico
     * @param nombre Nombre del miembro del partido politico
     * @param telefono Telefono del miembro
     * @param gustos Gustos del suso dicho.
     * @return Retorna true si no existe ningún otro miembro en ningun partido con esa
     * misma CC y se logra registrar el miembro.
     * @throws Exception Si existe un miembro con la misma CC en cualquier partido
     * se generará una excepción alertando sobre esto.
     */
    public boolean registrarMiembro(String idPartido, String cc, String nombre, 
            String telefono, String gustos) throws Exception{
        PartidoPolitico partido = new PartidoPolitico(idPartido);
        ArrayList<Miembro> miembros = partidos_Politicos.get(partido);
        if(miembros != null){
            for(PartidoPolitico part: partidos_Politicos.keySet()){
                ArrayList<Miembro> miembroXPartido = partidos_Politicos.get(part);
                for(Miembro x: miembroXPartido)
                    if(x.getCc().equals(cc))
                        throw new Exception("Doble miembro");
            }
            
            miembros.add(new Miembro(cc, nombre, telefono, gustos));
            return true;
        }
        
        return false;
    }
    
    /**
     * Registra un patrocinador al sistema
     * @param nit NIT del patrocinador
     * @param nombre Nombre del patrocinador
     * @param dineroAportado Dinero que aporta como patrocinio
     * @param sectorAccionar Sector de acción para el lucro de la empresa
     * @return Retorna true si la empresa no existe y se puede registrar
     */
    public boolean registrarPatrocinador(String nit, String nombre, 
            int dineroAportado, String sectorAccionar){
        if(!verificarExistenciaPatrocinador(nit)){
            patrocinadores.add(new Patrocinador(nit, nombre, dineroAportado, sectorAccionar));
            return true;
        }
        
        return false;
    }
    
    /**
     * Registra un candidato en el sistema
     * @param idPartido Identificador del partido
     * @param ccMiembro CC del miembro a registrar
     * @param fechaPostulacion Fecha de postulación a elecciones
     * @param discurso Discurso para enredar a la gente
     * @return Retorna true si no existe un candidato igual y lo registra.
     */
    public boolean registrarCandidato(String idPartido, String ccMiembro, String destino,
            String fechaPostulacion, String discurso){
        Miembro miembro = obtenerMiembro(ccMiembro);
        
        for(PartidoPolitico x: partidos_Politicos.keySet())
            if(x.getId().equals(idPartido) && miembro != null)
                return x.registrarCandidato(destino, miembro, fechaPostulacion, discurso);
        
        return false;
    }
    
    /**
     * Registra un patrocinador a la campaña que lleve un partido
     * @param partido Norbre del partido a patrocinar
     * @param nit Nit de la empresa patrocinadora
     * @return Retorna true si puede registrar el patrocinador
     */
    public boolean registrarPatrocinadorCampaña(String partido, String nit){
        Patrocinador patrocinador = obtenerPatrocinador(nit);
        
        for(PartidoPolitico x: partidos_Politicos.keySet())
            if(x.getId().equals(partido))
                return x.registrarPatrocinador(patrocinador);
        
        return false;
    }
    
    /**
     * Me permite conocer cuanto dinero se ha invertido en la campaña de un partido,
     * muestra la cantidad invertida por cada una de las empresas y la suma de ese
     * dinero.
     * @param partido Partido politico del que se quiere conocer la inversión
     * @return Retorna un String con la información de las inversiones por parte
     * de las empresas.
     */
    public String obtenerInfoInversionCampaña(String partido){
        for(PartidoPolitico x: partidos_Politicos.keySet())
            if(x.getId().equals(partido))
                return x.agruparInversionCampaña()+"\nDinero invertido en la campaña: "+x.obtenerInversion();
        
        return "";
    }
    
    /**
     * Concatena los candidatos de un partido politico para un destino especial.
     * @param destino Destino al que aspiran los candidatos a agrupar.
     * @return Retorna un String con la información de los candidatos postulados.
     */
    public String candidatosPorDestinoTodosPartidos(String destino){
        String postulados = "";
        
        for(PartidoPolitico x: partidos_Politicos.keySet())
            if(!x.candidatosPorDestinoCampaña(destino).isEmpty())
                postulados += "Partido politico: "+x.getNombre()+"\n\n"+x.candidatosPorDestinoCampaña(destino);
        
        return postulados;
    }
    
    /**
     * Concatena los partidos con campaña para un destino administrativo,
     * verifica si un partido tiene candidatos registrados para un puesto público.
     * @param destino Destino al que aspiran los candidatos de los partidos
     * @return Retorna un String con los partidos
     */
    public String concatenarPartidosPorDestinoVotar(String destino){
        String partidosPostulados = "";
        
        for(PartidoPolitico x: partidos_Politicos.keySet())
            if(!x.candidatosPorDestinoCampañaNombre(destino).isEmpty())
                partidosPostulados += x.getNombre()+"~";
        
        return partidosPostulados;
    }
    
    /**
     * Concatena los cantidatos registrados a un puesto público de la campaña
     * @param destino Destino aspirado por los candidatos
     * @param partido Partido del candidato
     * @return Retorna un String con los candidatos postulados
     */
    public String concatenarCandidatosPorDestinoVotar(String destino, String partido){
        String candidatosPostulados = "";
        
        for(PartidoPolitico x: partidos_Politicos.keySet())
            if(!x.candidatosPorDestinoCampañaNombre(destino).isEmpty() && x.getNombre().equals(partido))
                candidatosPostulados += x.candidatosPorDestinoCampañaNombre(destino);
        
        return candidatosPostulados;
    }
    
    /**
     * Registra un voto a algún candidato
     * @param destino Destino al que aspira el candidato
     * @param partido Partido del candidato
     * @param candidato Nombre del candidato.
     * @return Retorna true si registra el candidato por el que ha votado.
     */
    public boolean registrarVoto(String destino, String partido, String candidato){
        for(PartidoPolitico x: partidos_Politicos.keySet())
            if(x.getNombre().equals(partido))
                return x.registrarVoto(destino, candidato);
        
        return false;
    }
    
    /**
     * Muestra los candidatos por un rango de votos.
     * @param rangoVotos Rango de votos a agrupar.
     * @return Retorna la información de los candidatos.
     */
    public String mostrarVotosPorRango(String rangoVotos){
        String votaciones = "";
        
        for(PartidoPolitico x: partidos_Politicos.keySet())
            votaciones += x.mostrarVotosPorRango(rangoVotos);
        
        return votaciones;
    }
    
    //-----------------------REQUERIMIENTOS OPERACIONALES----------------------//
    /**
     * Concatena los partidos politicos registrados agrupandolos así: ID-Nombre
     * @return Retorna toda todos los ID y nombres de los partidos politicos registrados.
     */
    public String concatenarPartidos(){
        String partidos = "";
        
        for(PartidoPolitico x: partidos_Politicos.keySet())
            partidos += x.getId()+"-"+x.getNombre()+"~";
        
        return partidos;
    }
    
    /**
     * Concatena los miembros registrados así: CC-Nombre por partidos politicos
     * @param idPartidoPolitico ID del partido politico que consulta.
     * @return Retorna los ID y nombres de los miembros de un partido politico
     */
    public String concatenarMiembros(String idPartidoPolitico){
        String miembros = "";
        
        PartidoPolitico partido = new PartidoPolitico(idPartidoPolitico);
        ArrayList<Miembro> listaMiembros = partidos_Politicos.get(partido);
        if(listaMiembros != null)
            for(Miembro x: listaMiembros)
                miembros += x.getCc()+"-"+x.getNombre()+"~";
        
        return miembros;
    }
    
    /**
     * Concatena el NIT y el nombre de todas las empresas registradas
     * @return Retorna todos los nit's y nombres concatenados.
     */
    public String concatenarEmpresas(){
        String empresas = "";
        
        for(Patrocinador x: patrocinadores)
            empresas += x.getNit()+"-"+x.getNombre()+"~";
        
        return empresas;
    }
    
    /**
     * Verifica la existencia de un patrocinador en la lista de patrocinadores
     * registrados
     * @param nit NIT del patrocinador que busca
     * @return Retorna true si encuentra algún patrocinador con el mismo NIT.
     */
    private boolean verificarExistenciaPatrocinador(String nit){
        for(Patrocinador x: patrocinadores)
            if(x.getNit().equalsIgnoreCase(nit))
                return true;
        
        return false;
    }

    /**
     * Retorna un Objecto tipo Miembro que coincida con la CC ingresada.
     * @param ccMiembro CC del miembro a buscar
     * @return Retorna el objeto Miembro encontrado o retorna null si no encuentra nada.
     */
    private Miembro obtenerMiembro(String ccMiembro){
        for(PartidoPolitico x: partidos_Politicos.keySet())
            for(Miembro y: partidos_Politicos.get(x))
                if(y.getCc().equals(ccMiembro))
                    return y;
            
        return null;
    }
    
    /**
     * Retorna un Objeto tipo Patrocinador que coincida con el NIT ingresado.
     * @param nit NIT del patrocinador a buscar
     * @return Retorna el objeto Patrocinador encontrado o retorna null si no encuentra nada.
     */
    private Patrocinador obtenerPatrocinador(String nit){
        for(Patrocinador x: patrocinadores)
            if(x.getNit().equals(nit))
                return x;
        
        return null;
    }
}
