package com.contacts.service;

import com.contacts.domain.Genre;

import java.util.List;

/**
 * Created by Kolja on 24.06.2017.
 */
public interface GenreService {

    List<Genre> findAll();

    Genre save(Genre genre);

    void delete(int id);

    Genre getOne(int id);

}
