package com.dalia.ProjetoDalia.Entity.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Search {

    private int age;
    private boolean regularMenstruation;
    private boolean useContraceptive;
    private String contraceptiveType;
    @Field(name = "lastMenstruationDay")
    private Instant lastMenstruationDay;
    private int cycleDuration;
}
