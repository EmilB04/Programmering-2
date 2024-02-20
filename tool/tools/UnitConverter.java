package tools;

public class UnitConverter {
    private static final int CM_METER_FACTOR = 100;
    private static final int METER_KM_FACTOR = 1000;


    public static double cmToMeter (double cm){
        return cm / CM_METER_FACTOR;
    }
    public static double meterToCM (double meter){
        return meter * CM_METER_FACTOR;
    }
    public static double meterToKm (double meter){
        return meter / METER_KM_FACTOR;
    }
    public static double kmToMeter (double km){
        return km * METER_KM_FACTOR;
    }
}