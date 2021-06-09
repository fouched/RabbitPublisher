package za.co.limehouse.rabbit.publisher.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
	@GetMapping(path = {"", "/"})
	public String getIndex() {
		return "Hello from the base service endpoint. Now call something real :-)";
	}
}
