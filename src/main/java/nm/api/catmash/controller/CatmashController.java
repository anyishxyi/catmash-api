package nm.api.catmash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nm.api.catmash.Model.Cat;
import nm.api.catmash.Service.CatmashServiceImpl;

@RestController
@RequestMapping("/")
public class CatmashController {
	@Autowired
	private CatmashServiceImpl catmashServiceImpl;

	@GetMapping(value = "/cats")
	public ResponseEntity<List<Cat>> getAllCats() {
		try {
			List<Cat> cats = catmashServiceImpl.findAllCats();
			if (cats != null)
				return new ResponseEntity<List<Cat>>(cats, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Cat> saveCatImg(@RequestBody Cat cat) {
		try {
			Cat catAdded = catmashServiceImpl.insertCat(cat);
			if (catAdded != null || catAdded instanceof Cat)
				return new ResponseEntity<Cat>(catAdded, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
	}

}
