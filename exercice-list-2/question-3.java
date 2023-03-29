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

public class Main{
    public static void main(String[] args) {
        Aluno a = new Aluno("Bob", "201819050111", 2018);
        Aluno b = new Aluno("Bob", "201819050112", 2018);

        System.out.println(a.tempoDeCurso(2022));

        if (a.comparaAluno(b))
            System.out.println("Mesmo aluno!");
        else
            System.out.println("Alunos diferentes!");
    }
}