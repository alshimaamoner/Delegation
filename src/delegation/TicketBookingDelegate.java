/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegation;

/**
 *
 * @author PC HOME
 */
public class TicketBookingDelegate implements TravelBooking{
    TravelBooking TravelBooking;

    public TicketBookingDelegate(TravelBooking TravelBooking) {
        this.TravelBooking = TravelBooking;
    }
    //dELEGATion Using Polymorphism
    @Override
    public void bookTicket() {
        TravelBooking.bookTicket();
    }
    
}
