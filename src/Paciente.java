class Paciente extends Persona implements Consulta {
    private String historialMedico;

    public Paciente(String nombre, int edad, String género, String dirección, String historialMedico) {
        super(nombre, edad, género, dirección);
        this.historialMedico = historialMedico;
    }

    @Override
    public void agendarConsulta() {
        System.out.println("Agendando Consulta: " + getNombre());
    }

    @Override
    public void realizarConsulta() {
        System.out.println("Realizando Consulta: " + getNombre());
    }

    public String getHistorialMedico() {
        return historialMedico;
    }
}
