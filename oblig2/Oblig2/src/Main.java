public class Main {
    public static void main(String[] args) {
        Planet mercury = new Planet("Mercury", 2439, 3.285e23);
        Planet venus = new Planet("Venus", 6051, 4.867e24);
        Planet earth = new Planet("Earth", 6371, 5.972e24);
        Planet mars = new Planet("Mars", 3389, 6.39e23);
        Planet jupiter = new Planet("Jupiter", 69911, 1.898e27);
        Planet saturn = new Planet("Saturn", 58232, 5.683e26);
        Planet uranus = new Planet("Uranus", 25362, 8.681e25);
        Planet neptune = new Planet("Neptune", 24622, 1.024e26);

        Star sun = new Star("Sun", 695700, 1.989e30, 5778);
    }
}
