package com.directi.training.ocp.exercise;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class ResourceFactory {
    private static final Map<ResourceType, Supplier<Resource>> REGISTRY = new EnumMap<>(ResourceType.class);

    static {
        // Default registrations
        register(ResourceType.TIME_SLOT, TimeSlotResource::new);
        register(ResourceType.SPACE_SLOT, SpaceSlotResource::new);
    }

    private ResourceFactory() {
    }

    public static void register(ResourceType type, Supplier<Resource> supplier) {
        REGISTRY.put(type, supplier);
    }

    public static Resource create(ResourceType type) {
        Supplier<Resource> supplier = REGISTRY.get(type);
        if (supplier == null) {
            throw new IllegalArgumentException("No Resource registered for type: " + type);
        }
        return supplier.get();
    }
}