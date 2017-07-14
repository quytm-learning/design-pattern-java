package com.tmq.designpattern.behavior.command;

import com.tmq.designpattern.behavior.command.keys.*;

/**
 * Created by quytm on 7/14/2017.
 */
public class Gamer {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.press(new SpaceKey());

        menu.press(new AKey());
        menu.press(new AKey());

        menu.press(new DKey());
        menu.press(new DKey());

        // ...
    }

    private void examples() {

        Runnable writeDB = new Runnable() {
            @Override
            public void run() {
                System.out.println("Bla bla ...");
            }
        };
        Runnable exportReport = new Runnable() {
            @Override
            public void run() {
                System.out.println("Bla bla ...");
            }
        };


        new Thread(writeDB)
                .start();

        new Thread(exportReport)
                .start();
    }
}
