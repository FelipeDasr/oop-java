public class Produto {

    private String nome;
    private double valor;
    private double peso;
    private int quantidade;

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

    private boolean novoValorEhValido(double valor) {
        return valor > 0;
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

    public double getValor() {
        return this.valor;
    }

    public boolean setValor(double valor) {
        if (novoValorEhValido(valor)) {
            this.valor = valor;
            return true;
        }
        return false;
    }

    public boolean setPeso(double peso) {
        if (novoValorEhValido(peso)) {
            this.peso = peso;
            return true;
        }
        return false;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String nome) {
        if (novoValorEhValido(nome.length())) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public boolean setQuantidade(int quantidade) {
        if (novoValorEhValido(quantidade)) {
            this.quantidade = quantidade;
            return true;
        }
        return false;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}