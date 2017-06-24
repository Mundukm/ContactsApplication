package com.contacts.service;

import com.contacts.domain.Person;

import java.util.List;

/**
 * Created by Kolja on 24.06.2017.
 */
public interface PersonService {

    List<Person> findAll();

    Person save(Person person);

    void delete(int id);

}
