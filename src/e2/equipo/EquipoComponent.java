package e2.equipo;

import java.awt.*;

public abstract class EquipoComponent {
    public void anhadir(EquipoComponent equipoComponent) {
        throw new UnsupportedOperationException();
    }
    /*public void eliminar(EquipoComponent equipoComponent) {
        throw new UnsupportedOperationException();
    }*/
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public double getHours(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public double getTotalHours(){
        throw new UnsupportedOperationException();
    }
    public double getTotalPrice(){
        throw new UnsupportedOperationException();
    }

   /* public int getChild(int i){
        throw new UnsupportedOperationException();
    }*/
    public void print(){
        throw new UnsupportedOperationException();
    }
}
