package com.fitflow.api.mentorships.controller;

public class AddTraineeRequest {
    private final String name;
    private final String email;

    public AddTraineeRequest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
