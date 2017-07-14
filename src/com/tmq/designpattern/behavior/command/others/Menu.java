package com.tmq.designpattern.behavior.command.others;

/**
 * Created by quytm on 7/14/2017.
 */
public class Menu {

    public void pressSpace(){
        System.out.println("Space is press");
    }

    public void pressA() {
        System.out.println("Move left");
    }

    public void pressD() {
        System.out.println("Move right");
    }

    // ........

}



//    public void press(String input) {
//        switch (input){
//            case "Space":
//                System.out.println("Space");
//                break;
//            case "A":
//                break;
//            case "D":
//                break;
//        }
//    }