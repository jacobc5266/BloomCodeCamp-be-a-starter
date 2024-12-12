package com.hcc.api.controllers;

import com.hcc.api.responses.AssignmentsResponse;
import com.hcc.entities.User;
import com.hcc.services.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {

    @Autowired
    public Api(UserDetailServiceImpl userDetailService) {

    }

    @GetMapping(value = "/auth/login")
    public ResponseEntity<?> login() {
        return null;
    }

    @GetMapping(value = "/auth/validate")
    public ResponseEntity<?> validateToken() {
        return null;
    }

    @GetMapping(value = "/assignments")
    public AssignmentsResponse getAssignmentsByUser(User user) {
        AssignmentsResponse response = new AssignmentsResponse();

        return response;

    }
}
