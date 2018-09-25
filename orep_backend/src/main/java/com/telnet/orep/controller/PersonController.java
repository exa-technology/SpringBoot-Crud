package com.telnet.orep.controller;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.telnet.orep.entities.Person;

import com.telnet.orep.services.PersonService;

@RestController
@RequestMapping("/api")

public class PersonController {

	@Autowired
	private PersonService personService;
	
	// Get All persons

	@GetMapping("/person/liste")
	public List<Person> getPersons() {
		return personService.getPersons();
	}

	// find by id
	@GetMapping("/person/{id}")
	public Optional<Person> getPerson(@PathVariable Long id) {
		return personService.find(id);

	}

	

	// Delete person
	@DeleteMapping("/person/delete/{id}")
	public boolean deletePerson(@PathVariable long id) {
		personService.delete(id);

		return true;
	}

	// add new person
	@PutMapping("/person/create")
	public void createPerson(@RequestBody Person personjobPro  ) {
		personService.save(personjobPro);
		
				}  
		

	// update person
	@PutMapping("/person/update")
	public Person updatePerson(@RequestBody Person person) {
		return personService.save(person);

	}
	
	

	

}
