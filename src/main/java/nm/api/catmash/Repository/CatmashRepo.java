package nm.api.catmash.Repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import nm.api.catmash.Model.Cat;

public interface CatmashRepo extends MongoRepository<Cat, String> {

	public Cat insert(Cat cat);

	public List<Cat> findAllCats();

}
