public class Vehiculo {
    private int ruedas;
    private String marca;
    private String modelo;

    public Vehiculo() {
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void obtenerInformacion(){
        System.out.println("El vehiculo tiene: " + ruedas);
        System.out.println("El vehiculo es de la marca: " + marca);
        System.out.println("El vehiculo es del modelo: " + modelo);
    }
}
