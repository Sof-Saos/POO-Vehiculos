package src;

public class Motocicleta extends Vehiculo implements Conducible{
    private int cilindrada;
    private String tipoDeManejo;

    public Motocicleta(int ruedas, String marca, String modelo, int cilindrada, String tipoDeManejo) {
        super(ruedas, marca, modelo, "Motocicleta");
        this.cilindrada = cilindrada;
        this.tipoDeManejo = tipoDeManejo;
    }

    @Override
    public void obtenerInformacion(){
        System.out.println(cilindrada);
        System.out.println(tipoDeManejo);
    }

    public void conducir(){
        System.out.println("La motocicleta tiene cilindadra de: " + cilindrada + " con tipo de manejo: " + tipoDeManejo + ",se encuentra en movimiento");
   }

}
