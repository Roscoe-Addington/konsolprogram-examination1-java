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
}
