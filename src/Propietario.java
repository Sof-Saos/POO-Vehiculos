package src;
public class Propietario {
    //atributos especificos #13
    private String nombre;
    private String apellido;
    private Vehiculo vehiculo;

    //constructor
    public Propietario(String nombre, String apellido, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.vehiculo = vehiculo;
    }
    //metodo / impresion propietario y vehiculo #14
    public void mostrarInformacion(){
        System.out.println("El nombre del propetario es: " + nombre + " " + apellido);
        System.out.println("Y su vehiculo es: " + vehiculo.getTipo());
    }

}
