package com.company.designpatterns.ObserverDP;

public class Observer {
    public static void main(String[] args) {

        Observer observer = new Observer();
        observer.osberverDemo();

    }


    void osberverDemo(){
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewsAgency agency = new NewsAgency();
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.sendNews(" Taze taze haberler");
        agency.sendNews(" Şampiyon belli oldu");
        agency.sendNews(" Herşey güzel olacak");

        System.out.println("Channel 1 haberleri : ");
        channel1.printNews();
        System.out.println("*******************************************");
        System.out.println("Channel 2 haberleri : ");
        channel2.printNews();
        System.out.println("*******************************************");
        System.out.println("Channel 3 haberleri : ");
        channel3.printNews();

    }
}
