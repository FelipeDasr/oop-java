class Aluno {
    public String[] disciplinas;
    public String nome, RGA;
    public double[] medias;
    public int anoDeIngresso;

    Aluno(String novoNome, String rga, int AnoIngresso){
        this.nome = novoNome;
        this.RGA = rga;
        this.anoDeIngresso = AnoIngresso;
    }

    Aluno(String novoNome, String rga, int AnoIngresso, String[] listaDisciplinas, double[] listaMedias) {
        this.nome = novoNome;
        this.RGA = rga;
        this.anoDeIngresso = AnoIngresso;
        this.disciplinas = listaDisciplinas;
        this.medias = listaMedias;
    }

    public int tempoDeCurso(int ano) {
        return ano - this.anoDeIngresso;
    }

    public double devolveCoeficienteRendimento() {
        double media = 0;
        for (int i = 0; i < this.medias.length; i++) {
            media += this.medias[i];
        }

        return media / this.medias.length;
    }

    public void imprimeNome() {
        System.out.println(this.nome);
    }

    public boolean comparaAluno(Aluno B) {
        if (this.nome == B.nome && this.RGA == B.RGA) return true;
        return false;
    }
}

class Turma {
    public Aluno[] listaAlunos;
    public String disciplina;
    public int anoVigente;

    Turma(int nAlunos, int anoVigente, String disciplina, String[] nomes, String[] rgas, double[] medias) {
        this.listaAlunos = new Aluno[nAlunos];
        this.anoVigente = anoVigente;
        this.disciplina = disciplina;

        for (int i = 0; i < nAlunos; i++) {
            this.listaAlunos[i] = new Aluno(nomes[i], rgas[i], anoVigente, new String[] {disciplina}, new double[] {medias[i]});
        }
    }

    public void melhorMedia() {
        double maiorMedia = 0;
        String nomeAluno = "";
        
        for (int i = 0; i < this.listaAlunos.length; i++) {
            double mediaAluno = this.listaAlunos[i].devolveCoeficienteRendimento();
            String nomeAlunoAtual = this.listaAlunos[i].nome;
            
            if (mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
                nomeAluno = nomeAlunoAtual;
            }
        }

        System.out.println(nomeAluno);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Bob", "Ana", "Wilson", "Julia"};
        String[] rgas = {"20211234", "20215678", "20211273", "2019012341"};
        double [] medias  = {7.2, 9.9, 5.3, 6.7};
        Turma t = new Turma(4, 2022, "LPOO", nomes, rgas, medias);
        t.melhorMedia();
    }
}