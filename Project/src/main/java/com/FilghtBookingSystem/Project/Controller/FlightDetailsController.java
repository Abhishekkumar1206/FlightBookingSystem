package com.FilghtBookingSystem.Project.Controller;

import com.FilghtBookingSystem.Project.Model.BookTicket;
import com.FilghtBookingSystem.Project.Model.FlightDetails;
import com.FilghtBookingSystem.Project.Repository.FlightDetailsRepository;
import com.FilghtBookingSystem.Project.Service.FlightDetailsImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightDetailsController {

    @Autowired
    FlightDetailsImplementation flightDetailsImplementation;

    @PostMapping("/postdetails")
    public FlightDetails CreateDetails(@RequestBody  FlightDetails flightDetails){
        return flightDetailsImplementation.CreateFlightDetails(flightDetails);
    }
    @GetMapping("/getdetails")
    public List<FlightDetails>GetDetails(){
        return flightDetailsImplementation.GetFlightDetails();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable(value="id") long id){
      flightDetailsImplementation.DeleteFlightDetails(id);
    }

    @GetMapping("/booktickets/{date}/{time}")
    public List<FlightDetails> BookTicket(@PathVariable String date, @PathVariable String time){

        return flightDetailsImplementation.BookingTicket(date,time);
    }
    @GetMapping("ticketbook/{date}/{time}")
    public BookTicket TicketBooked(@PathVariable String date, @PathVariable String time){

       return flightDetailsImplementation.TicketBooking(date,time);

    }

}
