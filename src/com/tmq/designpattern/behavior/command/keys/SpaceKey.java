package com.tmq.designpattern.behavior.command.keys;

/**
 * Created by quytm on 7/14/2017.
 */
public class SpaceKey implements Key {
    @Override
    public void execute() {
        System.out.println("Space is press");
    }
}
