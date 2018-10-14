/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.ArrayList;import static parcial1.Parcial1.scanner;
;

/**
 *
 * @author Gloria
 */
public class Equipo {
    private Jugador[] jugadores;
    private String nombre;
    private String gerente;
    
    public Equipo(String nombre, String gerente) {
        this.nombre = nombre;
        this.jugadores = new Jugador[11];
        this.gerente = gerente;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    public void asignarJugadores() {
        System.out.println("Asignando jugadores para " + this.nombre);
        for(int i = 0; i < jugadores.length; i++) {
            String nombreTemp;
            String posTemp;
            System.out.print("Ingrese el nombre del jugador: ");
            nombreTemp = scanner.nextLine();
            System.out.print("Ingrese la posicion del jugador: ");
            posTemp = scanner.nextLine();
            jugadores[i] = new Jugador(nombreTemp, posTemp);
        }
    }
    
}
