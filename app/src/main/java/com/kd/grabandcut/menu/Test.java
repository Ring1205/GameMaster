package com.kd.grabandcut.menu;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/10/10 0010.
 */

public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = addList();
        for (Object o : linkedList) {
            System.out.println(o);
        }
    }

    private static LinkedList addList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        return linkedList;
    }
}
