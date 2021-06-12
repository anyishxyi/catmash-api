package nm.api.catmash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatmashController {
	@GetMapping(value = "hello")
	public String getHelloWorld() {
		return "hello world";
	}

}
