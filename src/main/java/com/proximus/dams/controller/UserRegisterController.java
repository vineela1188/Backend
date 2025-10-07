package com.proximus.dams.controller;

import com.proximus.dams.dto.UserGovernanceDTO;
import com.proximus.dams.model.UserGovernance;
import com.proximus.dams.service.UserGovernanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dams/user")
public class UserRegisterController {

    @Autowired
    private UserGovernanceService userGovernanceService;

    @PostMapping("/register")
    public ResponseEntity<?> registerDamsUser(@Validated @RequestBody UserGovernanceDTO userGovernanceDTO) {
        Optional<UserGovernance> userGovernance = Optional.ofNullable(userGovernanceService.registerDamsUser(userGovernanceDTO));
        return userGovernance.isPresent() ? new ResponseEntity<>(userGovernance, HttpStatus.OK) :  new ResponseEntity<>(userGovernance, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<?> getDamsUser() {
       Optional<List<UserGovernanceDTO>> userGovernanceDTOS = Optional.ofNullable(userGovernanceService.getDamsUser());
        return userGovernanceDTOS.isPresent() ? new ResponseEntity<>(userGovernanceDTOS, HttpStatus.OK) : new ResponseEntity<>(userGovernanceDTOS, HttpStatus.BAD_REQUEST);
    }

}
