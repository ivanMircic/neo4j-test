package com.imircic.service;

import com.imircic.model.Fixture;
import com.imircic.repository.FixtureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FixtureService {
    private final FixtureRepository fixtureRepository;

    @Autowired
    public FixtureService(FixtureRepository fixtureRepository) {
        this.fixtureRepository = fixtureRepository;
    }

    public Fixture save(Fixture fixture) {
        return fixtureRepository.save(fixture);
    }

    public List<Fixture> getAll() {
        return fixtureRepository.findAll();
    }
}
