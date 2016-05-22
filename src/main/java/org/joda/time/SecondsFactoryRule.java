package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;

public class SecondsFactoryRule implements BaseSingleFieldPeriodFactoryRule {
    public BaseSingleFieldPeriod create(int numeral) {
        return new Seconds(numeral);
    }
}
