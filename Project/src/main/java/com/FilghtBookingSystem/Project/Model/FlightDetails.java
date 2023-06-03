package com.FilghtBookingSystem.Project.Model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="Flight")
public class FlightDetails {


    @Id
    private long id;

    private String flightName;
    private String StartingPlace;
    private String DestinationPlace;
    private String Date;
    private String Time;
    int noofSeats;
    Boolean isBooked=false;
}
