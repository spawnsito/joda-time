package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;

import java.util.HashMap;
import java.util.Map;

public class PoolStorage {

    private static Map<Class<? extends BaseSingleFieldPeriod>, BaseSingleFieldPeriodPool> pools = new HashMap<Class<? extends BaseSingleFieldPeriod>, BaseSingleFieldPeriodPool>();

    public static BaseSingleFieldPeriodPool retrieve(Class<? extends BaseSingleFieldPeriod> className) {

        BaseSingleFieldPeriodPool pool = pools.get(className);

        if (pool == null) {
            pool = new BaseSingleFieldPeriodPool(className);
            pools.put(className, pool);
        }

        return pool;
    }
}
