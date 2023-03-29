class Matriz {
    public double[][] M;
    public int n, m;

    public Matriz(int n, int m) {
        this.n = n;
        this.m = m;

        this.M = new double[n][m];
    }

    public Matriz(double[][] M) {
        this.n = M.length;
        this.m = M[0].length;

        this.M = new double[n][m];
        this.copiaMatriz(M);
    }

    void copiaMatriz(double[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                this.M[i][j] = M[i][j];
            }
        }
    }

    void imprimeMatriz() {
        for (int i = 0; i < this.M.length; i++) {
            for (int j = 0; j < this.M[i].length; j++) {
                System.out.print(this.M[i][j] + " ");
            }
            System.out.println();
        }
    }

    Matriz somaMatriz(Matriz B) {
        if (this.n != B.n || this.m != B.m) {
            return null;
        }

        Matriz novaMatriz = new Matriz(this.n, this.m);

        for (int i = 0; i < this.M.length; i++) {
            for (int j = 0; j < this.M[i].length; j++) {
                novaMatriz.M[i][j] = this.M[i][j] + B.M[i][j];
            }
        }

        return novaMatriz;
    }

    Matriz multiplicaMatriz(Matriz B) {
        if (this.m != B.n) {
            return null;
        }

        Matriz novaMatriz = new Matriz(this.n, B.m);

        for (int i = 0; i < this.M.length; i++) {
            for (int j = 0; j < B.M[i].length; j++) {
                for (int k = 0; k < this.M[i].length; k++) {
                    novaMatriz.M[i][j] += this.M[i][k] * B.M[k][j];
                }
            }
        }

        return novaMatriz;
    }

    Boolean ehQuadrada() {
        return this.n == this.m;
    }
}

public class Main {
    public static void main(String[] args) {
        double [][] valores1 = {{-1,0,0},{0,-1,0},{0,0,-1}};
        double [][] valores2 = {{1,2,3},{4,5,6},{7,8,9}};
        Matriz A = new Matriz(valores2);
        Matriz B = new Matriz(valores1);
        A.multiplicaMatriz(B).imprimeMatriz();
    }
}