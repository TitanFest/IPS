import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Medico> medicos = new ArrayList<>();
    public static ArrayList<Pacientes> pacientes = new ArrayList<>();
    public static ArrayList<Citas> citas = new ArrayList<>();
    public static ArrayList<Consultorio> consultorios = new ArrayList<>();
    public static ArrayList<Medicamentos> medicamentos = new ArrayList<>();
    public static String[] options = {"Medico","Paciente","Cita","Consultorio","Medicamento"};
    public static Scanner entrada = new Scanner(System.in);
    public static Consultorio consultorio = new Consultorio(21,"203");
    public static Medicamentos medicamento = new Medicamentos(21,"acefaminofen");
    public static Pacientes paciente = new Pacientes(21);
    public static Medico medico = new Medico(21);
    public static Citas cita = new Citas(21,"27/07/2004",21,21,"Pulmonia","dolor en el pecho");



    public static void main(String[] args) {
        consultorios.add(consultorio);
        medicamentos.add(medicamento);
        citas.add(cita);
        medicos.add(medico);
        pacientes.add(paciente);
        menu();
    }
    public static void menu(){
        System.out.println("\nMenu Principal");
        System.out.println("1. Medicos \n2. Paciente \n3. Citas \n4. Consultorio \n5. Medicamento \n6. Salir \n");

        int opcion = entrada.nextInt();
        if (opcion == 6){
            System.out.println("El programa ha finalizado");
            System.exit(0);
        }

        while (true) {
            System.out.println("\nBienvenido al menu de "+options[opcion-1]+"\nQue desea realizar?");
                    System.out.println("1. Crear\n2. Mostrar\n3. Actualizar\n4. Borrar\n5. Salir\n");
                    int opcionM = entrada.nextInt();
                    entrada.nextLine();
                    switch (opcionM) {
                        case 1:
                            Crear(opcion);
                            break;
                        case 2:
                            System.out.println("Ingrese el id: ");
                            //entrada.nextLine();
                            int id = entrada.nextInt();
                            System.out.println(Mostrar(buscar(opcion,id),opcion));
                            entrada.nextLine();
                            break;
                        case 3:
                            System.out.println("Ingrese el id: ");
                            int id2 = entrada.nextInt();
                            int x = buscar(opcion,id2);
                            Actualizar(opcion,x);
//                            //actualizar
                            break;
                        case 4:
                            System.out.println("Ingrese el id");
                            int id3 = entrada.nextInt();
                            int x1 = buscar(opcion,id3);
                            Borrar(opcion,x1);
                            //Borrar
                            break;
                        case 5:
                            menu();
                            break;
                    }


            }
        }


    public static void Crear(int opcion) {
        switch (opcion) {
            case 1 -> {
                System.out.println("Titulo: ");
                String titulo = entrada.nextLine();
                System.out.println("Tipo de medico: ");
                String tipoMedico = entrada.nextLine();
                System.out.println("Tipo de Horario: ");
                String tipoHorario = entrada.nextLine();
                System.out.println("Id: ");
                int id = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Nombre: ");
                String name = entrada.nextLine();
                System.out.println("Apellido: ");
                String apellido = entrada.nextLine();
                System.out.println("Sexo: ");
                String sexo = entrada.nextLine();
                System.out.println("Dirección: ");
                String direccion = entrada.nextLine();
                System.out.println("Ciudad de residencia: ");
                String ciudadResidencia = entrada.nextLine();
                System.out.println("Tipo de identificacion: ");
                String tipoIdentificacion = entrada.nextLine();
                System.out.println("Tipo de sangre: ");
                String tipoSangre = entrada.nextLine();
                System.out.println("Estado civil: ");
                String estadoCivil = entrada.nextLine();
                System.out.println("Fecha de nacimiento: ");
                String fechaNacimiento = entrada.nextLine();
                System.out.println("Lugar de nacimiento: ");
                String lugarNacimiento = entrada.nextLine();
                System.out.println("Telefono: ");
                int telefono = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Altura: ");
                double altura = entrada.nextDouble();
                System.out.println("Peso: ");
                int peso = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Numero de hijos: ");
                int numeroHijos = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Estrato social: ");
                int EstratoSocial = entrada.nextInt();
                entrada.nextLine();

                Medico M = new Medico(titulo, tipoMedico, tipoHorario, id, name, apellido, sexo, telefono, direccion, ciudadResidencia, tipoIdentificacion, tipoSangre, altura, peso, estadoCivil, numeroHijos, fechaNacimiento, lugarNacimiento, EstratoSocial);
                medicos.add(M);
                break;
            }
            case 2 -> {
                System.out.println("Tipo de afiliacion: ");
                String tipoAfiliacion = entrada.nextLine();
                System.out.println("Id: ");
                int id = entrada.nextInt();
                System.out.println("Nombre: ");
                String name = entrada.nextLine();
                System.out.println("Apellido: ");
                String apellido = entrada.nextLine();
                System.out.println("Sexo: ");
                String sexo = entrada.nextLine();
                System.out.println("Dirección: ");
                String direccion = entrada.nextLine();
                System.out.println("Ciudad de residencia: ");
                String ciudadResidencia = entrada.nextLine();
                System.out.println("Tipo de identificacion: ");
                String tipoIdentificacion = entrada.nextLine();
                System.out.println("Tipo de sangre: ");
                String tipoSangre = entrada.nextLine();
                System.out.println("Estado civil: ");
                String estadoCivil = entrada.nextLine();
                System.out.println("Fecha de nacimiento: ");
                String fechaNacimiento = entrada.nextLine();
                System.out.println("Lugar de nacimiento: ");
                String lugarNacimiento = entrada.nextLine();
                System.out.println("Telefono: ");
                int telefono = entrada.nextInt();
                System.out.println("Altura: ");
                double altura = entrada.nextDouble();
                System.out.println("Peso: ");
                int peso = entrada.nextInt();
                System.out.println("Numero de hijos: ");
                int numeroHijos = entrada.nextInt();
                System.out.println("Estrato social: ");
                int EstratoSocial = entrada.nextInt();
                Pacientes P = new Pacientes(tipoAfiliacion, id, name, apellido, sexo, telefono, direccion, ciudadResidencia, tipoIdentificacion, tipoSangre, altura, peso, estadoCivil, numeroHijos, fechaNacimiento, lugarNacimiento, EstratoSocial);
                pacientes.add(P);
                break;
            }
            case 3 -> {
                ArrayList <Medicamentos> medicamentos1 = new ArrayList<>();
                System.out.println("Id: ");
                int id = entrada.nextInt();
                System.out.println("Fecha: ");
                String fecha = entrada.nextLine();
                System.out.println("Id del Medico: ");
                int idMedico = entrada.nextInt();
                int indiM = buscar(1,idMedico);
                Medico objectm;
                Pacientes objectp;
                Medicamentos objectme;
                Consultorio objectCon;
                if ( indiM == -1){
                    return;
                } else {
                    objectm = medicos.get(indiM);
                }

                System.out.println("Id del paciente: ");
                int idPaciente = entrada.nextInt();
                int indiP = buscar(2,idPaciente);
                if (indiP == -1){
                    return;
                } else {
                    objectp = pacientes.get(indiP);
                }
                entrada.nextLine();
                System.out.println("diagnostico: ");
                String diagnostico = entrada.nextLine();
                entrada.nextLine();
                System.out.println("Sintomas del paciente: ");
                String sintomas = entrada.nextLine();
                entrada.nextLine();
                System.out.println("Cuantos Medicamentos le enviará al paciente: ");
                int CantMedica = entrada.nextInt();
                for (int i = 0;i < CantMedica;i++) {
                    System.out.println("Ingrese el id del medicamento "+(i+1));
                    int idm = entrada.nextInt();
                    int indiME = buscar(5,id);
                    if (indiME == -1){
                        return;
                    } else {
                        objectme = medicamentos.get(indiME);
                        medicamentos1.add(objectme);
                    }
                }
                System.out.println("Ingrese el id del consultorio: ");
                int idCon = entrada.nextInt();
                int indiCon = buscar(4,idCon);
                if (indiCon == -1){
                    return;
                } else{
                    objectCon = consultorios.get(indiCon);
                }

                Citas C = new Citas(id, fecha, idMedico, idPaciente,objectm,objectp,objectCon, diagnostico,sintomas,medicamentos1);
                citas.add(C);
                break;
            }
            case 4 -> {
                System.out.println("id: ");
                int id = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Nombre: ");
                String name = entrada.nextLine();
                entrada.nextLine();
                Consultorio Co = new Consultorio(id, name);
                consultorios.add(Co);
                break;
            }
            case 5 -> {
                System.out.println("Id: ");
                int id = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Nombre: ");
                String name = entrada.nextLine();
                entrada.nextLine();
                Medicamentos Me = new Medicamentos(id, name);
                medicamentos.add(Me);
                break;
            }
        }
    }

    public static int buscar(int opcion, int id) {
        int index = 0;
        int contador = 0;
        switch (opcion) {
            case 1 -> {
                for (Medico var : medicos
                ) {
                    contador += 1;
                    if (var.getId() == id) {
                        contador -= 1;
                        index = medicos.indexOf(var);

                    }
                }
                if (medicos.size() == contador) {
                    System.out.println("El medico no fue encontrado");
                    index = -1;
                }
                break;
            }
            case 2 -> {
                for (Pacientes var : pacientes
                ) {
                    contador += 1;
                    if (var.getId() == id) {
                        contador -= 1;
                        index = pacientes.indexOf(var);
                    }
                }
                if (pacientes.size() == contador) {
                    System.out.println("El paciente no fue encontrado");
                    index = -1;
                }
                break;
            }
            case 3 -> {
                for (Citas var : citas
                ) {
                    contador += 1;
                    if (var.getId() == id) {
                        contador -= 1;
                        index = citas.indexOf(var);
                    }
                }
                if (citas.size() == contador) {
                    System.out.println("La cita no fue encontrada");
                    index = -1;
                }
                break;
            }
            case 4 -> {
                for (Consultorio var : consultorios
                ) {
                    contador += 1;
                    if (var.getId() == id) {
                        contador -= 1;
                        index = consultorios.indexOf(var);
                    }
                }
                if (consultorios.size() == contador) {
                    System.out.println("El consultorio no fue encontrado");
                    index = -1;
                }
                break;
            }
            case 5 -> {
                for (Medicamentos var : medicamentos
                ) {
                    contador += 1;
                    if (var.getId() == id) {
                        contador -= 1;
                        index = medicamentos.indexOf(var);
                    }
                }
                if (medicamentos.size() == contador) {
                    System.out.println("El medicamento no fue encontrado");
                    index = -1;
                }
                break;
            }
        }
        return index;
    }
    public static String Mostrar(int index, int opcion) {
        String x = "";
        if (index == -1) {
            return x;
        } else {
            switch (opcion) {
                case 1 -> {
                    Medico object = medicos.get(index);
                    x = object.MostrarDatos();
                }
                case 2 -> {
                    Pacientes object = pacientes.get(index);
                    x = object.MostrarDatos();
                }
                case 3 -> {
                    Citas object = citas.get(index);
                    x = object.MostrarDatos();

                }
                case 4 -> {
                    Consultorio object = consultorios.get(index);
                    x = object.MostrarDatos();

                }
                case 5 -> {
                    Medicamentos object = medicamentos.get(index);
                    x = object.MostrarDatos();
                }

            }
        }
              return x;
    }
    public static void Actualizar(int opcion,int index){
        if (index >= 0) {
            switch (opcion) {
                case 1 -> {
                    System.out.println("Usted eligio actualizar "+options[opcion-1]);
                    entrada.nextLine();
                    System.out.println("Nombre: ");
                    String name = entrada.nextLine();
                    medicos.get(index).setNombre(name);
                    System.out.println("Apellido: ");
                    String apellido = entrada.nextLine();
                    medicos.get(index).setApellido(apellido);
                    System.out.println("Sexo: ");
                    String sexo = entrada.nextLine();
                    medicos.get(index).setSexo(sexo);
                    System.out.println("Dirección: ");
                    String direccion = entrada.nextLine();
                    medicos.get(index).setDireccion(direccion);
                    System.out.println("Ciudad de residencia: ");
                    String ciudadResidencia = entrada.nextLine();
                    medicos.get(index).setCiudadResidencia(ciudadResidencia);
                    System.out.println("Tipo de identificacion: ");
                    String tipoIdentificacion = entrada.nextLine();
                    medicos.get(index).setTipoIdentificacion(tipoIdentificacion);
                    System.out.println("Estado civil: ");
                    String estadoCivil = entrada.nextLine();
                    medicos.get(index).setEstadoCivil(estadoCivil);
                    System.out.println("Titulo: ");
                    String titulo = entrada.nextLine();
                    medicos.get(index).setTitulo(apellido);
                    System.out.println("Tipo de medico: ");
                    String tipoMedico = entrada.nextLine();
                    medicos.get(index).setTipoMedico(tipoMedico);
                    System.out.println("Tipo de Horario: ");
                    String tipoHorario = entrada.nextLine();
                    medicos.get(index).setTipoHorario(tipoHorario);
                    System.out.println("Telefono: ");
                    int telefono = entrada.nextInt();
                    medicos.get(index).setTelefono(telefono);
                    System.out.println("Altura: ");
                    double altura = entrada.nextDouble();
                    medicos.get(index).setAltura(altura);
                    System.out.println("Peso: ");
                    int peso = entrada.nextInt();
                    medicos.get(index).setPeso(peso);
                    System.out.println("Numero de hijos: ");
                    int numeroHijos = entrada.nextInt();
                    medicos.get(index).setNumeroHijos(numeroHijos);
                    System.out.println("Estrato social: ");
                    int EstratoSocial = entrada.nextInt();
                    medicos.get(index).setEstratoSocial(EstratoSocial);
                    System.out.println("Actualizado correctamente!");
                    break;
                }
                case 2 -> {
                    System.out.println("Usted eligio actualizar "+options[opcion-1]);
                    System.out.println("Tipo de afiliacion: ");
                    String tipoAfiliacion = entrada.nextLine();
                    pacientes.get(index).setTipoAfiliciacion(tipoAfiliacion);
                    System.out.println("Nombre: ");
                    String name = entrada.nextLine();
                    pacientes.get(index).setNombre(name);
                    System.out.println("Apellido: ");
                    String apellido = entrada.nextLine();
                    pacientes.get(index).setApellido(apellido);
                    System.out.println("Sexo: ");
                    String sexo = entrada.nextLine();
                    pacientes.get(index).setSexo(sexo);
                    System.out.println("Dirección: ");
                    String direccion = entrada.nextLine();
                    pacientes.get(index).setDireccion(direccion);
                    System.out.println("Ciudad de residencia: ");
                    String ciudadResidencia = entrada.nextLine();
                    pacientes.get(index).setCiudadResidencia(ciudadResidencia);
                    System.out.println("Tipo de identificacion: ");
                    String tipoIdentificacion = entrada.nextLine();
                    pacientes.get(index).setTipoIdentificacion(tipoIdentificacion);
                    System.out.println("Estado civil: ");
                    String estadoCivil = entrada.nextLine();
                    pacientes.get(index).setEstadoCivil(estadoCivil);
                    System.out.println("Telefono: ");
                    int telefono = entrada.nextInt();
                    pacientes.get(index).setTelefono(telefono);
                    System.out.println("Altura: ");
                    double altura = entrada.nextDouble();
                    pacientes.get(index).setAltura(altura);
                    System.out.println("Peso: ");
                    int peso = entrada.nextInt();
                    pacientes.get(index).setPeso(peso);
                    System.out.println("Numero de hijos: ");
                    int numeroHijos = entrada.nextInt();
                    pacientes.get(index).setNumeroHijos(numeroHijos);
                    System.out.println("Estrato social: ");
                    int EstratoSocial = entrada.nextInt();
                    pacientes.get(index).setEstratoSocial(EstratoSocial);
                    System.out.println("Actualizado correctamente!");
                    break;
                }
                case 3 -> {
                    System.out.println("Usted eligio actualizar "+options[opcion-1]);
                    entrada.nextLine();
                    System.out.println("Ingrese la nueva fecha: ");
                    String fecha = entrada.nextLine();
                    citas.get(index).setFecha(fecha);
                    System.out.println("Ingrese el nuevo diagnostico: ");
                    String Diagnostico = entrada.nextLine();
                    citas.get(index).setDiagnostico(Diagnostico);
                    System.out.println("Actualizado correctamente!");
                    break;
                }
                case 4 -> {
                    System.out.println("Usted eligio actualizar "+options[opcion-1]);
                    System.out.println("Ingrese el nombre: ");
                    String name = entrada.nextLine();
                    medicamentos.get(index).setName(name);
                    System.out.println("Actualizado correctamente!");
                    break;
                }
                case 5 -> {
                    System.out.println("Usted eligio actualizar "+options[opcion-1]);
                    System.out.println("Ingrese el nombre: ");
                    String name = entrada.nextLine();
                    consultorios.get(index).setName(name);
                    System.out.println("Actualizado correctamente!");
                    break;
                }
            }
        } else {
            System.out.println("Volviendo al menu...");

        }
    }
    public static void Borrar(int opcion,int index){
        if (index >= 0){
            switch (opcion){
                case 1 ->{
                    medicos.remove(medicos.get(index));
                    System.out.println("Eliminado correctamente!");
                }
                case 2 ->{
                    pacientes.remove(pacientes.get(index));
                    System.out.println("Eliminado correctamente!");
                }
                case 3 ->{
                    citas.remove(citas.get(index));
                    System.out.println("Eliminado correctamente!");
                }
                case 4 ->{
                    consultorios.remove(consultorios.get(index));
                    System.out.println("Eliminado correctamente!");
                }
                case 5 ->{
                    medicamentos.remove(medicamentos.get(index));
                    System.out.println("Eliminado correctamente!");
                }
            }
        } else{
            System.out.println("Volviendo al menu");
        }

    }
}