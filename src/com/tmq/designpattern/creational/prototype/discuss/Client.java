package com.tmq.designpattern.creational.prototype.discuss;

import java.util.List;
import java.util.Random;

/**
 * Created by quytm on 6/30/2017.
 */
public class Client {

    public static void main(String[] args) {
        Records records = new Records();
        records.loadData();

        Random random = new Random();
        final int[] numberOfThreadFinished = {0};

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                try {
                    Records recordsThread = (Records) records.clone();
                    List<String> recordList = recordsThread.getRecordList();
                    int count = random.nextInt(5);
                    for (int j = 0; j < count; j++) {
                        int index = random.nextInt(recordList.size());
                        recordList.set(index, "_" + j + "_");
                    }

                    System.out.println("\n\nFinished: " + finalI + "\n" + recordList);

                    DB.getInstance().writeDB(recordList);

                    numberOfThreadFinished[0]++;
                    if (numberOfThreadFinished[0] == 5) {
                        System.out.println("------- Finish ---------");
                    }
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();

        }
    }
}
