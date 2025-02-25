package interfaces;

public class Leon extends Animal implements Cazador{

    public Leon() {

    }

    @Override
    public void acechar() {
        System.out.println("Vaya lomito tiene esa cebra.");
    }

}
