package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;

public class YearsFactoryRule implements BaseSingleFieldPeriodFactoryRule {
    public BaseSingleFieldPeriod create(int numeral) {
        return new Years(numeral);
    }
}
