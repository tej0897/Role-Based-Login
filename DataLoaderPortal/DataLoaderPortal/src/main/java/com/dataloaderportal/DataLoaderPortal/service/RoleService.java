package com.dataloaderportal.DataLoaderPortal.service;

import com.dataloaderportal.DataLoaderPortal.entity.Role;
import com.dataloaderportal.DataLoaderPortal.model.RoleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleModel roleModel;

    public Role createNewRole(Role role){
        return roleModel.save(role);
    }
}
