package me.vroegop.dependencyinjection.domain;

import java.util.HashSet;
import java.util.Set;

public class UserRepository {
    public Set<UserRecord> users = new HashSet<>();

    public void createUser(UserRecord user) {
        users.add(user);
    }

    public UserRecord getUser(String name) {
        return users.stream().filter(user -> user.name() == name).findFirst().orElse(new UserRecord("Not", "Found"));
    }

    public void deleteUser(String name) {
        users.removeIf(user -> user.name() == name);
    }

    public Set<UserRecord> getUsers() {
        return users;
    }
}
