/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pgy2121.juegosolimpicos.juegosolimpicos;

/**
 *
 * @author pc
 */
public class SaltoAlto extends Atleta{
    
    private int alturaSalto;

    public SaltoAlto() {
    }

    public SaltoAlto(int alturaSalto, String nombre, String pais, Boolean medalla, String tipoMedalla, boolean recordOlimpico, int recordOlimpicoDetalle) {
        super(nombre, pais, medalla, tipoMedalla, recordOlimpico, recordOlimpicoDetalle);
        this.alturaSalto = alturaSalto;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }
    
    
    
}
