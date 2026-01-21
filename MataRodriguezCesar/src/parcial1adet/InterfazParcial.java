
package parcial1adet;


public interface InterfazParcial {
    
    //Nombre de la clase que implementa la interfaz: GestorVueltas
    public int addPiloto(String dni, String nombre, String modeloVehiculo);
    public int getNumeroPilotos();
    public int eliminarPiloto(String dni);
    
    public int addTiempoVuelta(String dniPiloto, int minutos, int segundos, int milisegundos);
    public int getNumeroVueltas();
    public int getNumeroVueltas(String dniPiloto);
    
    public void mostrarTiempos(); 
    public void mostrarTiemposPorPiloto();  
    
}
