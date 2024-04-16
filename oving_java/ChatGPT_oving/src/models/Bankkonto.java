package models;

public class Bankkonto {
    private final String kontoNummer;
    private final String kontoEier;
    private double saldo;

    public Bankkonto(String kontoNummer, String kontoEier, double saldo) {
        this.kontoNummer = kontoNummer;
        this.kontoEier = kontoEier;
        this.saldo = saldo;
    }

    public void settInn(double beløp) {
        if (beløp > 0) {
            this.saldo += beløp;
        } else {
            System.out.println("Du må skrive et positivt tall");
        }
    }

    public void taUt(double beløp) {
        if (beløp < 0) {
            System.out.println("Du må skrive et positivt tall");
        } else if (saldo <= 0) {
            System.out.println("Du har ikke penger på konto");
        } else if ((saldo - beløp) < 0) {
            System.out.println("Du kan ikke ta ut så mye penger");
        } else {
            this.saldo -= beløp; // riktig beløp
            System.out.println(beløp + " kroner er tatt ut av kontoen til " + kontoEier);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
