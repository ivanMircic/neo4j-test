package com.imircic.repository;

import com.imircic.model.Competitor;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CompetitorRepository extends Neo4jRepository<Competitor, String> {
}
