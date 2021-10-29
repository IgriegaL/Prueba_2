/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pgy2121.juegosolimpicos.juegosolimpicos;

/**
 *
 * @author pc
 */
public class Futbolista extends Atleta{
    
    
    private int cantGoles;

    public Futbolista(int cantGoles, String nombre, String pais, Boolean medalla, String tipoMedalla, boolean recordOlimpico, int recordOlimpicoDetalle) {
        super(nombre, pais, medalla, tipoMedalla, recordOlimpico, recordOlimpicoDetalle);
        this.cantGoles = cantGoles;
    }

    public Futbolista() {
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    
    
}
