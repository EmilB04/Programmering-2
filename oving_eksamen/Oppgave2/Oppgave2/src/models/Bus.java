package models;

import interfaces.TicketValidation;

public class Bus extends CollectiveTransportUnit implements TicketValidation {
    private String modelName;
    private Route route;
    private TicketAuthenticator ticketAuthenticator;

    public Bus(String id, String modelName, int maxCapacity, Route route, TicketAuthenticator ticketAuthenticator){
        super(id, maxCapacity);
        this.route = route;
        this.ticketAuthenticator = ticketAuthenticator;
    }
    public Bus(String id, String modelName, int maxCapacity) {
        super(id, maxCapacity);
        this.route = null;
        this.ticketAuthenticator = null;
    }

    @Override
    public boolean checkTicketValidity(Ticket ticket){
        return false;
    }

    @Override
    public String toString() {
        return ("Bus model: " + modelName + ", Number of seats: " + getMaxCapacity());
    }
}
