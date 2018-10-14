/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;
import java.util.Scanner;

/**
 *
 * @author Gloria
 */
public class Parcial1 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LigaFutbol bbva = new LigaFutbol("BBVA");
        Equipo barcelona = new Equipo("Barcelona FC", "Juan Perez");
        Equipo real = new Equipo("Real Madrid", "Raul Ramos");
        bbva.getEquipos()[0] = barcelona;
        bbva.getEquipos()[1] = real;
        
        barcelona.asignarJugadores();
        real.asignarJugadores();
        
        bbva.imprimirGerentes();
    }
    
}
