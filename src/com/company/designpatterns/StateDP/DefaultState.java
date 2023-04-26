package com.company.designpatterns.StateDP;

import java.util.List;

public class DefaultState implements State{
    @Override
    public List<User> filterUsers(List<User> users) {
        return users;
    }

    @Override
    public String getStatus() {
        return null;
    }
}
