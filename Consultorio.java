public class Consultorio {
    private int id;
    private String name;

    public Consultorio() {
    }

    public Consultorio(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Consultorio setName(String name) {
        this.name = name;
        return null;
    }

    public String MostrarDatos() {
        return "Consultorio{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public static void Actualizar(int opcion){

    }
}
