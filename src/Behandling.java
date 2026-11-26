public abstract class Behandling{
    private static final int MAX_VECKOR = 12;
    private static int antalBehandlingar = 0;

    private final String P1;
    private int veckor;

    public Behandling(String P1, int veckor){
        this.P1 = P1;
        if (veckor >= 1 && veckor <= MAX_VECKOR) {
            this.veckor = veckor;
        } else {
            this.veckor = 1;
            System.out.println("Ogiltig behandlingstid för " + P1 + ". Sätts till 1 vecka.");
        }
    }
    public String getPatientkod(){
        return P1;
    }
    public int getVeckor(){
        return veckor;
    }
    public int getAntalBehandlingar(){
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
