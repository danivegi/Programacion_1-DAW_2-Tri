package ejercicios;

import excepciones.SaldoInsuficienteException;

public class TarjetaRegalo {

    private double saldo;
    private String numTarjeta;

    public TarjetaRegalo(double saldoFinal) {
        /*
         * La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
         * las tarjetas regalo. Como primer paso para implementar la aplicación, es
         * necesario crear la clase principal. Implementa la clase TarjetaRegalo.
         * Cuandose crea una nueva tarjeta, se le da un saldo y se asigna de forma
         * automática un número de 5 dígitos. Si se intenta gastar más dinero del que
         * tiene la tarjeta, se debe mostrar un mensaje de error. Dos tarjetas regalo se
         * pueden fusionar creando una nueva tarjeta con la suma del saldo que tenga
         * cada una y un nuevo número aleatorio de 5 cifras. Al fusionar dos tarjetas en
         * una, las dos tarjetas originales se quedarían con 0 € de saldo.
         */
    }

    

    public TarjetaRegalo(String saldo) {
        this.setSaldo(saldo);

        //Genera un número de tarjeta aleatorio de 5 cifras
        this.numTarjeta = "";
        for (int x = 0; x < 5; x++) {
            this.numTarjeta += (int)(Math.random() * 10);
        }
    }
    
    @Override
    public String toString() {
        return "TarjetaRegalo [saldo=" + saldo + ", numTarjeta=" + numTarjeta + "]";
    }



    public void gasta(double cantidad) throws SaldoInsuficienteException {
        saldo -= cantidad;
        if (saldo < 0) {
            throw new SaldoInsuficienteException();
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    
 
    public TarjetaRegalo fusionaCon(TarjetaRegalo t2) {
        double saldoFinal = this.saldo + t2.saldo;
        return new TarjetaRegalo(saldoFinal);
    }

}
