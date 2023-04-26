package com.company.designpatterns.StateDP;

import java.util.ArrayList;
import java.util.List;

public class StateRunner {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Mirac", 25));
        users.add(new User("Yusuf", 10));
        users.add(new User("Ayşe", 25));
        users.add(new User("Nazlı", 20));
        users.add(new User("Merve", 35));
        users.add(new User("Hatice", 35));
        users.add(new User("Muhammet", 36));

        Context context = new Context();

        context.setState(new NameFilterState("et"));
        context.filterUsers(users);

        context.setState(new AgeFilterState(25));
        context.filterUsers(users);
    }
}
