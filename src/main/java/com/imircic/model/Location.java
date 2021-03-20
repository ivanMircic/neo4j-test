package com.imircic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
@AllArgsConstructor
public class Location {
    private String location;
}
