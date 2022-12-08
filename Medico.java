public class Medico extends Personas {
    private String titulo;
    private String tipoMedico;
    private String tipoHorario;


    public Medico(){}
    public Medico(int id){
        super(id);
    }
    public Medico(int id, String titulo){
        super(id);
        this.titulo = titulo;
    }

    public Medico(String titulo, String tipoMedico, String tipoHorario, int id, String nombre, String apellido, String sexo, int telefono, String direccion, String ciudadResidencia, String tipoIdentificacion, String tipoSangre, double altura, int peso, String estadoCivil, int numeroHijos, String fechaNacimiento, String lugarNacimiento, int estratoSocial) {
        super(id, nombre, apellido, sexo, telefono, direccion, ciudadResidencia, tipoIdentificacion, tipoSangre, altura, peso, estadoCivil, numeroHijos, fechaNacimiento, lugarNacimiento, estratoSocial);
        this.titulo = titulo;
        this.tipoMedico = tipoMedico;
        this.tipoHorario = tipoHorario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoMedico() {
        return tipoMedico;
    }

    public void setTipoMedico(String tipoMedico) {
        this.tipoMedico = tipoMedico;
    }

    public String getTipoHorario() {
        return tipoHorario;
    }

    public void setTipoHorario(String tipoHorario) {
        this.tipoHorario = tipoHorario;
    }

    public String MostrarDatos() {
        return "Medicos" +
                "titulo='" + titulo + '\'' +
                ", tipoMedico='" + tipoMedico + '\'' +
                ", tipoHorario='" + tipoHorario + '\'' +
                " " + super.toString();
    }


}
