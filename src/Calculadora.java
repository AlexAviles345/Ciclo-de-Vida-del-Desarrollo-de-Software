public class Calculadora {

    public double calcularAreaCirculo(double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularAreaTriangulo(double base, double altura){
        return (base * altura) / 2;
    }

    public double calcularAreaRectangulo(double base, double altura){
        return base * altura;
    }

    public static double calcularAreaCuadrado(double l) {
        return l * l;
    }

    public static double calcularPromedio ( double[] nums ){
        double total = 0;
        for (double d : nums) {
            total += d;
        }
        return  total / nums.length;
    }

    public static double calcularRaizCuadrada ( double n ){
        return n/n;
    }
}
