package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service

public class UserService {
    private static List<UserModel> userModel = new ArrayList<>();
    private static Long usercount=0L;
    static{
        userModel.add(new UserModel(++usercount,"Aman Tyagi","tyagi_aman","Muradnagar",8125812889L));
        userModel.add(new UserModel(++usercount,"Anuj","anuj_raj","Ghaziabad",7897612778L));
        userModel.add(new UserModel(++usercount,"Anant","anant_kumar","Modinagar",8765698717L));
        userModel.add(new UserModel(++usercount,"Rajnikant","rajnikant_klan","Ghaziabad",8787879087L));
    }
    public List<UserModel> findAll() {
        return userModel;
    }

    public void addUser(UserModel userModel) {
        userModel.add(userModel);
    }
    public UserModel findById(int id){
        Predicate<? super UserModel> predicate = restaurant -> restaurant.getId() == id;
        UserModel userModel1 = userModel.stream().filter(predicate).findFirst().get();
        return userModel1;
    }

    public void updateUser(int id, UserModel userModel) {
        UserModel userModel1=findById(id);// step 1

        userModel1.setId(userModel.getId());
        userModel1.setName(userModel.getName());
    }
    public void deleteUser(int id){
        Predicate<? super UserModel> predicate = userModel-> userModel.getId()==id;
        userModel.removeIf(predicate);
    }
}
