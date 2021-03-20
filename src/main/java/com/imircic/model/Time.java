package com.imircic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.time.OffsetDateTime;

@Node
@Data
@AllArgsConstructor
public class Time {
    @Id
    private OffsetDateTime startTime;
}
