package src;

public class Main {
    public static void main(String[] args) {
        //Creacion de la instancia (Automovil, motocicleta) #15
        Automovil auto = new Automovil(4, "Jeep", "A34", 4, "Gasolina");
        Motocicleta moto = new Motocicleta(2, "Navi", "Honda", 109, "Automatica");

        //asignacion de propietarios #16
        Propietario persona1 = new Propietario("Jose", "Hernandez", moto);
        Propietario persona2 = new Propietario("Juana", "Banana", auto);

        //mostrar propietarios y vehiculos #17
        System.out.println("---------- Propietario 1 ----------");
        persona1.mostrarInformacion();
        moto.conducir();


        System.out.println("---------- Propietario 2 ----------");
        persona2.mostrarInformacion();
        auto.conducir();
    }
}
