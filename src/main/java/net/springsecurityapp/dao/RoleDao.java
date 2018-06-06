package net.springsecurityapp.dao;

import net.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Admin on 06.06.2018.
 */
public interface RoleDao extends JpaRepository<Role,Long>{
}
