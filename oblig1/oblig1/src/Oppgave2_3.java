public class Oppgave2_3 {
    public static void main(String[] args) {
        // Oppretter Planet-objekter
        Planet mars = new Planet("Mars", 3389.5, 6.39E23);
        Planet jupiter = new Planet("Jupiter", 69911, 1.898E27);
        Planet earth = new Planet("Earth", 6371, 5.97E24);

        // Skriver ut informasjon om planetene
        skrivUtInformasjon(mars);
        skrivUtInformasjon(jupiter);    
        skrivUtInformasjon(earth);  
    }

    // Metode for å skrive ut informasjon om en planet
    public static void skrivUtInformasjon(Planet planet) {
        System.out.println("Planeten " + planet.getNavn() + " har en radius på " + planet.getRadius() + " km og en masse på " + planet.getMasse() + " kg");
    }
}