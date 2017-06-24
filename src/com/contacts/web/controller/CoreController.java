package com.contacts.web.controller;

import com.contacts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Core servlet controller class.
 *
 * @author Myndyk Mykola
 * @version 1.0
 * @since 24.06.2017
 */
@Controller
public class CoreController {

    @Autowired
    private PersonService personService;

    /**
     * Handles request to welcome page
     *
     * @return logical view name
     */
    @GetMapping("/")
    public String onIndex() {
        return "index";
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home() {
        return "index";
    }
}
