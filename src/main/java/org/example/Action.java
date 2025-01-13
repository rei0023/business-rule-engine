package org.example;

@FunctionalInterface
public interface Action {
    public void execute(Facts facts);
}
