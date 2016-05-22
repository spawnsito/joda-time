package org.joda.time;


import org.joda.time.base.BaseSingleFieldPeriod;

import java.util.HashMap;
import java.util.Map;

public class BaseSingleFieldPeriodPool {

    private Class<? extends BaseSingleFieldPeriod> className;
    private Map<Integer, BaseSingleFieldPeriod> objects;
    private BaseSingleFieldPeriodFactory factory = new BaseSingleFieldPeriodFactory();

    public BaseSingleFieldPeriodPool(Class<? extends BaseSingleFieldPeriod> className) {
        this.className = className;
        objects = new HashMap<Integer, BaseSingleFieldPeriod>();
    }

    public BaseSingleFieldPeriod retrieve(int numeral) {
        BaseSingleFieldPeriod result = objects.get(numeral);

        if (result == null) {
            result = create(numeral);
            objects.put(numeral, result);
        }

        return result;
    }

    private BaseSingleFieldPeriod create(int numeral) {
        return factory.create(className, numeral);
    }
}
