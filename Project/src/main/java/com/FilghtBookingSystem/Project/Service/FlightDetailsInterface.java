package com.FilghtBookingSystem.Project.Service;

import com.FilghtBookingSystem.Project.Model.BookTicket;
import com.FilghtBookingSystem.Project.Model.FlightDetails;

import java.awt.print.Book;
import java.util.List;

public interface FlightDetailsInterface {

    FlightDetails CreateFlightDetails(FlightDetails flightDetails);

    List<FlightDetails> GetFlightDetails();
    void DeleteFlightDetails(long id);
    public List<FlightDetails> BookingTicket(String date,String time);

    public BookTicket TicketBooking(String date, String time);

}
