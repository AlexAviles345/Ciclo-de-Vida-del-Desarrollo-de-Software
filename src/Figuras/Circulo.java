package Figuras;

public class Circulo extends Figura{
    private double radio;

    public Circulo(){
        super();
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
