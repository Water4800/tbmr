package com.tbmr;

import java.util.Arrays;

public class TbmrArrayLIst<T> implements Tbmr<T> {

    public void add(T t) {
        //如果存在的对象超出size大小，扩容
        int minCapacity = size + 1;

        if (size == elementData.length){
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1); // oldCapacity >> 1 理解成 oldCapacity/2 新数组的长度是原来长度1.5倍

            if (newCapacity < minCapacity){
                //最小容量比新容量要小的，则才采用出事容量
                newCapacity = minCapacity ;
            }
            elementData = Arrays.copyOf(elementData,newCapacity);
        }
        elementData[size++] = t;
    }


    public T get(int index) {
        rangeCheck(index);
        return (T) elementData[index];
    }

    public T remove(int index) {
        T t = get(index);

        int numMoved = elementData.length - index - 1 ;
        if (numMoved > 0)
            System.arraycopy(elementData,index+1,elementData,index,numMoved);
            elementData[--size] = null;
            return t;
    }

    public int getSize() {
        return size;
    }

    //ArrayList中数据的数组
    private transient Object[] elementData;

    //数组实际容量
    private int size;

    public TbmrArrayLIst(int initialCapacity){
        if (initialCapacity < 0){
            throw new IllegalArgumentException("Illegal Capacity" + initialCapacity);
        }

        //初始化数组容量
        elementData = new Object[initialCapacity];
    }

    private void rangeCheck(int index){
        if (index >= size){
            throw new IndexOutOfBoundsException("数组越界了");

        }
    }


    
}
