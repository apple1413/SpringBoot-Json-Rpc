package com.example.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private ExampleService exampleService;

    @RequestMapping("/hello")
    public String index() {    	
    	int id = exampleService.multiply(3, 2);
        return "result:"+id;
    }
}