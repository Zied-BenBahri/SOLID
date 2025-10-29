package com.directi.training.ocp.exercise;

import java.util.concurrent.atomic.AtomicInteger;

public class TimeSlotResource implements Resource {
    private static final AtomicInteger COUNTER = new AtomicInteger(1000);

    @Override
    public int allocate() {
        // Time-slot specific allocation logic (simplified)
        return COUNTER.incrementAndGet();
    }

    @Override
    public void free(int resourceId) {
        // Time-slot specific freeing logic (simplified)
    }
}