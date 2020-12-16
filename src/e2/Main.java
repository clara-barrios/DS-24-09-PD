package e2;

import e2.equipo.Equipo;
import e2.equipo.Trabajador;

public class Main {
    public static void main(String[] args) {
        Proyecto Ds = new Proyecto("DS");
        Equipo ds1 = new Equipo("ds1");
        Trabajador t1 = new Trabajador("Juan",7.0,6.0);
        Trabajador t2 = new Trabajador("Carol", 5.8,99.9);
        ds1.anhadir(t1);
        ds1.anhadir(t2);
        Ds.anhadir(ds1);
        Ds.print();


    }
}
