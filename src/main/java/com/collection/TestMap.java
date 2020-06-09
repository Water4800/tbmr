package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<String,Fruit> map = new HashMap<String, Fruit>();

        map.put("1",new Fruit("apple","sweet"));
        map.put("2",new Fruit("banana","fragrant"));
        map.put("3",new Fruit("orange","acid"));

        //遍历1，普通使用，二次取值
        System.out.println("通过Map.keySet遍历key和value");
        for (String key : map.keySet()){
            System.out.println("key= " + key + " and value= " + map.get(key));

        }

        //遍历2，
        System.out.println();
        System.out.println("通过Map.entrySet使用iterator遍历key和value");
        Iterator<Map.Entry<String,Fruit>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Fruit> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //遍历3
        System.out.println();
        System.out.println("通过Map.entrySet遍历key和value");
        for(Map.Entry<String,Fruit> entry : map.entrySet()){
            System.out.println("key= " + entry.getKey() + "and value= " + entry.getValue());
        }

        //遍历4
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (Fruit  v: map.values()){
            System.out.println(v.getTaste());
        }


    }


}
