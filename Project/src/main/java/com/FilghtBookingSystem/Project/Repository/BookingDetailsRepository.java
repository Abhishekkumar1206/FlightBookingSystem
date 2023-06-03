package com.FilghtBookingSystem.Project.Repository;

import com.FilghtBookingSystem.Project.Model.BookTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailsRepository extends JpaRepository<BookTicket,Long> {



}
