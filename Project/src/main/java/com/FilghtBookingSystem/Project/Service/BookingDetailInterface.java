package com.FilghtBookingSystem.Project.Service;

import com.FilghtBookingSystem.Project.Model.BookTicket;
import com.FilghtBookingSystem.Project.Model.FlightDetails;

import java.util.List;

public interface BookingDetailInterface {


    BookTicket SaveBookedTicket(FlightDetailsImplementation flightDetailsImplementation);
    public List<BookTicket>PrintTicket();

}
