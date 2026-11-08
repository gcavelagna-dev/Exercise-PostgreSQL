package com.conectando.model;

import com.conectando.shared.model.CostumerEmailIsBlackException;
import com.conectando.shared.model.CostumerNameIsBlankException;

public class Costumer {

    private int id;
    private String name;
    private String email;

    public Costumer(String name, String email){
        setEmail(email);
        setName(name);
    }

    public Costumer(String name, String email, int id){
        this(name, email);
        this.id = id;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "| Email: " + getEmail();
    }

    public void setName(String name){
        if (name == null){
            throw new IllegalArgumentException("Error: Name is null");
        }
        if (name.isBlank()){
            throw new CostumerNameIsBlankException("Error: Costumer name is blank.");
        }
        this.name = name;
    }

    public void setEmail(String email){
        if (email == null){
            throw new IllegalArgumentException("Error: Email is null");
        }
        if (email.isBlank()){
            throw new CostumerEmailIsBlackException("Error: Costumer email is blank.");
        }
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}
