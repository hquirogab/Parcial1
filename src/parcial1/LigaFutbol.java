/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author Gloria
 */
public class LigaFutbol {
    private String nombre;
    private Equipo[] equipos;

    public LigaFutbol(String nombre) {
        this.nombre = nombre;
        this.equipos = new Equipo[2];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }
    
    public void imprimirGerentes(){
        for(int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i].getNombre() + ": " + equipos[i].getGerente());
        }
    }   
}
