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
        this.rules.put(Minutes.class, new MinutesFactoryRule());
        this.rules.put(Seconds.class, new SecondsFactoryRule());
        this.rules.put(Weeks.class, new WeeksFactoryRule());
        this.rules.put(Hours.class, new HoursFactoryRule());
    }

    public BaseSingleFieldPeriod create(Class className, int numeral) {
        BaseSingleFieldPeriodFactoryRule rule = getRule(className);

        return rule.create(numeral);
    }

    private BaseSingleFieldPeriodFactoryRule getRule(Class className) {
        return this.rules.get(className);
    }
}
