package net.springsecurityapp.service;

import net.springsecurityapp.model.User;

/**
 * Service class for {@link net.springsecurityapp.model.User}
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);


}
