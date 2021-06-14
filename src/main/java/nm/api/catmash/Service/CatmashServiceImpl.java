package nm.api.catmash.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nm.api.catmash.Model.Cat;
import nm.api.catmash.Repository.CatmashRepo;

@Service
public class CatmashServiceImpl implements CatmashService {
	@Autowired
	private CatmashRepo catmashRepository;

	@Override
	public List<Cat> findAllCats() {
		return catmashRepository.findAll();
	}

	@Override
	public Cat insertCat(Cat cat) {
		System.out.println("service");
		Cat c = catmashRepository.insert(cat);
		System.out.println(c.getId() + " - " + c.getImageData());
		return c;
	}
}
