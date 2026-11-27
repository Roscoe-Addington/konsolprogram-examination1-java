public class Main {
    public static void main(String[] args) {
        System.out.println("Behandlingar");
        Terapi terapi = new Terapi ("P1", 8, "KBT");
        Lakemedelsbehandling lakemedel = new Lakemedelsbehandling("P2", 8, "SSRI");
        presentera(terapi);
        presentera(lakemedel);

        terapi.setVeckor(0);
        System.out.println(terapi.getPatientkod() + " har fortvarande " + terapi.getVeckor() + " veckors behandlingstid");

        for (int vecka = 1; vecka <= 3; vecka++) {
            System.out.println("Vecka " + vecka + ": terapisession med " + terapi.getPatientkod());
        }

        System.out.println("Antal behandlingar: " + Behandling.getAntalBehandlingar());
    }
    public static void presentera(Behandling behandling) {
        System.out.println(behandling.getPatientkod() + "" + behandling.aterfallsrisk()
        + " (behandlingstid: " + behandling.getVeckor() + " veckor)");

    }
}