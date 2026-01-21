
package parcial1adet;


public class Tiempo {
    
    private int minutos;
    private int segundos;
    private int milisegundos;
    private Piloto piloto;

    public Tiempo(int minutos, int segundos, int milisegundos) {
        this.minutos = minutos;
        this.segundos = segundos;
        this.milisegundos = milisegundos;
        this.piloto = piloto;
    }

    

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getMilisegundos() {
        return milisegundos;
    }

    

    @Override
    public String toString() {
        return "Tiempo{" + piloto + ">" + minutos + ":" + segundos + "." + milisegundos + '}';
    }

    Object getPiloto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
