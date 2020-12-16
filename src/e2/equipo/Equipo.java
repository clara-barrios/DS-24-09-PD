package e2.equipo;

import e2.equipo.trabajador.Trabajador;

import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.ArrayList;

public class Equipo extends EquipoComponent {
    private final ArrayList<Trabajador> Persona=new ArrayList<>();
    private final String name;
    private double totalHours;
    private double totalPrice;

    public Equipo(String name){
        this.name=name;
    }
    public String getName(){return name;}

    public double getTotalHours(){
    for(Trabajador ec: Persona)
    totalHours += ec.getHours() ;
    return totalHours;}


    public double getTotalPrice() {
        for(Trabajador ec: Persona)
            totalPrice += ec.getPrice();
        return totalPrice;}

    public void anhadir(Trabajador persona){
       if (!Persona.contains(persona))
        Persona.add(persona);
    }

   /*public void eliminar(Trabajador persona){
        Persona.remove(persona);
    }
*/

    public void print() {
        System.out.println("\nTeam " + getName() +": "+getTotalHours() + " hours, "+ getTotalPrice()+" €");
        for (Trabajador ec : Persona )
            ec.print();
    }
}
