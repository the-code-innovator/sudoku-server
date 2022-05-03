package com.thecodeinnovator.sudokuserver.generic.entity;

public interface GenericEntity <T> {
    void update(T source);
    Long getId();
    T createNewInstance();
}
