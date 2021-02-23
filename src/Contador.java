public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador(Contador contador) {
        valor=contador.getValor();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar(){
        valor++;
    }
    public void decrementar(){
        valor--;
    }

    public static void main(String[] args) {
        Contador contador= new Contador(0);

    }
}
