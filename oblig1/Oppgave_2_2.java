public class Oppgave_2_2 {
    public static void main(String[] args){
        int minVekt = 75;
        double minMåneVekt = 0; // Definerer en variabel for senere bruk

        double jordensGravitasjon = 9.81;
        double måneGravitasjon = 1.62;

        minMåneVekt = ((minVekt / jordensGravitasjon) * måneGravitasjon);
        System.out.println("---------------------------------------");
        System.out.printf("På månen ville min vekt vært %.2f kg" + "\n", minMåneVekt);
        System.out.println("---------------------------------------");
        // bruker printf for å begrense utskriften til to desimaler
    }
}
