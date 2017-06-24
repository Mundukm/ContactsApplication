package com.contacts.repository;

import com.contacts.domain.Disc;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kolja on 24.06.2017.
 */
public interface DiscsRepository extends JpaRepository<Disc, Integer> {
}
