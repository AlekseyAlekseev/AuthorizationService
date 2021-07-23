package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<Authorities> userAuthorities = new ArrayList<>();
    {
        userAuthorities.add(Authorities.READ);
        userAuthorities.add(Authorities.WRITE);
        userAuthorities.add(Authorities.DELETE);
    }

    public List<Authorities> getUserAuthorities(String name, String password) {
        return userAuthorities;
    }

}
