package com.contacts.service;

import com.contacts.domain.Disc;

import java.util.List;

/**
 * Created by Kolja on 24.06.2017.
 */
public interface DiscService {

    Disc save(Disc disc);

    List<Disc> findAll();

    void delete(int id);

}
