package com.qa.ashworth.william.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
	@RequestMapping("/")
	public String index()
	{
		return "Hello World!";
	}
}
