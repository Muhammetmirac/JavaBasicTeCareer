package com.company.designpatterns.StateDP;

import java.util.List;

public class Context {
    private State currentState;

    public Context() {

        currentState = new DefaultState();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void filterUsers(List<User> users) {
        List<User> filteredUsers = currentState.filterUsers(users);
        for (User user : filteredUsers) {
            System.out.println(user);
        }
    }
}