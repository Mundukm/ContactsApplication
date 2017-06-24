package com.contacts.service.impl;

import com.contacts.domain.Disc;
import com.contacts.repository.DiscsRepository;
import com.contacts.service.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Kolja on 24.06.2017.
 */
@Service
@Transactional
public class DiscServiceImpl implements DiscService {

    @Autowired
    private DiscsRepository discsRepository;

    @Override
    public Disc save(Disc disc) {
        return discsRepository.save(disc);
    }

    @Override
    public List<Disc> findAll() {
        return discsRepository.findAll();
    }

    @Override
    public void delete(int id) {
        discsRepository.delete(id);
    }

}
