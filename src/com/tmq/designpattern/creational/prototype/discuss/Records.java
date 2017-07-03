package com.tmq.designpattern.creational.prototype.discuss;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quytm on 6/21/2017.
 */
public class Records implements Cloneable {

    private List<String> recordList;

    public Records() {
        recordList = new ArrayList<>();
    }

    public Records(List<String> list) {
        this.recordList = list;
    }

    public void loadData() {
        recordList = DB.getInstance().readDB();
    }

    public List<String> getRecordList() {
        return recordList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        temp.addAll(getRecordList());

        return new Records(temp);
    }

}
