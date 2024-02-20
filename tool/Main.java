import tools.UnitConverter;

public class Main {
    public static void main(String[] args) {
        double resultInMeter1 = UnitConverter.cmToMeter(500);
        System.out.println(resultInMeter1);

        double resultInCm1 = UnitConverter.meterToCM(42);
        System.out.println(resultInCm1);

        double resultInKm1 = UnitConverter.meterToKm(2500);
        System.out.println(resultInKm1);

        double resultInMeter2 = UnitConverter.kmToMeter(3);
        System.out.println(resultInMeter2);
    }
}
