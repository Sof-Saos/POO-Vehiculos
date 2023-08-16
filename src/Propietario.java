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
        System.out.println("El nombre del propetario es:" + nombre + " " + apellido);
        System.out.println("Y su vehiculo es: " + vehiculo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
