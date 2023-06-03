package com.FilghtBookingSystem.Project.Controller;

import com.FilghtBookingSystem.Project.Model.BookTicket;
import com.FilghtBookingSystem.Project.Model.FlightDetails;
import com.FilghtBookingSystem.Project.Service.CreateBookingImplementation;
import com.FilghtBookingSystem.Project.Service.FlightDetailsImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingDetailsController {

    @Autowired
    CreateBookingImplementation createBookingImplementation;

    @GetMapping("/BookingTable")
    public List<BookTicket>PrintBookingTicket(){

        return createBookingImplementation.PrintTicket();
    }

}
