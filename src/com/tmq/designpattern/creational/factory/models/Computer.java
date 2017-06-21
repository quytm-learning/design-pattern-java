package com.tmq.designpattern.creational.factory.models;

/**
 * Created by quytm on 6/21/2017.
 */
public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM = " + getRAM() + ", CPU = " + getCPU() + ", HDD = " + getHDD();
    }
}
