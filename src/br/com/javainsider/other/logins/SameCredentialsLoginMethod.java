package br.com.javainsider.other.logins;

public class SameCredentialsLoginMethod implements LoginMethod {

    @Override
    public boolean login(String username, String password) {
        return username.equals(password);
    }
}


