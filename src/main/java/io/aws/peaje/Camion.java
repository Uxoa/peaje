package io.aws.peaje;

// Clase Camion
public class Camion extends Vehiculo {
    private final int ejes;
    
    public Camion(String placa, int ejes) {
        super(placa);
        this.ejes = ejes;
    }
    
    @Override
    public int calcularPeaje() {
        // $50 por cada eje
        return 50 * ejes;
    }
    
    public int getEjes() {
        return ejes;
    }
}

