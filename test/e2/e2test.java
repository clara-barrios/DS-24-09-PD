package e2;

import e2.equipo.trabajador.Trabajador;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import e2.equipo.Equipo;

public class e2test {
    @Test
    public void equipo(){
        Trabajador yago = new Trabajador("Yago",6,9);
        Trabajador clara = new Trabajador("Clara", 7.2, 6.8);
        Equipo ejercicio = new Equipo("Practica");
        Proyecto ds= new Proyecto("DS");
        ejercicio.anhadir(yago);
        ejercicio.anhadir(clara);
        ds.anhadir(ejercicio);
        assertEquals("Yago", yago.getName());
        assertEquals("Clara",clara.getName());
        assertEquals(9,yago.getPrice());
        assertEquals(6,yago.getHours());
        assertEquals(6.8,clara.getPrice());
        assertEquals(7.2,clara.getHours());
        assertEquals(13.2,ejercicio.getTotalHours());
        assertEquals(15.8,ejercicio.getTotalPrice());
        assertEquals("Practica", ejercicio.getName());
        assertEquals("DS",ds.getName());



    }

}
