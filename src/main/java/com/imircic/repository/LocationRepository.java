package com.imircic.repository;

import com.imircic.model.Location;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface LocationRepository extends Neo4jRepository<Location, String> {
}
