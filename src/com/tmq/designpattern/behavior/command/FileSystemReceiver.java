package com.tmq.designpattern.behavior.command;

/**
 * Created by quytm on 7/10/2017.
 */
public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();

}
