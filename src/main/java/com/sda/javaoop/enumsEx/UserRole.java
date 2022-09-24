package com.sda.javaoop.enumsEx;

public enum UserRole {

    ADMIN(0),
    MODERATOR(1),
    USER(2);

    private final int id;

    UserRole(int id) {
        this.id = id;
    }
}
