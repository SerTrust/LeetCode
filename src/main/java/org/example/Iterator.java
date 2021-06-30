package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Iterator {
    public static void main( String[] args ) {
        //List還沒輪到的可以刪除,但是回頭刪除會出錯
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        java.util.Iterator t = list.iterator();
        while (t.hasNext()) {
            if (t.next().equals("ccc")) {
                list.remove("bbb");
            }
        }
        //Set可以回頭刪除,但是還沒輪到的會出錯
        TreeSet<String> set = new TreeSet<String>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        java.util.Iterator t1 = set.iterator();
        while (t1.hasNext()) {
            if (t1.next().equals("bbb")) {
                set.remove("ccc");
            }
        }
    }
}
