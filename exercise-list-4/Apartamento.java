public class Apartamento {
    private int nMoradores;
    private int nQuartos;
    private double espaco;
    private double valorAluguel;

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

    private boolean numeroDeMoradoresEhValido(double valor) {
        return valor >= 0 || valor <= this.nQuartos;
    }

    public double getValorTotalDoAluguel() {
        return this.valorAluguel;
    }

    public boolean setValorTotalDoAluguel(double valor) {
        if (valor > 0) {
            this.valorAluguel = valor;
            return true;
        }   
        return false; 
    }

    public double pegarValorDoAluguelPorMorador() {
        return this.valorAluguel / this.nMoradores;
    }

    public double getValorPorMorador() {
        return this.valorAluguel / this.espaco;
    }

    public double getEspaco() {
        return this.espaco;
    }

    public int getNumeroDeQuartos() {
        return this.nQuartos;
    }

    public int getNumeroDeMoradores() {
        return this.nMoradores;
    }
    
    public boolean aumentarMoradores() {
        if (numeroDeMoradoresEhValido(this.nMoradores + 1)) {
            this.nMoradores++;
            return true;
        }
        return false;
    }
    
    public boolean diminuirMoradores() {
        if (numeroDeMoradoresEhValido(this.nMoradores - 1)) {
            this.nMoradores--;
            return true;
        }
        return false;
    }
}