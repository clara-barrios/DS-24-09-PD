package e2;

import e1.modos.Program;
import e2.equipo.EquipoComponent;
import e2.equipo.*;
import e2.equipo.Equipo;
import e2.equipo.Trabajador;
import java.util.ArrayList;

public class Proyecto extends EquipoComponent {
    private final ArrayList<EquipoComponent> Proyecto=new ArrayList<>();
    private final String name;

     public Proyecto (String name){
         this.name= name;

     }
     public String getName(){return name;}

    public void anhadir(EquipoComponent equipoComponent){
        Proyecto.add(equipoComponent);
    }
    public void eliminar(EquipoComponent equipoComponent){
         Proyecto.remove(equipoComponent);
    }
public void print(){
    System.out.println("\n "+ getName());
    for (EquipoComponent ec : Proyecto)
        ec.print();
}


}

