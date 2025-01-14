package com.company.designpatterns.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Channel{

    private List<String> newsList = new ArrayList<>();

    @Override
    public void update(String news) {
        newsList.add(news);

    }

    @Override
    public void printNews() {
        for (String w:newsList           ) {
            System.out.println(w);
        }

    }
}
