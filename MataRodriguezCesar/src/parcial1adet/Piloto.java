
package parcial1adet;
import java.util.ArrayList;
import java.util.Objects;


public class Piloto {
    
    private String dni;
    private String nombre;
    private String modeloVehiculo;
    private ArrayList <Tiempo> tiempos;

    public Piloto(String dni, String nombre, String modeloVehiculo) {
        this.dni = dni;
        this.nombre = nombre;
        this.modeloVehiculo = modeloVehiculo;
        this.tiempos= new ArrayList ();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public ArrayList<Tiempo> getTiempos() {
        return tiempos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Piloto other = (Piloto) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    public int addTiempo (Tiempo tiempoNuevo){
        tiempos.add(tiempoNuevo);
        return 0;
    }
    
    public int getNumeroVueltas (){
        int contador = 0;
        
        for (Tiempo tiempo : tiempos) {
            contador++;  
        }
       
        return contador;
    }
    
    
}
