package com.amit.systemdesign.carrental.managers;


import com.amit.systemdesign.carrental.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class UserManager {
    private List<User> users;

    public UserManager(List<User> users) {
        this.users = users;
    }

    public UserManager() {
        this(new ArrayList<>());
    }

    //CRUD Operations

    public void addUser(User user) {
        this.users.add(user);
    }

    public void deleteUser(User user) {
        this.users.remove(user);
    }

    public void updateUser(String userId, User user) {
        var existingUser = this.users.stream().filter(u -> userId.equals(user.getUserId()))
                .findFirst().orElse(null);
        mapUserToExistingUser(user, existingUser);
    }

    private static void mapUserToExistingUser(User user, User existingUser) {
        if (Objects.nonNull(user) && Objects.nonNull(existingUser)) {
            existingUser.setUsername(user.getUsername());
            existingUser.setEmail(user.getEmail());
            existingUser.setDrivingLicense(user.getDrivingLicense());
        }
    }
}
