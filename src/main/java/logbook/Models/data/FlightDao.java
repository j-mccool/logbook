package logbook.Models.data;

import logbook.Models.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface FlightDao extends CrudRepository<Flight, Integer> {
}
