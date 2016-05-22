package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;

public class DaysFactoryRule implements BaseSingleFieldPeriodFactoryRule {
    public BaseSingleFieldPeriod create(int numeral) {
        return new Days(numeral);
    }
}
