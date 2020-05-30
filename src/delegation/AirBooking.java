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
public class AirBooking implements TravelBooking{

     @Override
    public void bookTicket() {
        System.out.println("Flight ticket booked");
    }
    
}
