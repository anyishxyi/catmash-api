package nm.api.catmash.Service;

import java.util.List;

import nm.api.catmash.Model.Cat;

public interface CatmashService {
	public List<Cat> findAllCats();

	public Cat insertCat(Cat cat);

}
