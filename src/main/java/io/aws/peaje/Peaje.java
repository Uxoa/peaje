package io.aws.peaje;

import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private String nombre;
    private String ciudad;
    private List<Vehiculo> vehiculos;
    private int totalRecaudado;
    
    public Peaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.vehiculos = new ArrayList<>();
        this.totalRecaudado = 0;
    }
    
    public void registrarVehiculo(Vehiculo vehiculo) {
        int costoPeaje = vehiculo.calcularPeaje();
        vehiculos.add(vehiculo);
        totalRecaudado += costoPeaje;
        
        // Log de depuración
        System.out.println("Vehículo registrado: " + vehiculo.getPlaca() +
              ", Tipo: " + vehiculo.getClass().getSimpleName() +
              ", Peaje: $" + costoPeaje +
              ", Total acumulado: $" + totalRecaudado);
    }
    
    public int getTotalRecaudado() {
        return totalRecaudado;
    }
}
