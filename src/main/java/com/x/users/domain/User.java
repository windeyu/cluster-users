package com.x.users.domain;

import javax.persistence.*;

@Entity
@Table(name="cluster_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String password;

    User() { // required by JPA but hide it for our purpose
    }

    public User(String inUserName) {
        name = inUserName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Id=" + id + " UserName=" + name;
    }
}
