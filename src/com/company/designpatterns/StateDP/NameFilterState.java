package com.company.designpatterns.StateDP;

import java.util.ArrayList;
import java.util.List;

public class NameFilterState implements State{
  private String name;

    public NameFilterState(String name) {
        this.name = name;
    }

    @Override
    public List<User> filterUsers(List<User> users) {
        List<User> filteredUsers = new ArrayList<>();
        for (User user : users) {
            if (user.getName().contains(name)) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }

    @Override
    public String getStatus() {
        return "İsimlere göre kullanıcıları filtreleme: " + name;
    }
}
