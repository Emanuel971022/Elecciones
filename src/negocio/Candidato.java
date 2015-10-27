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
public class Candidato extends Miembro{
    private String fecha_Postulacion, discurso;

    public Candidato(String cc, String nombre, String telefono, String gustos, 
            String fecha_Postulacion, String discurso) {
        super(cc, nombre, telefono, gustos);
        this.fecha_Postulacion = fecha_Postulacion;
        this.discurso = discurso;
    }

    public String getFecha_Postulacion() {
        return fecha_Postulacion;
    }

    public void setFecha_Postulacion(String fecha_Postulacion) {
        this.fecha_Postulacion = fecha_Postulacion;
    }

    public String getDiscurso() {
        return discurso;
    }

    public void setDiscurso(String discurso) {
        this.discurso = discurso;
    }
}
