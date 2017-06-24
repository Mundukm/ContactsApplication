package com.contacts.repository;

import com.contacts.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kolja on 24.06.2017.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {


}
