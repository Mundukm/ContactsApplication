package com.contacts.service.impl;

import com.contacts.domain.Genre;
import com.contacts.repository.GenreRepository;
import com.contacts.service.DiscService;
import com.contacts.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Kolja on 24.06.2017.
 */
@Service
@Transactional
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

    @Override
    public Genre save(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public void delete(int id) {
        genreRepository.delete(id);
    }

    @Override
    public Genre getOne(int id) {
        return genreRepository.getOne(id);
    }

}
