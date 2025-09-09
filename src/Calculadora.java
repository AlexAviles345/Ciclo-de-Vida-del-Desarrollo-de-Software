public class Calculadora {

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
