package src;
public class Automovil extends Vehiculo implements Conducible{
    private int numeroPuertas;
    private String tipoDeCombustible;

    public Automovil(int ruedas, String marca, String modelo, int numeroPuertas, String tipoDeCombustible) {
        super(ruedas, marca, modelo);
        this.numeroPuertas = numeroPuertas;
        this.tipoDeCombustible = tipoDeCombustible;
    }

    @Override
    public void obtenerInformacion(){
        System.out.println(numeroPuertas);
        System.out.println(tipoDeCombustible);
    }

    public void conducir(){
        System.out.println("El automovil con: " + numeroPuertas + " y el tipo de combustible: " + tipoDeCombustible + ". Se encuentra en movimiento." );
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }
}
