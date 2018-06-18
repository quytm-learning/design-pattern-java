package com.tmq.designpattern.practices.htmlparser;

import com.tmq.designpattern.practices.htmlparser.dom.*;

/**
 * Created by quytm on 7/21/2017.
 */
public class HTMLScanner {

    private static char PREFIX_TAG = '<';
    private static char SUFIX_TAG = '>';
    private static char SLASH = '/';


//    public String visit(TagNode tagNode){
//
//        return "";
//    }
//
//    public String visit(ExtendTagNode extendTagNode){
//
//        return "";
//    }

    public Node scan(String input) {
        Node currentNode = new TagNode();

        currentNode.setName(scanTagName(input));


        return currentNode;
    }

    public String scanTagName(String input) {
        int startPrefixTag = input.indexOf(PREFIX_TAG);
        int endPrefixTag = input.indexOf(SUFIX_TAG);

        String tagName = input.substring(startPrefixTag + 1, endPrefixTag);

        if (tagName.contains(" ")) {
            endPrefixTag = tagName.indexOf(" ");
            tagName = input.substring(startPrefixTag + 1, endPrefixTag);
        }

        return tagName;
    }


}
