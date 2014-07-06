package com.louishong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.louishong.domain.Person;

@RestController
@RequestMapping("/person")
public class SimpleController {

	@RequestMapping("/{name}")
	public Person getPerson(
			@RequestParam(value = "name", required = false, defaultValue = "Fucking Nobody") String name) {

		Person person = new Person();
		person.setAge(13213);
		person.setName(name);

		return person;
	}
}
