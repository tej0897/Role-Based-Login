package com.dataloaderportal.DataLoaderPortal.model;

import com.dataloaderportal.DataLoaderPortal.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserModel extends CrudRepository<User, String> {
}
