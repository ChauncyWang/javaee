package com.chava96.blog.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by hy on 17-8-14.
 */
public class User {
    private int id;
    private String login;
    private String pass;
    private String niceName;
    private String email;
    private String url;
    private LocalDateTime registered;
    private String activationKey;
    private int status;
    private String displayName;

    public User() {
    }

    public User(int id, String login, String pass, String niceName, String email, String url,
                String registered, String actionKey, int status, String displayName) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.niceName = niceName;
        this.email = email;
        this.url = url;
        this.registered = LocalDateTime.parse(registered, DateTimeFormatter.ofPattern("uuuu-MM-d HH:mm:ss"));
        this.activationKey = actionKey;
        this.status = status;
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegistered() {
        return registered.format(DateTimeFormatter.ofPattern("uuuu-MM-d HH:mm:ss"));
    }

    public void setRegistered(String registered) {
        this.registered = LocalDateTime.parse(registered, DateTimeFormatter.ofPattern("uuuu-MM-d HH:mm:ss"));
    }

    public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
