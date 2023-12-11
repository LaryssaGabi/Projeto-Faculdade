package model;
import java.util.ArrayList;

public class Aluno {
    private Pessoa estudante;
    private String ra;
    private double notas;
    private Cursos curso;
    private SituacaoAcademica situacaoAcademica; // se o aluno esta ativo, trancado, transferico, formado.
    private ArrayList<RegistroHistorico> historicoAcademica;

    public Aluno(Pessoa estudante, String ra, double notas, SituacaoAcademica situacaoAcademica, Cursos curso) {
        this.estudante = estudante;
        this.ra = ra;
        this.notas = 0.0; // Inicialmente, o aluno não possui notas
        this.situacaoAcademica = situacaoAcademica;
        this.historicoAcademica = new ArrayList<>();
        this.curso = curso;
    }
    

    public Aluno(Pessoa estudante2, String ra2, double notas2, Aluno.SituacaoAcademica ativo,
            Object historicoAcademica2, Object curso2) {
    }

    public Pessoa getEstudante() {
        return estudante;
    }

    public Cursos getCurso() {
        return curso;
    }

    public String getRa() {
        return ra;
    }

    public double getNotas() {
        return notas;
    }

    public SituacaoAcademica getSituacaoAcademica() {
        return situacaoAcademica;
    }

    public ArrayList<RegistroHistorico> getHistoricoAcademica() {
        return historicoAcademica;
    }

    public void setEstudante(Pessoa estudante) {
        this.estudante = estudante;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public void setSituacaoAcademica(SituacaoAcademica situacaoAcademica) {
        this.situacaoAcademica = situacaoAcademica;
    }

    public void setHistoricoAcademica(ArrayList<RegistroHistorico> historicoAcademica) {
        this.historicoAcademica = historicoAcademica;
    }

    // Métodos para gerenciar o histórico acadêmico
    public void adicionarRegistroHistorico(RegistroHistorico registro) {
        historicoAcademica.add(registro);
    }

    public void removerRegistroHistorico(RegistroHistorico registro) {
        historicoAcademica.remove(registro);
    }

    // Método para calcular a média das notas do aluno
    public double calcularMediaNotas() {
        double somaNotas = 0.0;
        for (RegistroHistorico registro : historicoAcademica) {
            somaNotas += registro.getNota();
        }
        return historicoAcademica.isEmpty() ? 0.0 : somaNotas / historicoAcademica.size();
    }

    // Método para verificar se o aluno está aprovado (nota média maior ou igual a um valor mínimo)
    public boolean estaAprovado(double notaMinima) {
        return calcularMediaNotas() >= notaMinima;
    }

    enum SituacaoAcademica {
        ativo, trancado, formado, transferido;
    }
    

}
