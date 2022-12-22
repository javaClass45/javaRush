package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.*;
import java.util.ArrayList;


public class FakeModel implements Model {
    private ModelData modelData = new ModelData();



    @Override
    public void loadUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("A", 1, 11));
        users.add(new User("B", 2, 12));

        modelData.setUsers(users);
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    public void loadDeletedUsers(){
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }


    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }

}
