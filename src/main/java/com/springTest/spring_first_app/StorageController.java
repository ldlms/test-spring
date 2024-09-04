package com.springTest.spring_first_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

	@GetMapping("/jean")
	public Storage getStorage() {
		return new Storage("jean", "cule");
	}
}
