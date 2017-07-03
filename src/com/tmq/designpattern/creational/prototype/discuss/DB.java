package com.tmq.designpattern.creational.prototype.discuss;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by quytm on 6/30/2017.
 */
public class DB {

    private static List<String> recordList;
    private static boolean lock;

    private static DB instance;

    public DB(){
        recordList = new ArrayList<>();
        unlockDB();
    }

    public static DB getInstance() {
        if (instance == null) {
            synchronized (DB.class) {
                if (instance == null) {
                    instance = new DB();
                }
            }
        }

        return instance;
    }

    public List<String> readDB() {
        for (int i = 0; i < 10; i++) recordList.add(" " + i + " ");
        setTimeOut(3);

        return recordList;
    }

    public void writeDB(List<String> recordList) {
        while (!lock);

        lockDB();

        DB.recordList = recordList;
        setTimeOut(5);

        unlockDB();
    }

    private static void lockDB() {
        lock = true;
    }

    private static void unlockDB() {
        lock = false;
    }

    private static void setTimeOut(long second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
