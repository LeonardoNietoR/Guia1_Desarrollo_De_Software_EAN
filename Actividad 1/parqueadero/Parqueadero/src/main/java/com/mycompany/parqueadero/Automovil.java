package com.mycompany.parqueadero;

public class Automovil extends Vehiculo {
    private String tipoCombustible;

    public Automovil(String placa, String marca, String modelo, String tipoCombustible) {
        super(placa, marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
}
