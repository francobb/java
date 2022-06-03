package com.example.demo.security;

public enum ApplicationUserPermission {
    WORKER_READ("worker:read"),
    WORKER_WRITE("worker:write"),
    BOSS_WRITE("boss:write"),
    BOSS_READ("boss:read"),
    CEO_READ("ceo:read"),
    CEO_WRITE("ceo:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
