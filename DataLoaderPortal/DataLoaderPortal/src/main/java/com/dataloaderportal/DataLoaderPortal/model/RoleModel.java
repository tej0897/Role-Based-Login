package com.dataloaderportal.DataLoaderPortal.model;

import com.dataloaderportal.DataLoaderPortal.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleModel extends CrudRepository<Role, String> {
}
