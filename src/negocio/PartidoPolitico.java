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

    public PartidoPolitico(String id){
        this.id = id;
    }
    
    public PartidoPolitico(String id, String nombre, String fecha_Creacion, 
            String resumen, boolean dineroPublico) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_Creacion = fecha_Creacion;
        this.resumen = resumen;
        this.dineroPublico = dineroPublico;
        campaña = new Campaña();
    }
    
    //-----------------------REQUERIMIENTOS FUNCIONALES------------------------//
    /**
     * Llama al metodo registrarCandidato para guardar un candidato en la campaña
     * @param miembro Miembro del partido politico
     * @param fechaPostulacion Fecha de postulación a candidato
     * @param discurso Discurso politico de la candidatura
     * @return Retorna lo que pasa en el metodo registrarCandidato de la clase
     * Campaña
     */
    protected boolean registrarCandidato(String destino, Miembro miembro, 
            String fechaPostulacion, String discurso){
        return campaña.registrarCandidato(destino, miembro, fechaPostulacion, discurso);
    }
    
    /**
     * Registra un patrocinador en la campaña
     * @param patrocinador Patrocinador de la campaña
     * @return Retorna lo que pasa en el metodo registrarPatrocinador de la 
     * clase Campaña
     */
    protected boolean registrarPatrocinador(Patrocinador patrocinador){
        return campaña.registrarPatrocinador(patrocinador);
    }
    
    protected String agruparInversionCampaña(){
        return campaña.concatenarInversionistas();
    }
    
    protected int obtenerInversion(){
        campaña.sumarPatrocinios();
        
        return campaña.getPatrocinioCampaña();
    }
    
    protected String candidatosPorDestinoCampaña(String destino){
        return campaña.candidatosPorDestino(destino);
    }
    
    protected String candidatosPorDestinoCampañaNombre(String destino){
        return campaña.candidatosPorDestinoSoloNombre(destino);
    }
    
    protected boolean registrarVoto(String destino, String candidato){
        return campaña.registrarVoto(candidato, destino);
    }
    
    //-----------------------REQUERIMIENTOS OPERACIONALES----------------------//
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
    
    //----------------------------METODOS MODIFICADOS--------------------------//
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
