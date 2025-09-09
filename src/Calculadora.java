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
}
