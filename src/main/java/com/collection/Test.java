package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("apple","sweet");
        Fruit fruit2 = new Fruit("banana","astringent");

        List<Fruit> list = new ArrayList<Fruit>();

        list.add(fruit1);
        list.add(fruit2);

        list.get(1).setTaste("甜");

        //遍历1
        for(Fruit f : list){
            System.out.println(f.getTaste());
        }

        //遍历2
        for (int i = 0; i < list.size(); i++){
            Fruit fruit = list.get(i);
            System.out.println(fruit.getTaste());

        }

        //遍历3
        Iterator<Fruit> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getTaste());
        };

        System.out.println("=========================");

        /**
         * 这里的无限执行暂时搁置

        while (list.iterator().hasNext()){
            System.out.println(list.iterator().next());

            break;
        }
         */

    }
}
