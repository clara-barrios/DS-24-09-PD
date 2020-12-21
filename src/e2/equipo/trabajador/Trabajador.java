package e2.equipo.trabajador;

import e2.equipo.EquipoComponent;

public class Trabajador extends EquipoComponent {
    private final String name;
    private final double hours;
    private final double price;


    public Trabajador(String name, double hours, double price){
        this.name = name;
        this.hours = hours;
        this.price = price;
    }

    public String getName(){return name;}
    public double getHours(){return hours;}
    public double getPrice(){return price;}

    public void print(){
        System.out.println("Worker " + getName()+": "+ getHours()+" hours, "+getPrice() + " €");
    }
}
