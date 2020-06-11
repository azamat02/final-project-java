package com.gradle;

public final class User implements UserI{
    private String name;
    private String surname;
    private String login;
    private String password;
    private static User instance;

    private User(String name, String surname, String login, String password) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static User getInstance(String name, String surname, String login, String password) {
        if (instance == null) {
            instance = new User(name, surname, login, password);
        }
        return instance;
    }

    @Override
    public String toString(){
        return "User with name:"+this.name+", surname:"+this.surname+", login:"+this.login+", pass:"+this.password;
    }

}
