package org.example;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        if ((o1 instanceof Integer) && (o2 instanceof Integer)) {
            return Integer.compare((Integer) o1, (Integer) o2);
        } else if ((o1 instanceof String) && (o2 instanceof String)) {
            return (((String) o1).compareTo((String) o2));
        } else return o1.getClass().getName().compareTo(o2.getClass().getName());
    }

}
