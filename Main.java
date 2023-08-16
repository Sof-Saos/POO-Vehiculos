public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        Motocicleta moto = new Motocicleta();

        Propietario persona1 = new Propietario("Jose", "Hernandez", moto);
        Propietario persona2 = new Propietario("Juana", "Banana", auto);

        System.out.println("---------- Propietario 1 ----------");
        persona1.mostrarInformacion();

        System.out.println("---------- Propietario 2 ----------");
        persona2.mostrarInformacion();
    }
}
