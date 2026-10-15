package org.example.eshopnew.user;

public record CreateUserRequest(
        String email,
        String name
) {
}
