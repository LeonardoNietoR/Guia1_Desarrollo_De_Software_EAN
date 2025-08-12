package com.mycompany.parqueadero;

public class MainParqueadero {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();

        Vehiculo auto = new Automovil("ABC123", "Toyota", "Corolla", "Gasolina");
        Vehiculo moto = new Motocicleta("XYZ789", "Yamaha", "MT-07", 700);
        Vehiculo camion = new Camion("JKL456", "Volvo", "FH", 20.5);

        parqueadero.registrarEntrada(auto);
        parqueadero.registrarEntrada(moto);
        parqueadero.registrarEntrada(camion);

        System.out.println("\nVehículos en el parqueadero:");
        parqueadero.mostrarVehiculos();

        System.out.println("\nSalida de vehículos:");
        parqueadero.registrarSalida("ABC123");
        parqueadero.registrarSalida("XYZ789");
    }
}
