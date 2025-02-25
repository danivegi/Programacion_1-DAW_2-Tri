package modelo;

public class Punto {

    private float x;
    private float y;

    public Punto() {

    }
    
    //cambiar a setX y setY

    public Punto(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

}
