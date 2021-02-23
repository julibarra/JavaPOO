public class Fraccion {
    private double numerador;
    private  double denominador;

    public Fraccion(double numerador, double denominador) {
      if (numerador>denominador){
          throw new RuntimeException("El deniminador tiene que mayor al numerador");

      }else
          this.numerador=numerador;
          this.denominador=denominador;
    }

    public Fraccion() {
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion otra){
        Fraccion ret=new Fraccion();
        if (getDenominador()== otra.getDenominador()){
            ret.setNumerador(getNumerador()+ otra.getNumerador());
            ret.setDenominador(getDenominador());
        }else{
            ret.setNumerador((getNumerador()* otra.getDenominador())+
                    (otra.getNumerador()*getDenominador()));
            ret.setDenominador(getDenominador()*otra.getDenominador());
        }
        return ret;
    }
    public Fraccion sumar(int otra){
        Fraccion aux= new Fraccion((double) otra, 1.0);
        return sumar(aux);

    }

    public Fraccion resta(Fraccion otra){
        Fraccion ret=new Fraccion();
        if (getDenominador()== otra.getDenominador()){
          if (otra.getNumerador()>getNumerador()){
              ret.setNumerador(getNumerador()- otra.getNumerador());
          }else
              ret.setNumerador(otra.getNumerador()- getNumerador());
        }else{
            double a=(minimoComunMultiplo(getDenominador(),otra.getDenominador())/getDenominador())*getNumerador();
            double b=(minimoComunMultiplo(getDenominador(),otra.getDenominador())/otra.getDenominador())*otra.getNumerador();
            if (a>b){
                ret.setNumerador(a-b);
            }else{
                ret.setNumerador(b-a);
            }
            ret.setDenominador(minimoComunMultiplo(getDenominador(),otra.getDenominador()));
        }
        return ret;
    }
    public Fraccion resta(int otra){
        Fraccion aux= new Fraccion((double) otra, 1.0);
        return resta(aux);

    }

    private static double maximoComunDivisor(double a, double b) {
        double temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }
    private double minimoComunMultiplo(double a, double b) {

        return (a * b) / maximoComunDivisor(a, b);
    }


    public Fraccion multiplicar(Fraccion otra){
        Fraccion ret=new Fraccion();
        ret.setNumerador(getNumerador()* otra.getNumerador());
        ret.setDenominador(getDenominador()*otra.getDenominador());
        return ret;

    }
    public Fraccion multiplicar(int otra){
        Fraccion aux= new Fraccion((double) otra, 1.0);
        return multiplicar(aux);

    }
    public Fraccion dividir(Fraccion otra){
        Fraccion ret=new Fraccion();
        ret.setNumerador(getNumerador()* otra.getDenominador() );
        ret.setDenominador(getDenominador()*otra.getNumerador());
        return ret;

    }
    public Fraccion dividir(int otra){
        Fraccion aux= new Fraccion((double) otra, 1.0);
        return dividir(aux);
    }

    @Override
    public String toString() {
        return "Fraccion{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }

    public static void main(String[] args) {
        Fraccion fraccion1=new Fraccion(3,4);
        Fraccion fraccion2=new Fraccion(5,7);

        System.out.println(fraccion1.sumar(fraccion2).toString());

    }

}
