package com.tmq.designpattern.practices.htmlparser.dom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quytm58 on 20/07/17.
 */
public abstract class Node implements Item {

    private List<Node> nodeTree;
    private String name;
    private String content;

    public Node() {
        nodeTree = new ArrayList<>();
    }

    public List<Node> getNodeTree() {
        return nodeTree;
    }

    public void setNodeTree(List<Node> nodeTree) {
        this.nodeTree = nodeTree;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
