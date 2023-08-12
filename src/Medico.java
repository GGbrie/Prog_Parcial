class Medico extends Persona implements Consulta {
    private String especialidad;
    private String numeroColegiado;
    private String horarioConsultas;

    public Medico(String nombre, int edad, String género, String dirección, String especialidad, String numeroColegiado, String horarioConsultas) {
        super(nombre, edad, género, dirección);
        this.especialidad = especialidad;
        this.numeroColegiado = numeroColegiado;
        this.horarioConsultas = horarioConsultas;
    }

    @Override
    public void agendarConsulta() {
        System.out.println("Realizando Consulta: " + getNombre());
    }

    @Override
    public void realizarConsulta() {
        System.out.println("Realizando Consulta: " + getNombre());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public String getHorarioConsultas() {
        return horarioConsultas;
    }
}
