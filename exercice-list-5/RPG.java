import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Personagem implements Comparable<Personagem> {
    private String nome;
    private int nivel;
    private int hp;
    private List<String> feiticos;
    private int score;

    public Personagem(String nome, int nivel, int hp, List<String> feiticos) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.feiticos = feiticos;

        this.calcScore();
    }

    public String getNome() {
        return this.nome;
    }

    public int compareTo(Personagem outroP) {
        int currentScore = this.getScore();
        int otherScore = outroP.getScore();

        return currentScore - otherScore;
    }

    public int getScore() {
        return this.score;
    }

    private void calcScore() {
        this.score = this.nivel * this.hp + this.feiticos.size();
    }
}

public class Grupo {
    private List<Personagem> personagens;

    public Grupo(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    public void ordenaPersonagens() {
        Collections.sort(this.personagens);
    }

    public void imprimePersonagens() {
        for (Personagem p : this.personagens) {
            System.out.println(p.getNome());
        }
    }
}
