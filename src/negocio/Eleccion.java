/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author emanuel
 */
public class Eleccion {
    private PartidoPolitico[] partidosPoliticos;
    private Patrocinador[] patrocinadores;
    private int indPartido = 0;
    private int indPatrocinador = 0;
    
    public Eleccion() {
        partidosPoliticos = new PartidoPolitico[5];
        patrocinadores = new Patrocinador[10];
    }
    
    //-----------------------REQUERIMIENTOS FUNCIONALES------------------------//
    public boolean registrarPartidoPolitico(String id, String nombre, 
            String fechaCreacion, String resumen, boolean dineroPublico){
        if(!verificarExistenciaPartido(id) & 
                indPartido < partidosPoliticos.length && partidosPoliticos[indPartido] == null){
            partidosPoliticos[indPartido] = new PartidoPolitico(id, nombre, 
                    fechaCreacion, resumen, dineroPublico);
            indPartido++;
            return true;
        }
        
        return false;
    }
    
    public boolean registrarMiembro(String idPartido, String cc, String nombre, 
            String telefono, String gustos){
        for(PartidoPolitico x: partidosPoliticos)
            if(!verificarExistenciaMiembro(cc) && x.getId().equals(idPartido))
                return x.registrarMiembro(cc, nombre, telefono, gustos);
        
        return false;
    }
    
    public boolean registrarPatrocinador(String nit, String nombre, 
            String dineroAportado, String sectorAccionar){
        if(!verificarExistenciaPatrocinador(nit) &
                indPatrocinador < patrocinadores.length && patrocinadores[indPatrocinador] == null){
            patrocinadores[indPatrocinador] = new Patrocinador(nit, nombre, 
                    dineroAportado, sectorAccionar);
            indPatrocinador++;
            return true;
        }
        return false;
    }
    
    public boolean registrarCandidato(String idPartido, String ccMiembro, 
            String fechaPostulacion, String discurso){
        for(PartidoPolitico x: partidosPoliticos)
            if(x != null && x.getId().equals(idPartido))
                return x.registrarCandidato(ccMiembro, fechaPostulacion, discurso);
        
        return false;
    }
    
    public boolean registrarPatrocinador(String partido, String nit){
        String info[] = obtenerInfoPatrocinador(nit).split("-");
        
        for(PartidoPolitico x: partidosPoliticos)
            if(x.getId().equals(partido)){
                x.setApoyo(Integer.parseInt(info[2]));
                return x.registrarPatrocinador(nit, info[1], info[2], info[3]);
            }
        
        return false;
    }
    
    public int obtenerApoyo(String idPartido){
        for(PartidoPolitico x: partidosPoliticos)
            if(x != null && x.getId().equals(idPartido))
                return x.getApoyo();
        
        return 0;
    }
    
    //-----------------------REQUERIMIENTOS OPERACIONALES----------------------//
    private boolean verificarExistenciaPartido(String id){
        for(PartidoPolitico x: partidosPoliticos)
            if(x != null && x.getId().equals(id))
                return true;
        
        return false;
    }
    
    private boolean verificarExistenciaMiembro(String cc){
        for(PartidoPolitico x: partidosPoliticos)
            if(x != null)
                return x.verificarExistenciaMiembro(cc);
        
        return false;
    }
    
    public String concatenarPartidos(){
        String partidos = "";
        
        for(PartidoPolitico x: partidosPoliticos)
            if(x != null)
                partidos += x.getId()+"-"+x.getNombre()+"~";
        
        return partidos;
    }
    
    public String concatenarMiembros(String idPartidoPolitico){
        for(PartidoPolitico x: partidosPoliticos)
            if(x != null && x.getId().equals(idPartidoPolitico))
                return x.concatenarMiembros();
        
        return "";
    }
    
    public String concatenarEmpresas(){
        String empresas = "";
        for(Patrocinador x: patrocinadores)
            if(x != null)
                empresas += x.getNit()+"-"+x.getNombre()+"~";
        
        return empresas;
    }
    
    private boolean verificarExistenciaPatrocinador(String nit){
        for(Patrocinador x: patrocinadores)
            if(x != null && x.getNit().equals(nit))
                return true;
        
        return false;
    }
    
    private String obtenerInfoPatrocinador(String nit){
        for(Patrocinador x: patrocinadores)
            if(x != null && x.getNit().equals(nit))
                return x.getNit()+"-"+x.getNombre()+"-"+x.getDnero()+"-"+x.getSector();
        
        return "";
    }
}
