public class Main {
    public static void main(String[] args) {
        Terapi terapi = new Terapi ("P1", 12, "KBT");
        System.out.println(terapi.getPatientkod() + " " + terapi.aterfallsrisk());
        System.out.println("Antal behandlingar: " + Behandling.getAntalBehandlingar());
    }
}
