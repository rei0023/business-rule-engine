package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessRuleEngineTest {
    @Test
    public void shouldHaveNoActionsInitially() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        assertEquals(0, businessRuleEngine.countActions());
    }

    @Test
    public void shouldAddOneAction() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        businessRuleEngine.addAction(() -> {});

        assertEquals(1, businessRuleEngine.countActions());
    }
}