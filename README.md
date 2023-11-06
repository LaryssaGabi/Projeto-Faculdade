

# Sistema de Cadastro de Alunos e Professores

Este é um sistema simples para cadastrar alunos e professores. Os objetos `Aluno` e `Professor` são criados a partir das informações fornecidas pelo usuário e armazenados em listas separadas. Além disso, o sistema permite listar os alunos e professores cadastrados. Até o momento o código esta nessa parte de desenvolvimento, em breve, terá a integração com o banco de dados, permitindo salvar as informações cadastradas, tanto do aluno, quando do professoe, cursos, diciplinas...

## Classes

### Pessoa

A classe `Pessoa` representa uma pessoa e contém os seguintes atributos:

- `nome`: Nome da pessoa.
- `dataDeNascimento`: Data de nascimento da pessoa.
- `cpf`: Número de CPF da pessoa.
- `telefone`: Número de telefone da pessoa.
- `email`: Endereço de e-mail da pessoa.
- `genero`: Gênero da pessoa.
- `endereco`: Endereço da pessoa.

### Aluno

A classe `Aluno` representa um aluno e contém os seguintes atributos:

- `estudante`: Um objeto `Pessoa` representando o aluno.
- `ra`: Registro Acadêmico (RA) do aluno.
- `notas`: Notas do aluno.
- `curso`: Um objeto `Cursos` representando o curso em que o aluno está matriculado.
- `situacaoAcademica`: Situação acadêmica do aluno (ativo, trancado, formado, transferido).
- `historicoAcademica`: Uma lista de registros históricos das disciplinas cursadas pelo aluno.

### Professor

A classe `Professor` representa um professor e contém os seguintes atributos:

- `educador`: Um objeto `Pessoa` representando o professor.
- `diciplina`: Disciplina que o professor ministra.
- `salario`: Salário do professor.
- `id`: Identificador único do professor.
- `turno`: Enumeração que representa o turno em que o professor leciona (manhã, tarde, noite).

### Cursos

A classe `Cursos` representa um curso e contém os seguintes atributos:

- `nomeDoCurso`: Nome do curso.
- `codigoDoCurso`: Código do curso.
- `cargaHoraria`: Carga horária do curso.
- `descricao`: Descrição do curso.
- `educadorProfessor`: Um objeto `Professor` que atua como coordenador do curso.
- `dataDeInicio`: Data de início do curso.
- `dataDeConclusao`: Data de conclusão do curso.
- `vagasDisponiveis`: Número de vagas disponíveis no curso.
- `status`: Status do curso (ativo, em andamento, finalizado).
- `disciplinas`: Uma lista de disciplinas que fazem parte do curso.

### Disciplina

A classe `Disciplina` representa uma disciplina e contém os seguintes atributos:

- `nome`: Nome da disciplina.
- `codigo`: Código da disciplina.
- `descricao`: Descrição da disciplina.

### RegistroHistorico

A classe `RegistroHistorico` representa um registro de histórico acadêmico de um aluno e contém os seguintes atributos:

- `disciplina`: Nome da disciplina.
- `nota`: Nota obtida na disciplina.
- `data`: Data de conclusão da disciplina.
- `cursos`: Um objeto `Cursos` que representa o curso em que a disciplina foi concluída.

### EnderecoDeMoradia

A classe `EnderecoDeMoradia` representa o endereço de moradia de uma pessoa e contém os seguintes atributos:

- `enderecoPessoa`: Um objeto `Pessoa` associado ao endereço.
- `rua`: Nome da rua.
- `numero`: Número da residência.
- `bairro`: Bairro da residência.
- `cidade`: Cidade da residência.
- `uf`: Unidade Federativa (Estado) da residência.
- `cep`: CEP da residência.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- Cadastro de alunos e professores com informações pessoais.
- Listagem de alunos e professores cadastrados.
- Cadastro de cursos com informações detalhadas.
- Adição e remoção de disciplinas em um curso.
- Verificação de disponibilidade de vagas em um curso.
- Atualização de status e descrição do curso.
- Cálculo da média de notas e situação acadêmica do aluno.
- Verificação de idade a partir da data de nascimento.
- Validação de CPF e endereço de e-mail.

## Como Usar

1. Execute o programa e siga as instruções para cadastrar alunos e professores.
2. Você pode escolher entre cadastrar um aluno ou um professor.
3. Ao cadastrar um aluno, forneça as informações pessoais e o RA.
4. Ao cadastrar um professor, forneça as informações pessoais e a disciplina que ele ministra.
5. O sistema listará os alunos e professores cadastrados após a conclusão.

Este sistema fornece uma estrutura básica para gerenciar alunos, professores e cursos. Você pode personalizá-lo de acordo com suas necessidades específicas.
