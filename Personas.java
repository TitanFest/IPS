import java.util.ArrayList;

public class Personas {

    private int id;
    private String nombre;
    private String apellido;
    private String sexo;
    private int telefono;
    private String direccion;
    private String ciudadResidencia;
    private String tipoIdentificacion;
    private String tipoSangre;
    private double altura;
    private int peso;
    private String estadoCivil;
    private int numeroHijos;
    private String fechaNacimiento;
    private String lugarNacimiento;
    private int estratoSocial;
    public Personas() {
    }
    public Personas(int id){
        this.id = id;
    }
    public Personas(int id, String nombre, String apellido, String sexo, int telefono, String direccion, String ciudadResidencia, String tipoIdentificacion, String tipoSangre, double altura, int peso, String estadoCivil, int numeroHijos, String fechaNacimiento, String lugarNacimiento, int estratoSocial) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudadResidencia = ciudadResidencia;
        this.tipoIdentificacion = tipoIdentificacion;
        this.tipoSangre = tipoSangre;
        this.altura = altura;
        this.peso = peso;
        this.estadoCivil = estadoCivil;
        this.numeroHijos = numeroHijos;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.estratoSocial = estratoSocial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public int getEstratoSocial() {
        return estratoSocial;
    }

    public void setEstratoSocial(int estratoSocial) {
        this.estratoSocial = estratoSocial;
    }


    public String toString() {
        return "" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", telefono=" + telefono + ", direccion=" + direccion + ", ciudadResidencia=" + ciudadResidencia + ", tipoIdentificacion=" + tipoIdentificacion + ", tipoSangre=" + tipoSangre + ", altura=" + altura + ", peso=" + peso + ", estadoCivil=" + estadoCivil + ", numeroHijos=" + numeroHijos + ", fechaNacimiento=" + fechaNacimiento + ", lugarNacimiento=" + lugarNacimiento + ", estratoSocial=" + estratoSocial;
    }


}


