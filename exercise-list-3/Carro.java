public class Carro {
  public String modelo;
  public double velocidade;
  public int nPortas;
  public int nPassageiros;
  public boolean estaLigado;

  public Carro(String mod,int nP, int nPas) {
    this.modelo = mod;
    this.nPassageiros = nPas;
    this.nPortas = nP;
  }

  void ligaCarro() {
    this.estaLigado = true;
  }

  void acelerar(double novaV) {
      if (this.estaLigado) {
        this.velocidade += novaV;
      }
  }

  void frear() {
    this.velocidade = 0;
  }

  String devolveInformacoes() {
    return "Carro de modelo " + this.modelo + " com " + this.nPassageiros + " passageiros";
  }  
}