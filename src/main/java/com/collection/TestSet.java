package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {
        Set<Fruit> set = new HashSet<Fruit>();

        set.add(new Fruit("apple","sweet"));
        set.add(new Fruit("banana","fragrant"));
        set.add(new Fruit("orange","acid"));

        //遍历1 使用迭代器进行相关遍历
        Iterator<Fruit> fruitIterator = set.iterator();
        while (fruitIterator.hasNext()){
            System.out.println(fruitIterator.next().getTaste());
        }

        //遍历2 把集合变为数组相关内容进行遍历
        Fruit[] fruits = new Fruit[set.size()];
        set.toArray(fruits);
        for(int i = 0; i < fruits.length;i++){
            System.out.println(fruits[i].getTaste());
        }

        //遍历3
        for(Fruit fruit : set){
            System.out.println(fruit.getTaste());
        }


    }
}
