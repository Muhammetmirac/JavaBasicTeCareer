package com.company.designpatterns.ObserverDP;

public interface Channel {
    void update (String news); // yeni haber eklemek için

    void printNews();
}
