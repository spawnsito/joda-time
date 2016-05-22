package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;

public class MonthsFactoryRule implements BaseSingleFieldPeriodFactoryRule {
    public BaseSingleFieldPeriod create(int numeral) {
        return new Months(numeral);
    }
}
