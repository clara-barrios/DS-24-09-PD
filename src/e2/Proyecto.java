package e2;

import e1.modos.Program;
import e2.equipo.EquipoComponent;
import e2.equipo.*;
import e2.equipo.Equipo;


import java.util.ArrayList;

public class Proyecto extends EquipoComponent {


    private final ArrayList<EquipoComponent> Grupo=new ArrayList<>();
    private final String name;

     public Proyecto (String name){
         this.name= name;
     }
     public String getName(){return name;}

    public void anhadir(EquipoComponent equipo){

        //for (Equipo ec : Grupo )
       // if(!(ec==equipo)) //no meter dos veces el mismo trabajador
        Grupo.add(equipo);
    }
   /* public void eliminar(Equipo equipo){
         Grupo.remove(equipo);
    }*/
public void print(){
    System.out.println("\n "+ getName());
    for (EquipoComponent ec : Grupo)
        ec.print();
}

}


