/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Objects;

/**
 *
 * @author Estudiante
 */
public class PartidoPolitico {
    private Campaña campaña;
    private String id, nombre, fecha_Creacion, resumen;
    private boolean dineroPublico;
    private int apoyoCampañas;

    public PartidoPolitico(String id, String nombre, String fecha_Creacion, String resumen, boolean dineroPublico) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_Creacion = fecha_Creacion;
        this.resumen = resumen;
        this.dineroPublico = dineroPublico;
        campaña = new Campaña();
    }
    
    //-----------------------REQUERIMIENTOS FUNCIONALES------------------------//
    public boolean registrarMiembro(String cc, String nombre, String telefono, String gustos){
        
        
        return false;
    }
    
    public boolean registrarCandidato(String cc, String fechaPostulacion, String discurso){
        String info[] = obtenerInfoMiembro(cc).split("~");
        
        return campaña.registrarCandidato(cc, info[1], info[2], info[3], fechaPostulacion, discurso);
    }
    
    public boolean registrarPatrocinador(String nit, String nombre, String dinero, String sector){
        return campaña.registrarPatrocinador(nit, nombre, dinero, sector);
    }
    
    public void setApoyo(int cantidad){
        apoyoCampañas = apoyoCampañas+cantidad;
    }
    
    public int getApoyo(){
        return apoyoCampañas;
    }
    
    //-----------------------REQUERIMIENTOS OPERACIONALES----------------------//
    public boolean verificarExistenciaMiembro(String cc){
        
        return false;
    }
    
    public String concatenarMiembros(){
        String infoMiembros = "";
        
        return infoMiembros;
    }
    
    protected String obtenerInfoMiembro(String cc){

        return "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_Creacion() {
        return fecha_Creacion;
    }

    public void setFecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public boolean isDineroPublico() {
        return dineroPublico;
    }

    public void setDineroPublico(boolean dineroPublico) {
        this.dineroPublico = dineroPublico;
    }   
    
    //-----------------------REQUERIMIENTOS MODIFICADOS------------------------//
    /**
     * Se reescribe este metodo hashCode para que el tipo map se conserve.
     * @return Retorna el hash que calcula en el metodo
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    /**
     * Este metodo ha sido reescrito para que un objeto Carro con todos los parametros
     * pueda ser comparado con un objeto Carro que solo tenga una placa y aun asi
     * ambas placas siendo iguales se pueda dar verdadero.
     * @param obj Object
     * @return Retorna true si ambas placas son iguales
     */
    @Override
    public boolean equals(Object obj) {
        PartidoPolitico c = (PartidoPolitico) obj;
        return c.getId().equals(getId());
    }
}
