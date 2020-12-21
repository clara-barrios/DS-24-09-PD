package e2;

import e2.equipo.Equipo;
import e2.equipo.trabajador.Trabajador;

public class Main {
    public static void main(String[] args) {
        Trabajador yago = new Trabajador("Carol",6,9);
        Trabajador clara = new Trabajador("Clara", 7.2, 6.8);
        Equipo ejercicio = new Equipo("Practica");
        Proyecto ds1= new Proyecto("DS");
        ejercicio.anhadir(yago);
        ejercicio.anhadir(clara);
       ds1.anhadir(ejercicio);
        ds1.print();
    }
}
