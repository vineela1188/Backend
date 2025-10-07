package com.proximus.dams.service;

import com.proximus.dams.dto.UserGovernanceDTO;
import com.proximus.dams.model.UserGovernance;
import com.proximus.dams.repository.UserGovernanceRepo;
import com.proximus.dams.util.UserRegisterUtil;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGovernanceService {

    @Autowired
    private UserGovernanceRepo userGovernanceRepo;

    @Autowired
    private UserRegisterUtil userRegisterUtil;

    public UserGovernance registerDamsUser(UserGovernanceDTO userGovernanceDTO) {
        UserGovernance userGovernance = new UserGovernance();
        userGovernance.setUserName(userGovernanceDTO.getUserName());
        userGovernance.setEmailAddress(userGovernanceDTO.getEmailAddress());
        userGovernance.setFullName(userGovernanceDTO.getFullName());
        userGovernance.setGroups(userGovernanceDTO.getGroups());
        userGovernance.setRole(userGovernanceDTO.getRole());
        userGovernance.setStatus(userGovernanceDTO.getStatus());
       return userGovernanceRepo.save(userGovernance);
    }

    public List<UserGovernanceDTO> getDamsUser() {
        List<UserGovernance> userGovernances = userGovernanceRepo.findAll();
       return userRegisterUtil.setUserDetails(userGovernances);
    }
}
