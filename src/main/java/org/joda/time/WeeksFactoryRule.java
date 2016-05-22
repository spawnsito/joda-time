package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;

public class WeeksFactoryRule implements BaseSingleFieldPeriodFactoryRule {
    public BaseSingleFieldPeriod create(int numeral) {
        return new Weeks(numeral);
    }
}
