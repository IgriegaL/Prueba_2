/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pgy2121.juegosolimpicos.juegosolimpicos;

public class Atleta {
    
    private String nombre;
    private String pais;
    private Boolean medalla;
    private String tipoMedalla;
    private boolean recordOlimpico;
    private int recordOlimpicoDetalle;

    public Atleta() {
    }

    public Atleta(String nombre, String pais, Boolean medalla, String tipoMedalla, boolean recordOlimpico, int recordOlimpicoDetalle) {
        this.nombre = nombre;
        this.pais = pais;
        this.medalla = medalla;
        this.tipoMedalla = tipoMedalla;
        this.recordOlimpico = recordOlimpico;
        this.recordOlimpicoDetalle = recordOlimpicoDetalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Boolean getMedalla() {
        return medalla;
    }

    public void setMedalla(Boolean medalla) {
        this.medalla = medalla;
    }

    public String getTipoMedalla() {
        return tipoMedalla;
    }

    public void setTipoMedalla(String tipoMedalla) {
        this.tipoMedalla = tipoMedalla;
    }

    public boolean isRecordOlimpico() {
        return recordOlimpico;
    }

    public void setRecordOlimpico(boolean recordOlimpico) {
        this.recordOlimpico = recordOlimpico;
    }

    public int getRecordOlimpicoDetalle() {
        return recordOlimpicoDetalle;
    }

    public void setRecordOlimpicoDetalle(int recordOlimpicoDetalle) {
        this.recordOlimpicoDetalle = recordOlimpicoDetalle;
    }
    
    public void Medallas(String pais , boolean medalla,String tipoMedalla) {
        System.out.println(this.tipoMedalla);
    }
    
}
