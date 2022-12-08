import java.util.ArrayList;

public class Citas {
    private int id;
    private String fecha;
    private Medico medico;
    private Pacientes paciente;
    private  String diagnostico ;
    private String sintomas;
    private ArrayList<Medicamentos> medicamentos;
    private Consultorio consultorio;

    public Citas() {
    }

    public Citas(int id, String fecha, int idMedico, int idPaciente, String diagnostico,String sintomas) {
        this.id = id;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.sintomas = sintomas;

    }

    public Citas(int id, String fecha, int idMedico, int idPaciente, Medico medico, Pacientes paciente,Consultorio consultorio, String diagnostico, String sintomas,ArrayList<Medicamentos> medicamentos) {
        this.id = id;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.diagnostico = diagnostico;
        this.sintomas = sintomas;
        this.medicamentos = medicamentos;
        this.consultorio = consultorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ArrayList<Medicamentos> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamentos> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }


    public String MostrarDatos() {
        return "Citas{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", Nombre medico=" + medico.getNombre() +
                ", Nombre paciente=" + paciente.getNombre() +
                ", diagnostico='" + diagnostico + '\'' +
                ", sintomas='" + sintomas + '\'' +
                ", medicamentos=" + medicamentos +
                ", Nombre consultorio consultorio=" + consultorio.getName() +
                '}';
    }
}
