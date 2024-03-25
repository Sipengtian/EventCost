package org.example;
import java.time.LocalDate;
public class pastEvents extends Event {


    private LocalDate eventStartDate;


    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    public static final double eventCost = 10_000;

    public pastEvents(String eventID, String eventName, String eventLocation, String eventPointOfContact, double  eventCost, int totalParticipants, int totalEventDays){
        super(eventID,eventName,eventLocation,eventPointOfContact,eventCost,totalParticipants,totalEventDays);

    }
    public LocalDate getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(LocalDate eventStartDate) {
        this.eventStartDate = eventStartDate;
    }
    public LocalDate getEventEndDate() {
        return eventEndDate;
    }

    public boolean isRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }
    public void calculateEventCost(){
        System.out.println("No use");
    }
    public void calculateCost(){
        double cost = 1000 + (1000 * tax);
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentStatus, boolean requiresExtension) {
        paymentDetails= "The event cost was " + eventCost + " and the payment status is " + paymentStatus + ". The Customer requires extension?: " + requiresExtension + ".";
    }
    public String toString() {
        return "Event Name: " + getEventName() + "\n" +
                "Event Start Date: " + eventStartDate + "\n" +
                "Event End Date: " + eventEndDate + "\n" +
                "Payment Status: " + paymentStatus + "\n" +
                "Requires Extension: " + requiresExtension + "\n" +
                "Payment Details: " + getPaymentDetails();
    }

}
