package com.thinkInJava.Chapter15;

import java.util.List;

public class UnboundedWildcards1 {
    List list1;
    List<?> list2;
    List<? extends Object> list3;

    void assign1(List list){
        list1 = list;
        list2 = list;
        list3 = list;
    }

}
