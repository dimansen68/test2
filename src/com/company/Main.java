package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] names;
    names = new String[10];
    names[0]= "abc";
    String[] names2 = {"cde", "fgh"};
    System.out.println(names[0]);
    System.out.println(names2[0]);

    names2=names;
    System.out.println(names[0]);
    System.out.println(names2[0]);

    names2[2]="klm";
    System.out.println(names[2]);
    System.out.println(names2[2]);

    int i=10;
    //Integer j = new Integer(value) 11)

    }
}
