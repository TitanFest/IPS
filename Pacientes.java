public class Pacientes extends Personas{
    private  String tipoAfiliciacion;
    private String Eps;


    public Pacientes() {
    }

    public Pacientes(int id){
        super(id);
    }
    public Pacientes(String tipoAfiliciacion, int id, String nombre, String apellido, String sexo, int telefono, String direccion, String ciudadResidencia, String tipoIdentificacion, String tipoSangre, double altura, int peso, String estadoCivil, int numeroHijos, String fechaNacimiento, String lugarNacimiento, int estratoSocial) {
        super(id, nombre, apellido, sexo, telefono, direccion, ciudadResidencia, tipoIdentificacion, tipoSangre, altura, peso, estadoCivil, numeroHijos, fechaNacimiento, lugarNacimiento, estratoSocial);
        this.tipoAfiliciacion = tipoAfiliciacion;
    }

    public String getTipoAfiliciacion() {
        return tipoAfiliciacion;
    }

    public void setTipoAfiliciacion(String tipoAfiliciacion) {
        this.tipoAfiliciacion = tipoAfiliciacion;
    }

    public String getEps() {
        return Eps;
    }

    public void setEps(String eps) {
        Eps = eps;
    }
    public String MostrarDatos() {
        return "Pacientes " +
                "tipoAfiliciacion='" + tipoAfiliciacion + '\'' +
                ", Eps='" + Eps + '\'' +
                " " + super.toString();
    }
}

