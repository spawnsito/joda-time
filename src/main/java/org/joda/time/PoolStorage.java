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
            add(className, pool);
        }

        return pool;
    }

    private static void add(Class<? extends BaseSingleFieldPeriod> className, BaseSingleFieldPeriodPool pool) {
        pools.put(className, pool);
    }
}
