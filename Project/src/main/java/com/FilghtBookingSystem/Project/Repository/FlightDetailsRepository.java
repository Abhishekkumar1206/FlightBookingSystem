package com.FilghtBookingSystem.Project.Repository;

import com.FilghtBookingSystem.Project.Model.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightDetailsRepository extends JpaRepository<FlightDetails,Long> {

    @Query(value="select * from Flight f where f.date=:d and f.time=:t",nativeQuery = true)
    List<FlightDetails>findAllByDatesAndTime(@Param("d") String date, @Param("t") String time);
}
