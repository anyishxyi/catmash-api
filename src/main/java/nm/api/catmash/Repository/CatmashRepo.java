package nm.api.catmash.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import nm.api.catmash.Model.Cat;

public interface CatmashRepo extends MongoRepository<Cat, String> {
	@Query(value = "{'_id' : ?0}", delete = true)
	public void deleteById(long id);
}
