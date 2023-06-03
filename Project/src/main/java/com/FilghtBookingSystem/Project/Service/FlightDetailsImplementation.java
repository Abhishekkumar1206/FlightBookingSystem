package com.FilghtBookingSystem.Project.Service;

import com.FilghtBookingSystem.Project.Model.BookTicket;
import com.FilghtBookingSystem.Project.Model.FlightDetails;
import com.FilghtBookingSystem.Project.Repository.BookingDetailsRepository;
import com.FilghtBookingSystem.Project.Repository.FlightDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import static com.FilghtBookingSystem.Project.Repository.BookingDetailsRepository.InsertObject;

@Service
public class FlightDetailsImplementation implements FlightDetailsInterface {


    @Autowired
    FlightDetailsRepository flightDetailsRepository;

//    @Autowired
//    BookingDetailsRepository bookingDetailsRepository;


    @Override
    public FlightDetails CreateFlightDetails(FlightDetails flightDetails) {
           return flightDetailsRepository.save(flightDetails);
    }

    @Override
    public List<FlightDetails> GetFlightDetails() {
        return (List<FlightDetails>)flightDetailsRepository.findAll();
    }

    @Override
    public void DeleteFlightDetails(long id) {
        flightDetailsRepository.deleteById(id);
    }
    @Override
    public List<FlightDetails> BookingTicket(String date,String time) {
        return flightDetailsRepository.findAllByDatesAndTime(date,time);
    }

    @Override
    public BookTicket TicketBooking(String date, String time) {
        List<FlightDetails> Flights = flightDetailsRepository.findAllByDatesAndTime(date, time);

        BookTicket b = new BookTicket();
        for (FlightDetails f : Flights) {
            System.out.println("sucess");
            String date1 = f.getDate();
            Long id=f.getId();
            String time1 = f.getTime();
            int seats = f.getNoofSeats();
            Boolean avaliable = f.getIsBooked();
            if (date1.equals(date) && time1.equals(time)) {

                f.setIsBooked(true);
                flightDetailsRepository.save(f);

                b.setId(f.getId());
                b.setDate(date1);
                b.setTime(time1);
//                bookingDetailsRepository.save(b);

            }
        }
       return b;

    }
}
