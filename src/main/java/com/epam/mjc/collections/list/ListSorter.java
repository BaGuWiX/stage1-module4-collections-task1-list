package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList,new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int result = calculateFunction(Integer.parseInt(a)) - calculateFunction(Integer.parseInt(b));
        if (result == 0) {
            return Integer.parseInt(a) - Integer.parseInt(b);
        } else {
            return result;
        }
    }
    private int calculateFunction(int x) {
        return 5 * x * x + 3;
    }
}
