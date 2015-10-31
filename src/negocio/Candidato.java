package negocio;

/**
 * Los candidatos son las cartas en una campaña de un partido politico en unas 
 * elecciones, sin importan cuales sean estas, estos deben ser miembros del partido
 * politico, por eso heredan la información de los miembros y a su vez se añade la 
 * fecha de postulación y el discurso con el que intenta convencer al pueblo.
 * @author Emanuel Martínez Pinzón
 * @version 1.0
 */
public class Candidato extends Miembro{
    private String fecha_Postulacion, discurso;
    private int votos;

    public Candidato(String cc, String nombre, String telefono, String gustos, 
            String fecha_Postulacion, String discurso) {
        super(cc, nombre, telefono, gustos);
        this.fecha_Postulacion = fecha_Postulacion;
        this.discurso = discurso;
        this.votos = 0;
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

    public int getVotos(){
        return votos;
    }

    public void setVotos(int votos){
        this.votos = votos;
    }
    
    public String toString(){
        return "CC: "+getCc()+
             "\nNombre: "+getNombre()+
             "\nTelefono: "+getTelefono()+
             "\nGustos: "+getGustos()+
             "\nFecha de postulación: "+getFecha_Postulacion()+
             "\nDiscurso: "+getDiscurso()+
             "\nVotos: "+getVotos()+"\n\n";
    }
}
