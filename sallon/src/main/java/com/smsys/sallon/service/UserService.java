
package com.smsys.sallon.service;

import com.smsys.sallon.entity.User;
import java.util.List;

public interface UserService {

    // Get all users
    List<User> getAllUsers();

    // Get user by ID
    User getUser(Long id);

    // Save a new user
    User saveUser(User user);

    // Update existing user
    User updateUser(User user);

    // Delete user by ID
    void deleteUser(Long id);
}
