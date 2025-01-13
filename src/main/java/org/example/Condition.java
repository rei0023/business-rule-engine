package org.example;

@FunctionalInterface
public interface Condition {
    /**
     * Evaluate a conditions according to some some provided facts
     * @param facts facts against the condition will be evaluated
     * @return true is the condition holds and false otherwise
     */
    boolean evaluate(Facts facts);
}
