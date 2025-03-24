package com.dalia.ProjetoDalia.Entity.Users;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.time.Instant;

@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    private String id;

    private String name;
    private String surname;
    private String email;
    private String password;
    @Field(name = "birthDate")
    private Instant birthDate;
    private List<Search> search;
    private List<PregnancyMonitoring> pregnancyMonitorings;
}
