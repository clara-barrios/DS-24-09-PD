package e1.modos;

public class Timer {
    private final int time;

    public Timer(int time){
        this.time=time;
        // System.out.println("Se activa el modo Timer" + getTime()+" minutos.");
    }
    public int getTime(){return time;}
}
