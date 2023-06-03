package com.FilghtBookingSystem.Project.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class BookTicket {

    @Id
    Long id;

    String Date;
    String Time;

}
