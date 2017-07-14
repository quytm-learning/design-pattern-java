package com.tmq.designpattern.behavior.command.others;

/**
 * Created by quytm on 7/14/2017.
 */
public class Gamer {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.pressSpace();

        menu.pressD();
        menu.pressD();

        menu.pressA();
        menu.pressA();

        // ......
    }
}
