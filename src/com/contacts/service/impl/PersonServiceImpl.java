package com.contacts.service.impl;

import com.contacts.domain.Person;
import com.contacts.repository.PersonRepository;
import com.contacts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Kolja on 24.06.2017.
 */
@Service
@Transactional
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;


    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void delete(int id) {
        personRepository.delete(id);
    }
}
