package src;
//Creacion de clase base #1
public class Vehiculo {
    private int ruedas;
    private String marca;
    private String modelo;
    private String tipo;

    //constructor
    public Vehiculo(int ruedas, String marca, String modelo, String tipo) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    //metodo para imprimir informacion basica del vehiculo #3
    public void obtenerInformacion(){
        System.out.println("El vehiculo tiene: " + ruedas);
        System.out.println("El vehiculo es de la marca: " + marca);
        System.out.println("El vehiculo es del modelo: " + modelo);
    }

    //Getter para saber que tipo de vehiculo tiene
    public String getTipo() {
        return tipo;
    }
}
