package ru.kata.spring.boot_security.demo.dto;

import javax.persistence.Column;
import javax.validation.constraints.*;

public class UserDTO {
    private Long id;

    //    @NotEmpty(message = "*Name should not be empty")
    private String username;
//    @NotEmpty(message = "*Last name should not be empty")
    private String lastName;
//    @Min(value = 0, message = "*Age is incorrect")
    private int age;
//    @Email(message = "*Enter correctly email (example@examp.org)")
    private String email;
//    @Column(name = "password")
//    @Size(min = 3, message = "Password should be min 4 characters")
    private String password;


    public UserDTO() {
    }

    public UserDTO(String username, String lastName, int age, String email) {
        this.username = username;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
