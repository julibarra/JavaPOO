public abstract class FiguraGeometrica {
    public abstract double area();

    public void imprimirArea(){

        System.out.println("Area de la figura: "+ area());
    }

    public static double areaPromedio(FiguraGeometrica array[]){
        double suma=0;
        for (FiguraGeometrica figura:array) {
            suma+=figura.area();
        }
        return suma/array.length;
    }


}
