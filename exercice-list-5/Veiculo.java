abstract class Veiculo {
    public int nRodas;
    public String modelo;
    public int nPass;
    public int maxPass;

    public Veiculo(int nRodas, String modelo, int maxPass) {
        this.nRodas = nRodas;
        this.modelo = modelo;
        this.maxPass = maxPass;
        this.nPass = 0;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getNPass() {
        return this.nPass;
    }

    public boolean incPass() {
        if (this.nPass < this.maxPass) {
            this.nPass++;
            return true;
        }
        return false;
    }
}

public class Carro extends Veiculo {
    public String combustivel;
    public int potencia;

    public Carro(String modelo, String combustivel, int potencia) {
        super(4, modelo, 5);
        this.combustivel = combustivel;
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public int getPotencia() {
        return this.potencia;
    }
}

public class Bicicleta extends Veiculo {
    public int aro;
    public int nMarchas;

    public Bicicleta(String modelo, int aro, int nMarchas) {
        super(2, modelo, 1);
        this.aro = aro;
        this.nMarchas = nMarchas;
    }

    public int getAro() {
        return this.aro;
    }

    public int getMarchas() {
        return this.nMarchas;
    }
}
