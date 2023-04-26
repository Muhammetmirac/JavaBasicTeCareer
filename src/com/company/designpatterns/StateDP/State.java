package com.company.designpatterns.StateDP;

import java.util.List;

public interface State {
    List<User> filterUsers(List<User> users);
    String getStatus();
}

