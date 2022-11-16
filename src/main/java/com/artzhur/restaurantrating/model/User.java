package com.artzhur.restaurantrating.model;

import java.util.Date;
import java.util.Set;

public class User {

    private String name;
    private String email;
    private String password;
    private boolean enabled = true;
    private Date registered = new Date();
    private Set<Role> roles;


}
