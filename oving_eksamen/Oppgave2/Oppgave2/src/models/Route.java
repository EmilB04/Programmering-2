package models;

import java.util.ArrayList;

public class Route {
    private ArrayList<BusStop> stops = new ArrayList<>();

    public double calculateRouteLength(){
        int numbersOfBusStops = stops.size();

        double totalDistance = 0;
        for (int x = 0; x < numbersOfBusStops - 1; x++) {
            BusStop currentBusStop = stops.get(x);
            BusStop nextBusStop = stops.get(x+1);
            totalDistance += distanceBetweenBusStops(currentBusStop, nextBusStop);
        }
        return totalDistance;
    }
}
