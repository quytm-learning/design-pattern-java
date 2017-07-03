package com.tmq.designpattern.structural.practice.adapter;

import com.tmq.designpattern.structural.practice.adapter.model.Person;

/**
 * Created by quytm on 7/3/2017.
 */
public interface BaseAdapter {

    String translate(String speech, Person person);

}
