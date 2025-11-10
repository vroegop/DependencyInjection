package me.vroegop.dependencyinjection.domain;

import java.util.Set;

public class UserService {
    public void createDummyUser() {
        UserRecord userRecord = new UserRecord("Dummy", "User");
        UserRepository userRepository = new UserRepository();
        userRepository.createUser(userRecord);
    }

    public void deleteDummyUser() {
        UserRepository userRepository = new UserRepository();
        userRepository.deleteUser("Dummy");
    }

    public UserRecord getUser(String name) {
        UserRepository userRepository = new UserRepository();
        return userRepository.getUser(name);
    }

    public Set<UserRecord> getUsers() {
        UserRepository userRepository = new UserRepository();
        return userRepository.getUsers();
    }
}
