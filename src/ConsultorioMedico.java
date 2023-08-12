import java.util.ArrayList;
import java.util.List;

public class ConsultorioMedico {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();

        pacientes.add(new Paciente("Gabriel", 32, "Masculino", "Calle 1, Ciudad A", "Historial de Gabriel"));
        medicos.add(new Medico("Dr. López", 45, "Masculino", "Avenida 3, Ciudad C", "Neurología", "54321", "Martes y Jueves 8am - 4pm"));

        for (Paciente paciente : pacientes) {
            paciente.agendarConsulta();
            paciente.realizarConsulta();
            System.out.println("Historial médico de " + paciente.getNombre() + ": " + paciente.getHistorialMedico());
            System.out.println(" -- ");
        }

        for (Medico medico : medicos) {
            medico.agendarConsulta();
            medico.realizarConsulta();
            System.out.println("Especialidad: " + medico.getEspecialidad());
            System.out.println("Número de colegiado: " + medico.getNumeroColegiado());
            System.out.println("Horario de consultas: " + medico.getHorarioConsultas());
            System.out.println(" -- ");
        }
    }
}
