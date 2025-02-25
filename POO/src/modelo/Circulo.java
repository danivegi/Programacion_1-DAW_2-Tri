package modelo;

public class Circulo {

    private int x;
    private int y;
    private int radio;

    public Circulo() {

    }

    public Circulo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circulo(int x, int y, int radio) {
        this.setX(x);
        this.setY(y);
        this.setRadio(radio);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [x=" + x + ", y=" + y + ", radio=" + radio + "]";
    }

}
