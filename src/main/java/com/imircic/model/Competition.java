package com.imircic.model;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
@Data
public class Competition {
    @Id
    private String id;
    @Relationship
    private Name name;
    @Relationship
    private Location location;
}
