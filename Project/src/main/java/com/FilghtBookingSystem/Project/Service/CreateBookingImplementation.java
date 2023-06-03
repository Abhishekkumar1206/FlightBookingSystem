package com.FilghtBookingSystem.Project.Service;

import com.FilghtBookingSystem.Project.Model.BookTicket;
import com.FilghtBookingSystem.Project.Model.FlightDetails;
import com.FilghtBookingSystem.Project.Repository.BookingDetailsRepository;
import com.FilghtBookingSystem.Project.Repository.FlightDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreateBookingImplementation implements  BookingDetailInterface{

    @Autowired
    BookingDetailsRepository bookingDetailsRepository;

    @Override
    public BookTicket SaveBookedTicket(FlightDetailsImplementation flightDetailsImplementation) {
        BookTicket b=new BookTicket();
        String date=b.getDate();
        String time=b.getTime();
        return bookingDetailsRepository.save(flightDetailsImplementation.TicketBooking(date,time));
    }

    @Override
    public List<BookTicket> PrintTicket() {
        return bookingDetailsRepository.findAll();
    }

}
