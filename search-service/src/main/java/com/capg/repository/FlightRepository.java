package com.capg.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.entity.Flights;
@Repository
public interface FlightRepository extends MongoRepository<Flights, Integer> {
	@Query("{'origin' : :#{#origin}, 'destination' : :#{#destination}}")
    List<Flights> findBy(@Param("origin") String origin, @Param("destination") String destination);
	

}
