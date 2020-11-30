package com.deepak;

public class Welcome {
    User user;
    
    public Welcome(User user) {
        this.user = user;
    }
    
    public String greetUser(String name) {
        
        return "Welcome, " + user.getUser(name);
    }
}
