package org.example;

@FunctionalInterface
public interface Action {
    public void perform(Facts facts);
}
