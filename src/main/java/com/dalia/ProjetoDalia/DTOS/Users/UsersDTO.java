package com.dalia.ProjetoDalia.DTOS.Users;

import com.dalia.ProjetoDalia.Entity.Users.PregnancyMonitoring;
import com.dalia.ProjetoDalia.Entity.Users.Search;
import com.dalia.ProjetoDalia.Entity.Users.Users;

import java.util.List;
import java.time.Instant;

public record UsersDTO(
        String name,
        String surname,
        String email,
        String password,
        Instant birthdate,
        List<Search> search,
        List<PregnancyMonitoring> pregnancyMonitorings
) {
    public UsersDTO(Users users){
        this(
                users.getName(),
                users.getSurname(),
                users.getEmail(),
                users.getPassword(),
                users.getBirthDate(),
                users.getSearch(),
                users.getPregnancyMonitorings()
        );
    }

    public Users toEntity(){
        return new Users(
                null,
                name,
                surname,
                email,
                password,
                birthdate,
                search,
                pregnancyMonitorings
        );
    }


}
