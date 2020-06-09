package com.tbmr;

interface Tbmr<T>{
    public void add(T t);

    public T get(int index);

    public T remove(int index);

    public int getSize();

}