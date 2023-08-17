//Creacion de clase base #1
public class Vehiculo {
    //caracteristicas comunes #2
    private int ruedas;
    private String marca;
    private String modelo;

    //constructor
    public Vehiculo(int ruedas, String marca, String modelo) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodo para imprimir informacion basica del vehiculo #3
    public void obtenerInformacion(){
        System.out.println("El vehiculo tiene: " + ruedas);
        System.out.println("El vehiculo es de la marca: " + marca);
        System.out.println("El vehiculo es del modelo: " + modelo);
    }
}
