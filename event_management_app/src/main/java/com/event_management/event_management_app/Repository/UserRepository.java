package com.event_management.event_management_app.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.event_management.event_management_app.model.User;
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
													