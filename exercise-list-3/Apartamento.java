public class Apartamento {
    int nMoradores;
    int nQuartos;
    double espaco;
    double valorAluguel;

    public Apartamento(int nQuar, double esp, double valorAlg) {
        this.nQuartos = nQuar;
        this.espaco = esp;
        this.valorAluguel = valorAlg;
        this.nMoradores = 0;
    }

    public Apartamento(int nMor, int nQuar, double esp, double valorAlg) {
        this.nMoradores = nMor;
        this.nQuartos = nQuar;
        this.espaco = esp;
        this.valorAluguel = valorAlg;
    }

    public double dividirAluguel() {
        return this.valorAluguel / this.nMoradores;
    }

    public double valorporm2() {
        return this.valorAluguel / this.espaco;
    }
    
    public boolean aumentarMoradores() {
        if (this.nMoradores < this.nQuartos) {
            this.nMoradores++;
            return true;
        }
        return false;
    }
    
    public boolean diminuirMoradores() {
        if (this.nMoradores > 0) {
            this.nMoradores--;
            return true;
        }
        return false;
    }
}