package interfaces;

public class Rana extends Animal implements Cazador, Presa {

    public Rana() {

    }

    public Rana(String especie, String habitat) {
        super(especie, habitat);
    }

    @Override
    public void huir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'huir'");
    }

    @Override
    public void acechar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acechar'");
    }

}
