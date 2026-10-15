package org.example.eshopnew.user;

public record UpdateUserRequest(
        String email,
        String name
) {
}
