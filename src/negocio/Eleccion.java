/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author emanuel
 */
public class Eleccion {
    private HashMap<PartidoPolitico, ArrayList<Miembro>> partidos_Politicos;
    private ArrayList<Patrocinador> patrocinadores;
    private int indPartido = 0;
    private int indPatrocinador = 0;
    
    public Eleccion() {
        this.partidos_Politicos = new HashMap<>();
        this.patrocinadores = new ArrayList<>();
    }
    
    //-----------------------REQUERIMIENTOS FUNCIONALES------------------------//
    public boolean registrarPartidoPolitico(String id, String nombre, 
            String fechaCreacion, String resumen, boolean dineroPublico){
        
        
        return false;
    }
    
    public boolean registrarMiembro(String idPartido, String cc, String nombre, 
            String telefono, String gustos){

        return false;
    }
    
    public boolean registrarPatrocinador(String nit, String nombre, 
            String dineroAportado, String sectorAccionar){
        
        return false;
    }
    
    public boolean registrarCandidato(String idPartido, String ccMiembro, 
            String fechaPostulacion, String discurso){
        
        
        return false;
    }
    
    public boolean registrarPatrocinador(String partido, String nit){
        String info[] = obtenerInfoPatrocinador(nit).split("-");
        
        return false;
    }
    
    public int obtenerApoyo(String idPartido){
        
        return 0;
    }
    
    //-----------------------REQUERIMIENTOS OPERACIONALES----------------------//
    private boolean verificarExistenciaPartido(String id){
        
        return false;
    }
    
    private boolean verificarExistenciaMiembro(String cc){
        
        return false;
    }
    
    public String concatenarPartidos(){
        String partidos = "";
        
        return partidos;
    }
    
    public String concatenarMiembros(String idPartidoPolitico){
        
        return "";
    }
    
    public String concatenarEmpresas(){
        String empresas = "";
        
        return empresas;
    }
    
    private boolean verificarExistenciaPatrocinador(String nit){

        return false;
    }
    
    private String obtenerInfoPatrocinador(String nit){
        
        return "";
    }
}
