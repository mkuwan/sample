package com.mkuwan.sample.application.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonViewModel {
    private String id;

    private String name;

    private Integer age;

    private String address;

    private String phoneNumber;

    private String mailAddress;

    private String description;

    private String createdUser;

    private String createdDate;

    private String updatedUser;

    private String updatedDate;

    public PersonViewMod(String id, String name, Integer age, String address, String phoneNumber, String mailAddress, String description, String createdUser, String createdDate, String updatedUser, String updatedDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.mailAddress = mailAddress;
        this.description = description;
        this.createdUser = createdUser;
        this.createdDate = createdDate;
        this.updatedUser = updatedUser;
        this.updatedDate = updatedDate;
    }

}
