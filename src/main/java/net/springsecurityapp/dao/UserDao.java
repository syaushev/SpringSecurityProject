package net.springsecurityapp.dao;

import net.springsecurityapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Admin on 06.06.2018.
 */
public interface UserDao extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
