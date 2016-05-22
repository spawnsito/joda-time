package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;

import java.util.HashMap;
import java.util.Map;


public class BaseSingleFieldPeriodFactory {

    private Map<Class<? extends BaseSingleFieldPeriod>, BaseSingleFieldPeriodFactoryRule> rules =
            new HashMap<Class<? extends BaseSingleFieldPeriod>, BaseSingleFieldPeriodFactoryRule>();

    public BaseSingleFieldPeriodFactory() {
        this.rules.put(Years.class, new YearsFactoryRule());
        this.rules.put(Days.class, new DaysFactoryRule());
        this.rules.put(Months.class, new MonthsFactoryRule());
    }

    public BaseSingleFieldPeriod create(Class className, int numeral) {
        BaseSingleFieldPeriodFactoryRule rule = this.rules.get(className);

        return rule.create(numeral);
    }
}
