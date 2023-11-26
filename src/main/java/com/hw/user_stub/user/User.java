package com.hw.user_stub.user;

import java.time.LocalDate;

public class User {
    private String login;
    private String password;
    private LocalDate localDate;

    public User(){

    }

      public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, LocalDate localDate){
        this.login = login;
        this.password = password;
        this.localDate = localDate;
    }

    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public LocalDate getLocalDate(){
        return localDate;
    }
    public void setLocalDate(LocalDate localDate){
        this.localDate = localDate;
    }

}
