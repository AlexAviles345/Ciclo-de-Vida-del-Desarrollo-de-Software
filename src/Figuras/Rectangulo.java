package Figuras;

public class Rectangulo extends Figura{
    public double base;
    public double altura;

    public Rectangulo(){
        super();
        this.base = 0;
        this.altura = 0;
    }

    public void calcularAreaRectangulo(double base, double altura){
        super.area = base * altura;
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
