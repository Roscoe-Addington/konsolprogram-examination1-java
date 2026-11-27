public class Lakemedelsbehandling extends Behandling {
    private final String lakemedel;


    public Lakemedelsbehandling(String patientkod, int veckor, String lakemedel) {
        super(patientkod, veckor);
        this.lakemedel = lakemedel;
    }
    @Override
    public String aterfallsrisk() {
        return "får " + lakemedel + ", som ger snabb effekt men har hög återfallsrisk när behandlingen avslutas";

    }
}
