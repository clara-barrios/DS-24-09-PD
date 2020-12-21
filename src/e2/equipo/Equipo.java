package e2.equipo;


import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.ArrayList;

public class Equipo extends EquipoComponent {
    private final ArrayList<EquipoComponent> Persona=new ArrayList<>();
    private final String name;
    private double totalHours;
    private double totalPrice;

    public Equipo(String name){
        this.name=name;
    }
    public String getName(){return name;}

    public double getTotalHours(){
    for(EquipoComponent ec: Persona)
    totalHours += ec.getHours();
    return totalHours;}


    public double getTotalPrice() {
        for(EquipoComponent ec: Persona)
            totalPrice += ec.getPrice();
        return totalPrice;}

    public void anhadir(EquipoComponent persona){
       if (!Persona.contains(persona))
        Persona.add(persona);
    }

   /*public void eliminar(Trabajador persona){
        Persona.remove(persona);
    }
*/

    public void print() {
        System.out.println("\nTeam " + getName() +": "+getTotalHours() + " hours, "+ getTotalPrice()+" €");
        for (EquipoComponent ec : Persona )
            ec.print();
    }
}
