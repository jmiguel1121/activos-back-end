package repository.com;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import Model.com.Activo;

@Repository
public interface ActivoRepository extends MongoRepository<Activo, Long> {

}
