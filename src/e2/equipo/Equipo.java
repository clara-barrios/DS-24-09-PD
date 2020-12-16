package e2.equipo;

import java.awt.*;
import java.util.ArrayList;

public class Equipo extends EquipoComponent {
    private final ArrayList<EquipoComponent> Grupo=new ArrayList<>();
    private final String name;
    private double totalHours;
    private double totalPrice;

    public Equipo(String name, double totalHours, double totalPrice){
        this.name=name;
        this.totalHours= totalHours;
        this.totalPrice = totalPrice;
    }
    public String getName(){return name;}
    public double getTotalHours(){
    for(EquipoComponent ec: Grupo)
    totalHours += ec.getHours() ;
    return totalHours;}


    public double getTotalPrice() {
        for(EquipoComponent ec: Grupo)
            totalPrice += ec.getTotalPrice();
        return totalPrice;}

    public void anhadir(EquipoComponent equipoComponent){
        Grupo.add(equipoComponent);
    }

    public void eliminar(EquipoComponent equipoComponent){
        Grupo.remove(equipoComponent);
    }


    public void print() {
        System.out.println("\nTeam " + getName() +":");
        System.out.println(" "+getTotalHours() + " hours,");
        System.out.println(" "+ getTotalPrice()+" €");

        for (EquipoComponent ec : Grupo)
            ec.print();
    }
}
