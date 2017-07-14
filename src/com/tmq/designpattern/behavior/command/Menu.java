package com.tmq.designpattern.behavior.command;

import com.tmq.designpattern.behavior.command.keys.Key;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quytm on 7/14/2017.
 */
public class Menu {

    private List<Key> commands = new ArrayList<>();

    public void press(Key key) {
        key.execute();
    }
}
