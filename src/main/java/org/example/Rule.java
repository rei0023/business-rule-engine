package org.example;

@FunctionalInterface
public interface Rule {
    void perform(Facts facts);
}
