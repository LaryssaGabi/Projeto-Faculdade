package model;
public class Professor {
    private Pessoa educador;
    private String diciplina;
    private double salario;
    private int id;
    private Turno turno; // O tipo desse atributo é uma enumeração (enum) com valores "Manhã", "Tarde" e
                         // "Noite" para representar os diferentes turnos.

    public Professor(Pessoa educador, String diciplina, double salario, int id, Turno turno) {
        this.educador = educador;
        this.diciplina = diciplina;
        this.salario = salario;
        this.id = id;
        this.turno = turno;
    }

    public Pessoa getEducador() {
        return educador;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setEducador(Pessoa educador) {
        this.educador = educador;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    // Enumeração para representar os turnos
    enum Turno {
        manha,
        tarde,
        noite
    }

    // Método para calcular o salário anual com base no salário mensal
    public double calcularSalarioAnual() {
        return salario * 12;
    }

    // Método para verificar se o professor trabalha em período integral (cobrindo
    // todos os turnos)
    public boolean trabalhaPeriodoIntegral() {
        return turno == Turno.manha || turno == Turno.tarde || turno == Turno.noite;
    }
    
    // Método para obter o turno como uma string legível
    public String getTurnoAsString() {
        switch (turno) {
            case manha:
                return "Manhã";
            case tarde:
                return "Tarde";
            case noite:
                return "Noite";
            default:
                return "Desconhecido";
        }

    }
}
