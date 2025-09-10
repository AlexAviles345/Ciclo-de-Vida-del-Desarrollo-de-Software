package Figuras;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(){
        super();
        this.lado = 0;
    }

    public void calcularAreaCuadrado(double l) {
        super.area = l * l;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
