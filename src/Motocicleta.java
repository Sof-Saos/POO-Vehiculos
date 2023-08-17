//Clase derivada de vehiculov#7
public class Motocicleta extends Vehiculo implements Conducible{
    //Atributos adicionales #8
    private int cilindrada;
    private String tipoDeManejo;

    //constructor
    public Motocicleta(int ruedas, String marca, String modelo, int cilindrada, String tipoDeManejo) {
        super(ruedas, marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoDeManejo = tipoDeManejo;
    }

    @Override
    //metodo para mostrar informacion especifica de la motocicleta #9
    public void obtenerInformacion(){
        System.out.println(cilindrada);
        System.out.println(tipoDeManejo);
    }
    //implementacion de la interfaz conducir a la clase #11
    public void conducir(){
        System.out.println("La motocicleta tiene cilindadra de: " + cilindrada + " y un tipo de manejo: " + tipoDeManejo + "se encuentra en movimiento");
   }
}
