package com.tmq.designpattern.practices.htmlparser.dom;

import com.tmq.designpattern.practices.htmlparser.HTMLScanner;

/**
 * Created by quytm58 on 20/07/17.
 */
public interface Item {

    String accept(HTMLScanner scanner, String input);

}
