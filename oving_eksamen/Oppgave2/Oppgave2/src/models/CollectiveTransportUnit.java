package models;

public class CollectiveTransportUnit {
    private String id;
    private int maxCapacity;

    public CollectiveTransportUnit(String id, int maxCapacity){
        this.id = id;
        this.maxCapacity = maxCapacity;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
