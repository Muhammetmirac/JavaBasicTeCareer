package com.company.designpatterns.StateDP;

import java.util.ArrayList;
import java.util.List;

public class AgeFilterState implements State{
    private int age;

    public AgeFilterState(int age) {
        this.age = age;
    }

    @Override
    public List<User> filterUsers(List<User> users) {
        List<User> filteredUsers = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() == age) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }

    @Override
    public String getStatus() {
        return "Yaşlara göre kullanıcıları filtreleme: " + age;
    }
}