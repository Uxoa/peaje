package io.aws.peaje;

public class Moto extends Vehiculo {
    public Moto(String placa) {
        super(placa);
    }
    
    @Override
    public int calcularPeaje() {
        return 50;
    }
}
