package com.contacts.web.controller;

import com.contacts.domain.Disc;
import com.contacts.domain.Genre;
import com.contacts.domain.Person;
import com.contacts.service.DiscService;
import com.contacts.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Kolja on 24.06.2017.
 */
@Controller
public class DiscsController {

    @Autowired
    DiscService discService;
    @Autowired
    GenreService genreService;

    @RequestMapping(value = "discs", method = RequestMethod.GET)
    public String discsPage(Model model) {
        List<Disc> discList = discService.findAll();
        List<Genre> genreList = genreService.findAll();
        model.addAttribute("discList", discList);
        model.addAttribute("genreList", genreList);
        return "discs";
    }

    @RequestMapping(value = "discs/add", method = RequestMethod.POST)
    public String add(@RequestParam("name") String name, @RequestParam("genreId") String genreId) {
        Disc disc = new Disc();
        disc.setName(name);
        Genre genre = genreService.getOne(Integer.parseInt(genreId));
        disc.setGenre(genre);
        discService.save(disc);

        return "redirect:/discs";
    }

    @RequestMapping(value = "discs/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {

        discService.delete(id);

        return "redirect:/discs";
    }

}
