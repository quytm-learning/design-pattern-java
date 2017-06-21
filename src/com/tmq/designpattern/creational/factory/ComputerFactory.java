package com.tmq.designpattern.creational.factory;

import com.tmq.designpattern.creational.factory.models.Computer;
import com.tmq.designpattern.creational.factory.models.PC;
import com.tmq.designpattern.creational.factory.models.Server;

/**
 * Created by quytm on 6/21/2017.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }

}
