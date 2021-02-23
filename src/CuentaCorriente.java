public class CuentaCorriente {
    private String nombre, numero;
    private double saldo;

    public CuentaCorriente(String nombre, String numero, double importe) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = importe;
    }

    //constructor copia
    public CuentaCorriente(CuentaCorriente cuenta) {
        nombre= cuenta.getNumero();
        numero=cuenta.getNumero();
        saldo=cuenta.getSaldo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double importe) {
        this.saldo = importe;
    }

    public void ingreso(double valor){
        saldo+=valor;
    }
    public void egreso(double valor){
        saldo-=valor;
    }
}
