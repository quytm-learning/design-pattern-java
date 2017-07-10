package com.tmq.designpattern.behavior.command;

/**
 * Created by quytm on 7/10/2017.
 */
public class FileInvoker {

    public void excute(Command command) {
        command.execute();
    }

}
