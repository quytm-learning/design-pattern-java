package com.tmq.designpattern.behavior.command;

/**
 * Created by quytm on 7/10/2017.
 */
public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.closeFile();
    }
}
