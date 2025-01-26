package io.aws.peaje;

import io.aws.peaje.Camion;
import io.aws.peaje.Coche;
import io.aws.peaje.Moto;
import io.aws.peaje.Peaje;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeajeTest {
    
    @Test
    public void testRegistroVehiculos() {
        Peaje peaje = new Peaje("Puente", "Ciudad X");
        Coche coche = new Coche("ABC123"); // $100
        Moto moto = new Moto("XYZ789");   // $50
        Camion camion = new Camion("CAM456", 3); // 3 ejes -> $50 * 3 = $150
        
        peaje.registrarVehiculo(coche);  // Total acumulado: $100
        peaje.registrarVehiculo(moto);   // Total acumulado: $150
        peaje.registrarVehiculo(camion); // Total acumulado: $300
        
        assertEquals(300, peaje.getTotalRecaudado());
    }
    
    
    @Test
    public void testCochePeaje() {
        Coche coche = new Coche("ABC123");
        assertEquals(100, coche.calcularPeaje());
    }
    
    @Test
    public void testMotoPeaje() {
        Moto moto = new Moto("XYZ789");
        assertEquals(50, moto.calcularPeaje());
    }
    
    @Test
    public void testCamionPeaje() {
        Camion camion = new Camion("CAM456", 3);
        assertEquals(150, camion.calcularPeaje());
    }
    
   
}
