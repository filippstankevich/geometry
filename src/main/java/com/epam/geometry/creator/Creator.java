package com.epam.geometry.creator;


public interface Creator<T> {
    public T create(String line);
}
