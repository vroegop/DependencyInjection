package me.vroegop.dependencyinjection.usingnew;

import me.vroegop.dependencyinjection.domain.UserRecord;
import me.vroegop.dependencyinjection.domain.UserService;

import java.util.Set;

/**
 * Pretend this is a REST API
 */
public class UserAPI {
    UserService userService = new UserService();

    public UserAPI() {

    }

    public void createDummyUser() {
        userService.createDummyUser();
    }

    public void deleteDummyUser() {
        userService.deleteDummyUser();
    }

    public UserRecord getUser(String name) {
        return userService.getUser(name);
    }

    public Set<UserRecord> getUsers() {
        return userService.getUsers();
    }
}
