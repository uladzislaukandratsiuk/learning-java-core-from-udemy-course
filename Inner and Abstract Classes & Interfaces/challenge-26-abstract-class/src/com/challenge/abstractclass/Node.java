package com.challenge.abstractclass;

import org.w3c.dom.NodeList;

public interface NodeItem {

    NodeList nextItem();

    NodeList setNextItem(NodeList item);

    NodeList previousItem();

    NodeList setPreviousItem(NodeList item);

    int compareTo(NodeList item);

}

