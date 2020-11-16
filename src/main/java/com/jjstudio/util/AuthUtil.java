package com.jjstudio.util;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

import static com.jjstudio.util.Role.ADMIN;
import static com.jjstudio.util.Role.PAID_USER;
import static com.jjstudio.util.Role.FREE_USER;

public class AuthUtil {

    public static boolean isAdminUser(Collection<? extends GrantedAuthority> authorities) {
        return authorities.stream().anyMatch(r -> r.getAuthority().equals(ADMIN.toString()));
    }

    public static boolean isPaidUser(Collection<? extends GrantedAuthority> authorities) {
        return authorities.stream().anyMatch(r -> r.getAuthority().equals(PAID_USER.toString()));
    }

    public static boolean isFreeUser(Collection<? extends GrantedAuthority> authorities) {
        return authorities.stream().anyMatch(r -> r.getAuthority().equals(FREE_USER.toString()));
    }

}
