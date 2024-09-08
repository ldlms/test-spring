package com.springTest.spring_first_app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

	@GetMapping("/jean")
	public Storage getStorage() {
		return new Storage("jean", "cule");
	}

	@GetMapping("/liste")
	public List<Storage> getMultipleStorage() {
		List<Storage> multiStorage = new ArrayList<>();
		Storage jean = new Storage("jean", "cule");
		Storage paul = new Storage("paul", "poule");
		multiStorage.add(jean);
		multiStorage.add(paul);
		multiStorage.add(new Storage("phil", "hémon"));
		return multiStorage;
	}
}
