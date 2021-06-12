package nm.api.catmash.Repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import nm.api.catmash.Model.Cat;

public interface CatmashRepo extends MongoRepository<Cat, String> {

	Cat addCat(Cat cat);

	List<Cat> findAllCats();

}
