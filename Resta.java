public class Resta {
    private int n1;
    private int n2;
    private int resultado;

    public Resta(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public Resta(int n1) {
        this.n1 = n1;
    }
    public int getResta(){
        resultado = n1 - n2;
        return resultado;
    }
    public int decrementar(){
        n1--;
        return n1;
    }
}
