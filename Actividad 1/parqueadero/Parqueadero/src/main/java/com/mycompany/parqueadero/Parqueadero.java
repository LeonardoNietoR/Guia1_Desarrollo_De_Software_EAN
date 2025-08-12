package com.mycompany.parqueadero;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Vehiculo> vehiculos;

    public Parqueadero() {
        vehiculos = new ArrayList<>();
    }

    public void registrarEntrada(Vehiculo v) {
        vehiculos.add(v);
        System.out.println(v + " ingresó.");
    }

    public void registrarSalida(String placa) {
        Vehiculo encontrado = null;
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                encontrado = v;
                break;
            }
        }

        if (encontrado != null) {
            double costo = calcularCosto(encontrado);
            vehiculos.remove(encontrado);
            System.out.println(encontrado + " salió. Costo: $" + costo);
        } else {
            System.out.println("Vehículo con placa " + placa + " no encontrado.");
        }
    }

    private double calcularCosto(Vehiculo v) {
        long horas = Duration.between(v.getHoraEntrada(), LocalDateTime.now()).toHours();
        if (horas == 0) horas = 1;

        if (v instanceof Automovil) {
            return horas * 2000;
        } else if (v instanceof Motocicleta) {
            return horas * 1000;
        } else if (v instanceof Camion) {
            return horas * 5000;
        }
        return horas * 1500;
    }

    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos en el parqueadero.");
        } else {
            for (Vehiculo v : vehiculos) {
                System.out.println(v);
            }
        }
    }
}
