abstract class Pessoa {
    protected String nome;
    protected String CPF;
    protected int idade;
    protected String[] disciplinas;

    public Pessoa(String nome, String CPF, int idade, String[] disciplinas) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;

        this.disciplinas = new String[7];
        
        for (int i = 0; i < disciplinas.length; i++) {
            this.disciplinas[i] = disciplinas[i];
        }
    }

    public void incrementaIdade() {
        this.idade++;
    }

    public String getInfo() {
        return "Pessoa de nome " + this.nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public int getIdade() {
        return this.idade;
    }

    public String[] getDisciplinas() {
        return this.disciplinas;
    }
}

public class Estudante extends Pessoa {
    private String RGA;

    public Estudante(String nome, String CPF, int idade, String[] disciplinas, String RGA) {
        super(nome, CPF, idade, disciplinas);
        this.RGA = RGA;
    }

    public String getInfo() {
        return "Aluno de RGA " + this.getRGA();
    }

    public String getRGA() {
        return this.RGA;
    }
}

public class Professor extends Pessoa {
    private String cadastro;

    public Professor(String nome, String CPF, int idade, String[] disciplinas, String cadastro) {
        super(nome, CPF, idade, disciplinas);
        this.cadastro = cadastro;
    }

    public String getInfo() {
        return "Professor de cadastro " + this.getCadastro();
    }

    public String getCadastro() {
        return this.cadastro;
    }
}