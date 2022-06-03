package com.example.demo.security;

import static com.example.demo.security.ApplicationUserPermission.BOSS_READ;
import static com.example.demo.security.ApplicationUserPermission.BOSS_WRITE;
import static com.example.demo.security.ApplicationUserPermission.CEO_READ;
import static com.example.demo.security.ApplicationUserPermission.CEO_WRITE;
import static com.example.demo.security.ApplicationUserPermission.WORKER_READ;
import static com.example.demo.security.ApplicationUserPermission.WORKER_WRITE;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum ApplicationUserRole {
    BOSS(Sets.newHashSet(BOSS_READ, BOSS_WRITE)),
    WORKER(Sets.newHashSet(WORKER_WRITE, WORKER_READ)),
    CEO(Sets.newHashSet(CEO_READ, CEO_WRITE, WORKER_WRITE, WORKER_READ, BOSS_READ, BOSS_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorites(){
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream().map(p -> new SimpleGrantedAuthority(p.getPermission())).collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
