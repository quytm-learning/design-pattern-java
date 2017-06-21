package com.tmq.designpattern.creational.factory;

import com.tmq.designpattern.creational.factory.models.Computer;

/**
 * Created by quytm on 6/21/2017.
 */
public class MainFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        System.out.println("Factory PC Config: \n\t" + pc);
        System.out.println("Factory Server Config: \n\t" + server);
    }

}
