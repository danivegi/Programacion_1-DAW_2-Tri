package interfaces;

public class Gacela extends Animal implements Presa {

    public Gacela() {

    }

    @Override
    public void huir() {
        System.out.println("Corre Gacela, corre");
    }

}
