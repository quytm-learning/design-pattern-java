package com.tmq.designpattern.behavior.command;

/**
 * Created by quytm on 7/10/2017.
 */
public class FileSystemClient {

    public static void main(String[] args) {
        FileInvoker fileInvoker = new FileInvoker();

        WindowsFileSystemReceiver windowsFileSys = new WindowsFileSystemReceiver();

        Command open = new OpenFileCommand(windowsFileSys);
        Command write = new WriteFileCommand(windowsFileSys);
        Command close = new CloseFileCommand(windowsFileSys);

        fileInvoker.excute(open);
        fileInvoker.excute(write);
        fileInvoker.excute(close);
    }

}
