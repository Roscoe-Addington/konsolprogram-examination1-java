public abstract class Behandling{
    private static final int MAX_VECKOR = 12;
    private static int antalBehandlingar = 0;

    private final String patientkod;
    private int veckor;

    public Behandling(String patientkod, int veckor){
        this.patientkod = patientkod;
        this.veckor = veckor;
        antalBehandlingar++;
    }
    public String getPatientkod(){
        return patientkod;
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

}
