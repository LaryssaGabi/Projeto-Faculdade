package model;
import java.sql.Date;
import java.util.ArrayList;

public class Cursos {
    private String nomeDoCurso;
    private int codigoDoCurso;
    private int cargaHoraria;
    private String descricao;
    private Professor educadorProfessor;
    private Date dataDeInicio;
    private Date dataDeConclusao;
    private int vagasDisponiveis;
    private Status status;
    private ArrayList<Disciplina> disciplinas;

    public Cursos(String nomeDoCurso, int codigoDoCurso, int cargaHoraria, String descricao,
            Professor educadorProfessor,
            Date dataDeInicio, Date dataDeConclusao, int vagasDisponiveis, Status status) {
        this.nomeDoCurso = nomeDoCurso;
        this.codigoDoCurso = codigoDoCurso;
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
        this.educadorProfessor = educadorProfessor;
        this.dataDeInicio = dataDeInicio;
        this.dataDeConclusao = dataDeConclusao;
        this.vagasDisponiveis = vagasDisponiveis;
        this.status = status;
        this.disciplinas = new ArrayList<>();
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public int getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Professor getEducadorProfessor() {
        return educadorProfessor;
    }

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public Date getDataDeConclusao() {
        return dataDeConclusao;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public Status getStatus() {
        return status;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public void setCodigoDoCurso(int codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEducadorProfessor(Professor educadorProfesor) {
        this.educadorProfessor = educadorProfesor;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public void setDataDeConclusao(Date dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    enum Status {
        ativo,
        emAndamneto,
        finalizado

    }

    // Adicionar uma disciplina à lista de disciplinas do curso
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    // Remover uma disciplina da lista de disciplinas do curso
    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    // Verificar se há disponibilidade de vagas no curso, de acordo com a quantidade de inscrições
    public boolean verificaDisponibilidadeVagas() {
        if (vagasDisponiveis > 0) {
            return true; // Há vagas disponíveis.
        } else {
            return false; // Não há mais vagas disponíveis.
        }
    }

    // Definir um professor coordenador para o curso
    public void definirProfessorCoordenador(Professor professorCoordenador) {
        this.educadorProfessor = professorCoordenador;
    }

    // Atualizar a descrição do curso
    public void atualizarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    // Calcular a duração do curso em dias
    public int calcularDuracao() {
        // Calcule a duração do curso em dias, meses, ou como for apropriado.
        long diff = dataDeConclusao.getTime() - dataDeInicio.getTime();
        return (int) (diff / (24 * 60 * 60 * 1000));
    }

    // Atualizar o status do curso
    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

}
