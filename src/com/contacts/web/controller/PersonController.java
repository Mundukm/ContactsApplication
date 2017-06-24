package com.contacts.web.controller;

import com.contacts.domain.Genre;
import com.contacts.domain.Person;
import com.contacts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Kolja on 24.06.2017.
 */
@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "person", method = RequestMethod.GET)
    public String personPage(Model model) {
        List<Person> personList = personService.findAll();
        model.addAttribute("personList", personList);
        return "person";
    }

    @RequestMapping(value = "person/add", method = RequestMethod.POST)
    public String add(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {

        personService.save(new Person(firstName, lastName));

        return "redirect:/person";
    }

    @RequestMapping(value = "person/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {

        personService.delete(id);

        return "redirect:/person";
    }

}
