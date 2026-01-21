
package parcial1adet;

import java.util.ArrayList;


public class GestorVueltas implements InterfazParcial {
    
    private ArrayList <Piloto> pilotos;
    private ArrayList <Tiempo> tiempos;

    public GestorVueltas() {
        this.pilotos = new ArrayList ();
        this.tiempos = new ArrayList ();
    }
    
    @Override
    public int addPiloto(String dni, String nombre, String modeloVehiculo) {
        Piloto nuevoPiloto = new Piloto (dni,nombre,modeloVehiculo);
        
        for (Piloto piloto : pilotos) {
            if(piloto.getDni().equalsIgnoreCase(dni)){
                return -1;
            }   
        }
        pilotos.add(nuevoPiloto);
        return 0;
    }

    @Override
    public int getNumeroPilotos() {
        return pilotos.size();
    }

    @Override
    public int eliminarPiloto(String dni) {
        Piloto pilotoNuevo;
        for (Piloto piloto : pilotos) {
            if(piloto.getDni().equalsIgnoreCase(dni)){
                pilotos.remove(piloto);
                return 0;
            }
            
        }
        return -2;
    }

    @Override
    public int addTiempoVuelta(String dniPiloto, int minutos, int segundos, int milisegundos) {
        Tiempo nuevoTiempo = new Tiempo (minutos,segundos,milisegundos);
        
        for (Piloto piloto : pilotos) {
            if(piloto.getDni() == dniPiloto){
                tiempos.add(nuevoTiempo);
                piloto.addTiempo(nuevoTiempo);
                return 0; 
            }  
        }
        return -2;
    }
    

    @Override
    public int getNumeroVueltas() {
        return tiempos.size();
        
    }

   

    @Override
    public void mostrarTiempos() {
          for (Tiempo tiempo : tiempos) {
              System.out.println(tiempo);
            
        }
    
    }

    @Override
    public void mostrarTiemposPorPiloto() {
        for (Tiempo tiempo : tiempos) {
              System.out.println(tiempo);  
        }
    } 

    @Override
    public int getNumeroVueltas(String dniPiloto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
