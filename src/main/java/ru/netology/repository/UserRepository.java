package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Authorities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {
    private static List<Authorities> userAuthorities = new ArrayList<>();

    private static HashMap<String, String> users = new HashMap<>();


    public String getUserAuthorities(String name, String password) {
//        users.put(name, password);
//        userAuthorities.add(Authorities.WRITE);

        return "hello my friend";
    }

}
