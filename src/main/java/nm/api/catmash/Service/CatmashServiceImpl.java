package nm.api.catmash.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import nm.api.catmash.Model.Cat;
import nm.api.catmash.Repository.CatmashRepo;

public class CatmashServiceImpl implements CatmashService {
	@Autowired
	private CatmashRepo catmashRepository;

	@Override
	public List<Cat> findAll() {
		return catmashRepository.findAll();
	}

	@Override
	public Cat newCat(Cat cat) {
		return catmashRepository.insert(cat);
	}
}
