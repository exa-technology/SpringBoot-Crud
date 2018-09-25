package com.telnet.orep.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import com.telnet.orep.entities.Person;


public interface PersonDao extends JpaRepository<Person, Long> {
	
		
}

