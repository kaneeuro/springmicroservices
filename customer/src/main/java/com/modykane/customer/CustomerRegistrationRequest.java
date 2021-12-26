package com.modykane.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
