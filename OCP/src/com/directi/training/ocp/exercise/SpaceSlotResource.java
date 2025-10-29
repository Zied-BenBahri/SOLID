package com.directi.training.ocp.exercise;

import java.util.concurrent.atomic.AtomicInteger;

public class SpaceSlotResource implements Resource {
    private static final AtomicInteger COUNTER = new AtomicInteger(2000);

    @Override
    public int allocate() {
        // Space-slot specific allocation logic (simplified)
        return COUNTER.incrementAndGet();
    }

    @Override
    public void free(int resourceId) {
        // Space-slot specific freeing logic (simplified)
    }
}