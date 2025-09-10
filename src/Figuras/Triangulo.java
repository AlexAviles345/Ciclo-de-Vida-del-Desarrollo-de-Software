package Figuras;

public class Triangulo extends Figura{
    public double base;
    public double altura;

    public Triangulo(){
        super();
        this.base = 0;
        this.altura = 0;
    }

    public void calcularAreaTriangulo(double base, double altura){
        super.area = (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
