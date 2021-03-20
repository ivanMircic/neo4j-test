package com.imircic.repository;

import com.imircic.model.Competition;
import com.imircic.model.Competitor;
import com.imircic.model.Fixture;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FixtureRepository extends Neo4jRepository<Fixture, String> {
    Fixture findFixtureByCompetitionsContains(Competition competition);
    Fixture findFixtureByCompetitorsContains(Competitor competitor);
}
