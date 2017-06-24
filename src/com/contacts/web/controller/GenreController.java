package com.contacts.web.controller;

import com.contacts.domain.Disc;
import com.contacts.domain.Genre;
import com.contacts.service.DiscService;
import com.contacts.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Kolja on 24.06.2017.
 */
@Controller
public class GenreController {

    @Autowired
    GenreService genreService;

    @RequestMapping(value = "genre", method = RequestMethod.GET)
    public String genrePage(Model model) {
        List<Genre> genreList = genreService.findAll();
        model.addAttribute("genreList", genreList);
        return "genre";
    }

    @RequestMapping(value = "genre/add", method = RequestMethod.POST)
    public String add(@RequestParam("name") String name) {
        Genre genre = new Genre();
        genre.setName(name);
        genreService.save(genre);

        return "redirect:/genre";
    }

    @RequestMapping(value = "genre/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {

        genreService.delete(id);

        return "redirect:/genre";
    }




}
