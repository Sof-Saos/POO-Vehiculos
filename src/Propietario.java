package src;

public class Propietario {

    private String nombre;
    private String apellido;
    private Vehiculo vehiculo;

    public Propietario(String nombre, String apellido, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.vehiculo = vehiculo;
    }
    public void mostrarInformacion(){
        System.out.println("El nombre del propetario es: " + nombre + " " + apellido);
        System.out.println("Y su vehiculo es: " + vehiculo);
    }

}
