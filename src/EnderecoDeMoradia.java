public class EnderecoDeMoradia {
    private Pessoa enderecoPessoa;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public EnderecoDeMoradia(Pessoa enderecoPessoa, String rua, int numero, String bairro, String cidade, String uf,
            String cep) {
        this.enderecoPessoa = enderecoPessoa;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public Pessoa getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public void setEnderecoPessoa(Pessoa enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // Método para obter uma representação de string do endereço completo
    public String obterEnderecoCompleto() {
        return rua + ", " + numero + ", " + bairro + ", " + cidade + ", " + uf + ", " + cep;
    }

    /* Método para verificar se o endereço é o mesmo que o de outra instância da
     classe EnderecoDeMoradia*/
    public boolean enderecoIgual(EnderecoDeMoradia outroEndereco) {
        return this.rua.equals(outroEndereco.getRua()) &&
                this.numero == outroEndereco.getNumero() &&
                this.bairro.equals(outroEndereco.getBairro()) &&
                this.cidade.equals(outroEndereco.getCidade()) &&
                this.uf.equals(outroEndereco.getUf()) &&
                this.cep.equals(outroEndereco.getCep());
    }

    // Método para atualizar todas as informações de endereço de uma vez
    public void atualizarEndereco(String rua, int numero, String bairro, String cidade, String uf, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }
}
