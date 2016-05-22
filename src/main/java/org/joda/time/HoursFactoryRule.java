package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;

public class HoursFactoryRule implements BaseSingleFieldPeriodFactoryRule {
    public BaseSingleFieldPeriod create(int numeral) {
        return new Hours(numeral);
    }
}
