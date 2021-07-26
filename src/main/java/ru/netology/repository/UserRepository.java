package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Authorities;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {

    private HashMap<String, String> users = new HashMap<>();
    {
        users.put("admin", "123456");
        users.put("user", "123");
    }
    private List<Authorities> userAuthorities = new ArrayList<>();

    public List<Authorities> getUserAuthorities(String name, String password) {
        userAuthorities.clear();
        if (users.containsKey(name)) {
            userAuthorities.add(Authorities.READ);
        } else {
            userAuthorities.clear();
        }
        return userAuthorities;
    }

}
