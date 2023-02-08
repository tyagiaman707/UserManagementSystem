package com.example.UserManagementSystem.model;

public class UserModel {
    private Long id;
    private String name;
    private String username;
    private String address;
    private Long phonenumber;
    public UserModel(Long id, String name, String username, String address, Long phonenumber){
        this.id = id;
        this.name=name;
        this.username=username;
        this.address=address;
        this.phonenumber=phonenumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }


    public void add(UserModel userModel) {
    }
}
