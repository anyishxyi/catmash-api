package nm.api.catmash.Repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import nm.api.catmash.Model.Cat;

public interface CatmashRepo extends MongoRepository<Cat, String> {

	// public <S extends Cat> S save(Cat cat);

	// public List<Cat> findAll();

}
