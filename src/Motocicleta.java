public class Motocicleta extends Vehiculo implements Conducible{
    private int cilindrada;
    private String tipoDeManejo;

    public Motocicleta(int ruedas, String marca, String modelo, int cilindrada, String tipoDeManejo) {
        super(ruedas, marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoDeManejo = tipoDeManejo;
    }

    @Override
    public void obtenerInformacion(){
        System.out.println(cilindrada);
        System.out.println(tipoDeManejo);
    }

    public void conducir(){
        System.out.println("La motocicleta tiene cilindadra de: " + cilindrada + " y un tipo de manejo: " + tipoDeManejo + "se encuentra en movimiento");
   }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoDeManejo() {
        return tipoDeManejo;
    }

    public void setTipoDeManejo(String tipoDeManejo) {
        this.tipoDeManejo = tipoDeManejo;
    }
}
