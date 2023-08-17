package src;
public class Automovil extends Vehiculo implements Conducible{
    private int numeroPuertas;
    private String tipoDeCombustible;
    //constructor
    public Automovil(int ruedas, String marca, String modelo, int numeroPuertas, String tipoDeCombustible) {
        super(ruedas, marca, modelo, "Automovil");
        this.numeroPuertas = numeroPuertas;
        this.tipoDeCombustible = tipoDeCombustible;
    }

    @Override
    //metodo para mostrar informacion especifica del automovil #6
    public void obtenerInformacion(){
        System.out.println(numeroPuertas);
        System.out.println(tipoDeCombustible);
    }
    //implementacion de la interfaz conducir a la clase #11
    @Override
    public void conducir(){
        System.out.println("El automovil con: " + numeroPuertas + " y de tipo de combustible: " + tipoDeCombustible + ", se encuentra en movimiento." );
    }

}
