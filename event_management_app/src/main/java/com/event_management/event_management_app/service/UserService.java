
package com.event_management.event_management_app.service;

import com.event_management.event_management_app.model.User;

public interface UserService {

	User createUser(User user);

	User editUser(int id);	
}
