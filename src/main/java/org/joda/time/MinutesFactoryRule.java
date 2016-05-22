package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;

public class MinutesFactoryRule implements BaseSingleFieldPeriodFactoryRule {
    public BaseSingleFieldPeriod create(int numeral) {
        return new Minutes(numeral);
    }
}
