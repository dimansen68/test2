package com.company;

public class Main {

    public static void main(String[] args) {

     double price = 54.79;
     int volume = 70;
     double cost = price * volume;
     System.out.println(cost);

     double gross = 100000;
     double net = gross*(1-0.13);
     System.out.println(net);

     double sec = 5000;
     double hours = sec / 3600;
     System.out.println(hours);
    }
}
