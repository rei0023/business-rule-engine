package org.example;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {
    List<Action> actions;

    public BusinessRuleEngine() {
        actions = new ArrayList<>();
    }

    public void addAction(final Action action) {
        this.actions.add(action);
    }

    public int countActions() {
        return this.actions.size();
    }

    public void run() {
        throw new UnsupportedOperationException();
    }


}