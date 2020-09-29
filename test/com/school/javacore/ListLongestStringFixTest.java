package com.school.javacore;
import static org.junit.Assert.assertEquals;

import com.school.javacore.lists.ListLongestStringFix;
import org.junit.Test;

import java.util.ArrayList;


public class ListLongestStringFixTest {
    @Test
    public void evaluatesExpression() {
        ListLongestStringFix lst = new ListLongestStringFix();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile", "verylongstring"};
        ArrayList<String> list = new ArrayList<>();
        list.add("short");
        list.add("longtext");
        list.add("verylongtext");
        String longest = lst.findLongest(list);
        assertEquals("verylongtext", longest);
    }
}