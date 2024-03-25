package org.example;

public class MusicConcertEvent extends Event implements CalculateEventCostInterface {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double  eventCost,
     int totalParticipants, int totalEventDays, boolean merchandiseRequired, double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    @Override
    public void calculateEventCost() {


        // Calculation of the event cost for the music concert event
    }

    @Override
    public String toString() {
        return "Event Name: " + getEventName() + "\n" +
                "Merchandise Required: " + merchandiseRequired + "\n" +
                "Merchandise Cost: " + merchandiseCost + "\n" +
                "Event Cost: " + getEventCost();
    }
}
