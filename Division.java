public class Division {
    private int n1;
    private int n2;
    private int resultado;

    public Division(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getDivision(){
        resultado = n1 / n2;
        return resultado;
    }
    public int getDivisionByZero(){
        this.n1 = 0;
        resultado = n1 / n2;
        return resultado;
    }
}
