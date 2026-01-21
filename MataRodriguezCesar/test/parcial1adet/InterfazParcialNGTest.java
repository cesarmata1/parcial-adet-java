/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package parcial1adet;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author administrador
 */
public class InterfazParcialNGTest {
    
    public InterfazParcialNGTest() {
    }

    

    /**
     * Test of addPiloto method, of class InterfazParcial.
     */
    @Test
    public void testAddPiloto() {
        System.out.println("addPiloto");

        InterfazParcial instance = new GestorVueltas();
        
        int result = instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        assertEquals(result, 0,"No se ha insertado correctamente el piloto");
    }

    @Test
    public void testAddPilotoRepetido() {
        System.out.println("addPilotoRepetido");

        InterfazParcial instance = new GestorVueltas();
        
        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        int result = instance.addPiloto("47265847G", "Max Verstappen", "Red Bull");
        
        assertEquals(result, -1,"No se contempla si hay pilotos con el mismo DNI");
    }
    
    /**
     * Test of getNumeroPilotos method, of class InterfazParcial.
     */
    @Test
    public void testGetNumeroPilotos() {
        System.out.println("getNumeroPilotos");
        InterfazParcial instance = new GestorVueltas();
        
        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        instance.addPiloto("46754891C", "Max Verstappen", "Red Bull");
        int result = instance.getNumeroPilotos();
        
        assertEquals(result, 2,"No se ha obtenido el numero de pilotos correcto. Revisa la funcion AddPiloto");
    }

    /**
     * Test of eliminarPiloto method, of class InterfazParcial.
     */
    @Test
    public void testEliminarPiloto() {
        System.out.println("eliminarPiloto");

        InterfazParcial instance = new GestorVueltas();
        
        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        instance.addPiloto("46754891C", "Max Verstappen", "Red Bull");
        int result = instance.eliminarPiloto("46754891C");
        assertEquals(result, 0, "No se ha eliminado correctamente el piloto");
        
        result = instance.getNumeroPilotos();
        assertEquals(result, 1, "No se ha descontado el numero de pilotos.");
    }
    
     /**
     * Test of eliminarPiloto method, of class InterfazParcial.
     */
    @Test
    public void testEliminarPilotoInexistente() {
        System.out.println("eliminarPilotoInexistente");

        InterfazParcial instance = new GestorVueltas();

        
        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        instance.addPiloto("46754891C", "Max Verstappen", "Red Bull");
        int result = instance.eliminarPiloto("126745817A");
        assertEquals(result, -2, "Se ha eliminado un piloto que no existe");
        
        result = instance.getNumeroPilotos();
        assertEquals(result, 2, "Se ha descontado el numero de pilotos cuando se ha eliminado un piloto que no existe");
    }

    /**
     * Test of addTiempoVuelta method, of class InterfazParcial.
     */
    @Test
    public void testAddTiempoVuelta() {
        System.out.println("addTiempoVuelta");

        InterfazParcial instance = new GestorVueltas();

        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        
        int result = instance.addTiempoVuelta("47265847G", 1, 45, 345);
        assertEquals(result, 0, "No se ha añadido el tiempo correctamente");
    }
    
    
    @Test
    public void testAddTiempoVueltaInexistente() {
        System.out.println("addTiempoVueltaInexistente");

        InterfazParcial instance = new GestorVueltas();

        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        
        int result = instance.addTiempoVuelta("46296745H", 1, 45, 345);
        assertEquals(result, -2, "Has añadido un tiempo a un piloto que no existe");
    }

    /**
     * Test of getNumeroVueltas method, of class InterfazParcial.
     */
    @Test
    public void testGetNumeroVueltas() {
        System.out.println("getNumeroVueltas");

        InterfazParcial instance = new GestorVueltas();
          
        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        instance.addPiloto("46754891C", "Max Verstappen", "Red Bull");
        instance.addTiempoVuelta("47265847G", 1, 45, 345);
        instance.addTiempoVuelta("47265847G", 1, 42, 128);
        instance.addTiempoVuelta("47265847G", 1, 41, 945);
        instance.addTiempoVuelta("46754891C", 1, 40, 564);
        instance.addTiempoVuelta("46754891C", 1, 41, 006);
        instance.addTiempoVuelta("46296745H", 1, 45, 345);
        
        int result = instance.getNumeroVueltas("47265847G");
        assertEquals(result, 3,"El numero de vueltas del piloto no es el correcto. Revisa la función addTiempoVuelta");
        
        result = instance.getNumeroVueltas("46754891C");
        assertEquals(result, 2,"El numero de vueltas del piloto no es el correcto. Revisa la función addTiempoVuelta");

    }
    
    @Test
    public void testGetNumeroVueltasTotal() {
        System.out.println("getNumeroVueltasTotal");

        InterfazParcial instance = new GestorVueltas();
         
        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        instance.addPiloto("46754891C", "Max Verstappen", "Red Bull");
        instance.addTiempoVuelta("47265847G", 1, 45, 345);
        instance.addTiempoVuelta("47265847G", 1, 42, 128);
        instance.addTiempoVuelta("47265847G", 1, 41, 945);
        instance.addTiempoVuelta("46754891C", 1, 40, 564);
        instance.addTiempoVuelta("46754891C", 1, 41, 006);
        instance.addTiempoVuelta("46296745H", 1, 45, 345);
        
        int result = instance.getNumeroVueltas();
        assertEquals(result, 5, "El numero de vueltas totales no es correcto. Revisa la función addTiempoVuelta");
    }

    /**
     * Test of mostrarTiempos method, of class InterfazParcial.
     */
    @Test
    public void testMostrarTiempos() {
        System.out.println("mostrarTiempos");
        InterfazParcial instance = new GestorVueltas();
        
        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        instance.addPiloto("46754891C", "Max Verstappen", "Red Bull");
        instance.addTiempoVuelta("47265847G", 1, 45, 345);
        instance.addTiempoVuelta("47265847G", 1, 42, 128);
        instance.addTiempoVuelta("47265847G", 1, 41, 945);
        instance.addTiempoVuelta("46754891C", 1, 40, 564);
        instance.addTiempoVuelta("46754891C", 1, 41, 006);
        
        instance.mostrarTiempos();
    }
    
    @Test
    public void testMostrarTiemposPorPiloto() {
        System.out.println("mostrarTiemposPorPiloto");
        InterfazParcial instance = new GestorVueltas();
        
        instance.addPiloto("47265847G", "Fernando Alonso", "Alpine");
        instance.addPiloto("46754891C", "Max Verstappen", "Red Bull");
        instance.addTiempoVuelta("47265847G", 1, 45, 345);
        instance.addTiempoVuelta("47265847G", 1, 42, 128);
        instance.addTiempoVuelta("47265847G", 1, 41, 945);
        instance.addTiempoVuelta("46754891C", 1, 40, 564);
        instance.addTiempoVuelta("46754891C", 1, 41, 006);
        
        instance.mostrarTiemposPorPiloto();
    }

    
    
}
