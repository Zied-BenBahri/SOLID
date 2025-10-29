package com.directi.training.ocp.exercise;

// ...existing code...
// Refactored: remove internal branching and depend on Resource abstraction.

public class ResourceAllocator {
    // New OCP-compliant API
    public int allocate(Resource resource) {
        return resource.allocate();
    }

    public void free(Resource resource, int resourceId) {
        resource.free(resourceId);
    }

    // Backward-compatible overloads using a registry-based factory (no switch
    // here).
    @Deprecated
    public int allocate(ResourceType type) {
        return allocate(ResourceFactory.create(type));
    }

    @Deprecated
    public void free(ResourceType type, int resourceId) {
        free(ResourceFactory.create(type), resourceId);
    }
}