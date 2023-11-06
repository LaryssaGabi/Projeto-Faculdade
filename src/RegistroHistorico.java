public class RegistroHistorico {
    private String disciplina;
    private double nota;
    private String data;
    private Cursos cursos;

    public RegistroHistorico(String disciplina, double nota, String data, Cursos cursos) {
        this.disciplina = disciplina;
        this.nota = nota;
        this.data = data;
        this.cursos = cursos;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getNota() {
        return nota;
    }

    public String getData() {
        return data;
    }

    public Cursos getCursos() {
        return cursos;
    }

    // Método para calcular a situação do aluno com base na nota
    public String calcularSituacaoAluno() {
        if (nota >= 6.0) {
            return "Aprovado";
        } else if (nota >= 4.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    // Método para verificar se a data é válida (pode ser implementado com validação
    // mais detalhada)
    public boolean isDataValida() {
        // Implemente a lógica para verificar se a data é válida
        return data != null && !data.isEmpty();
    }

    // Método para obter uma representação de string dos dados do registro
    public String toString() {
        return "Disciplina: " + disciplina + ", Nota: " + nota + ", Data: " + data;
    }

}
