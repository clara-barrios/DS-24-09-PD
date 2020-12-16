package e2;

import e2.equipo.Equipo;
import e2.equipo.trabajador.Trabajador;

public class Main {
    public static void main(String[] args) {
        Trabajador yago = new Trabajador("Yago",6,9);
        Trabajador clara = new Trabajador("Clara", 7.2, 6.8);
        Equipo ejercicio = new Equipo("Practica");
        Equipo prueba = new Equipo("Sobra");
        Proyecto ds= new Proyecto("DS");
        ejercicio.anhadir(yago);
        ejercicio.anhadir(clara);
        prueba.anhadir(yago);
        ds.anhadir(ejercicio);
        ds.anhadir(prueba);
        ds.print();
    }
}
