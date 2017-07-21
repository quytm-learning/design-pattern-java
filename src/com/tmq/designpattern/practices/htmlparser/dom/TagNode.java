package com.tmq.designpattern.practices.htmlparser.dom;

import com.tmq.designpattern.practices.htmlparser.HTMLParser;

/**
 * Created by quytm58 on 20/07/17.
 */
public class TagNode extends Node {
    @Override
    public String accep(HTMLParser htmlParser) {
        return htmlParser.visit(this);
    }
}
