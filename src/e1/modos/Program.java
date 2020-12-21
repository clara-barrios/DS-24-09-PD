package e1.modos;

public class Program {
   public float tconsigna;

    public Program( float tconsigna){
        this.tconsigna=tconsigna;
       System.out.println("Se activa el modo Program a "+ getTconsigna()+ " grados.");
    }

    public float getTconsigna(){return tconsigna;}


}
