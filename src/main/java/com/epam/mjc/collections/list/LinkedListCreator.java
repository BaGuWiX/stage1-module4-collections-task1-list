package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultList = new LinkedList<>();

        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                resultList.addLast(number);
            } else {
                resultList.addFirst(number);
            }
        }

        return resultList;
    }
}
