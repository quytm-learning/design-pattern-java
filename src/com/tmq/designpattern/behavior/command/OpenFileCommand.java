package com.tmq.designpattern.behavior.command;

/**
 * Created by quytm on 7/10/2017.
 */
public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
