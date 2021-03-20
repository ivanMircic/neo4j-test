package com.imircic.repository;

import com.imircic.model.Competition;
import com.imircic.model.Competitor;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CompetitionRepository extends Neo4jRepository<Competition, String> {
}
