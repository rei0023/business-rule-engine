package org.example;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {
    private List<Action> actions;
    private Facts facts;

    public BusinessRuleEngine(final Facts facts) {
        actions = new ArrayList<>();
        this.facts = facts;
    }

    public void addAction(final Action action) {
        this.actions.add(action);
    }

    public int countActions() {
        return this.actions.size();
    }

    public void run() {
        this.actions.forEach(action -> action.execute(this.facts));
    }
}