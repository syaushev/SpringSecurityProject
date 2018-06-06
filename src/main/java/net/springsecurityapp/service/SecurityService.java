package net.springsecurityapp.service;

/**
 * Created by Admin on 06.06.2018.
 */
public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username);
}
