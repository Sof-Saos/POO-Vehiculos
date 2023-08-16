package src;

public class Vehiculo {
    private int ruedas;
    private String marca;
    private String modelo;

    public Vehiculo(int ruedas, String marca, String modelo) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void obtenerInformacion(){
        System.out.println("El vehiculo tiene: " + ruedas);
        System.out.println("El vehiculo es de la marca: " + marca);
        System.out.println("El vehiculo es del modelo: " + modelo);
    }
}
