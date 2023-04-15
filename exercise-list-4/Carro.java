public class Carro {
  private String modelo;
  private double velocidade;
  private int nPortas;
  private int nPassageiros;
  private boolean estaLigado;

  public Carro(String mod,int nP, int nPas) {
    this.modelo = mod;
    this.nPassageiros = nPas;
    this.nPortas = nP;
  }

  public void ligaCarro() {
    this.estaLigado = true;
  }

  public void desligarCarro() {
    this.estaLigado = false;
    this.velocidade = 0;
  }
  
  public void acelerar(double novaV) {
      if (this.estaLigado) {
        this.velocidade += novaV;
      }
  }

  public getStatus() {
    return this.estaLigado;
  }

  public void frear() {
    this.velocidade = 0;
  }

  public double getVelocidade() {
    return this.velocidade;
  }

  public int getNumeroDePortas() {
    return this.nPortas;
  }

  public int getNumeroDePassageiros() {
    return this.nPassageiros;
  }

  public boolean setPassageiros(int nPas) {
    if (nPas => 0 && !this.getStatus()) {
      this.nPassageiros = nPas;
      return true;
    }
    return false;
  }

  public getModelo() {
    return this.modelo;
  }

  public String getInformacoes() {
    return "Carro de modelo " + this.modelo + " com " + this.nPassageiros + " passageiros";
  }  
}