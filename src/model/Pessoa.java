package model;
import java.sql.Date; //para representar a data de nascimento de uma pessoa
import java.time.LocalDate; //para calcular a idade de uma pessoa com base na data de nascimento e a data atual.
import java.time.Period; //para calcular a diferença de idade entre a data de nascimento e a data atual.
import java.time.ZoneId; //para obter o fuso horário padrão do sistema para calcular a idade com base na zona de fuso horário local.
import java.util.regex.Pattern;//validação de endereços de e-mail.
import java.util.regex.Matcher; //e realizar a correspondência do padrão no endereço de e-mail.

public class Pessoa {
    private String nome;
    private Date dataDeNascimento;
    private int cpf;
    private String telefone;
    private String email;
    private String genero;
    private String endereco;

    public Pessoa(String nome, Date dataDeNascimento, int cpf, String telefone, String email, String genero,
            String endereco) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int calcularIdade() {
        LocalDate dataNascimento = dataDeNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public boolean validarCPF() {
        String cpf = String.valueOf(this.cpf);

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }

        // Verifica se os dígitos verificadores são iguais aos dígitos originais
        if (primeiroDigito == (cpf.charAt(9) - '0') && segundoDigito == (cpf.charAt(10) - '0')) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarEmail() {
        // A expressão regular para validar um endereço de e-mail
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();

    }

}
