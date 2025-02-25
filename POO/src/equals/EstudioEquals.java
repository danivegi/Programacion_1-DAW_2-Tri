package equals;

import excepciones.CampoVacioException;
import excepciones.DniException;
import modelo.Persona1;

public class EstudioEquals {

    public EstudioEquals() {

        try {
            Persona1 p1 = new Persona1("Juan", "Perez", "31123456J");
            Persona1 p2 = new Persona1("Juan", "Perez", "31123456J");
            System.out.println(p1.equals(p2));
            System.out.println(p1.hashCode());
            System.out.println(p2.hashCode());


        } catch (DniException | CampoVacioException e) {
            e.printStackTrace();
        }
        

    }

}
