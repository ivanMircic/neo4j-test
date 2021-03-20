package com.imircic.repository;

import com.imircic.model.Time;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface NameRepository extends Neo4jRepository<Time, String> {
}
