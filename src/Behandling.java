public abstract class Behandling{
    private static final int MAX_VECKOR = 12;
    private static int antalBehandlingar = 2;

    private final String patientkod;
    private int veckor;

    public Behandling(String patientkod, int veckor){
        this.patientkod = patientkod;
        if (veckor >= 1 && veckor <= MAX_VECKOR) {
            this.veckor = veckor;
        } else {
            this.veckor = 1;
            antalBehandlingar++;
            System.out.println("Ogiltig behandlingstid för " + patientkod + ". Sätts till 1 vecka.");

        }
    }
    public String getPatientkod(){
        return patientkod;
    }
    public int getVeckor(){
        return veckor;
    }
    public static int getAntalBehandlingar(){
        return antalBehandlingar;
    }
    public void setVeckor(int nyttAntal){
        if (nyttAntal >= 1 && nyttAntal <= MAX_VECKOR){
            veckor = nyttAntal;
        } else {
            System.out.println("Kan inte sätta behandlingstiden till " + nyttAntal + " veckor.");
        }
    }
public abstract String aterfallsrisk();
}
