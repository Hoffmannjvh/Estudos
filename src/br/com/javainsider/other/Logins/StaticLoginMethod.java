package br.com.javainsider.other.Logins;

public class StaticLoginMethod implements LoginMethod {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";

    private String username;
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public StaticLoginMethod() {
        this(USERNAME, PASSWORD);
    }

    public StaticLoginMethod(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals(username) && password.equals(password);
    }
}


