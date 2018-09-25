package com.telnet.orep.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.telnet.orep.dao.PersonDao;

import com.telnet.orep.entities.Person;

@Service
public class PersonService {
@Autowired
PersonDao personRepository;
public Person save(Person person)
{
	return personRepository.save(person);
	}

public Person update(Person person)
{
	return personRepository.save(person);}
public Optional<Person> find(Long id) {
	return personRepository.findById(id);
}

public List<Person> getPersons()
{ return personRepository.findAll();
	}
//get person by username






public boolean delete(Long id) {
	 personRepository.deleteById(id);
	 return true;
}

}





