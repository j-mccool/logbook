package logbook.Models.data;

import logbook.Models.Aircraft;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AircraftDao extends CrudRepository<Aircraft, Integer> {
}
