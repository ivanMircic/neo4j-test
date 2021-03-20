package com.imircic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Set;

@Node
@Data
@AllArgsConstructor
public class Fixture {
    @Id
    private String id;
    @Relationship
    public Time startTime;
    @Relationship
    public Set<Competitor> competitors;
    @Relationship
    public Set<Competition> competitions;
    @Relationship
    public Location venue;
}
