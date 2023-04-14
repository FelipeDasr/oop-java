public class Produto {

    String nome;
    double valor;
    double peso;
    int quantidade;

    public Produto(String nNome, double nValor, double nPeso) {
        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;
        this.quantidade = 0;
    }

    public Produto(String nNome, double nValor, double nPeso, int quant) {
        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;
        this.quantidade = quant;
    }

    public double devolveValorAgregado() {
        return this.valor * this.quantidade;
    }

    public double devolvePesoAgregado()  {
        return this.peso * this.quantidade;
    }

    public double converteEmDolares(double cotacaoUSD) {
        return this.valor / cotacaoUSD; 
    }
}