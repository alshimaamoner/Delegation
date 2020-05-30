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
public class Delegation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    TicketBookingDelegate agent = new TicketBookingDelegate(new TrainBooking());
         agent.bookTicket();

         agent = new TicketBookingDelegate(new AirBooking());
         agent.bookTicket();
    }
    
}
