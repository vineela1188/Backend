package com.proximus.dams.util;

import com.proximus.dams.dto.UserGovernanceDTO;
import com.proximus.dams.model.UserGovernance;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserRegisterUtil
{
    public List<UserGovernanceDTO> setUserDetails(List<UserGovernance> userGovernances)
    {
       return userGovernances.stream().map(userGovernance -> {
            UserGovernanceDTO userGovernanceDTO = new UserGovernanceDTO();
            userGovernanceDTO.setUserName(userGovernance.getUserName());
            userGovernanceDTO.setEmailAddress(userGovernance.getEmailAddress());
            userGovernanceDTO.setFullName(userGovernance.getFullName());
            userGovernanceDTO.setGroups(userGovernance.getGroups());
            userGovernanceDTO.setRole(userGovernance.getRole());
            userGovernanceDTO.setStatus(userGovernance.getStatus());
            return userGovernanceDTO;
        }).toList();

    }
}
