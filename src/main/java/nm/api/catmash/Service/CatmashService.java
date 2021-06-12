package nm.api.catmash.Service;

import java.util.List;

import nm.api.catmash.Model.Cat;

public interface CatmashService {
	public List<Cat> findAll();

	public Cat newCat(Cat cat);

}
