public class Terapi extends Behandling {
    private final String terapiform;

    public Terapi(String patientkod, int veckor, String terapiform){
        super(patientkod, veckor);
        this.terapiform = terapiform;
        }
        @Override
        public String aterfallsrisk(){
        return "får " + terapiform + " och har låg återfallsrisk, eftersom terapin lär ut strategier för att hantera besvären";
        }
    }

