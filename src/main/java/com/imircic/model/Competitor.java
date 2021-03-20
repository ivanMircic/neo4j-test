package com.imircic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
@Data
@AllArgsConstructor
public class Competitor {
    @Id
    private String id;
    @Relationship
    private Name name;
    @Relationship
    private Location location;
}
