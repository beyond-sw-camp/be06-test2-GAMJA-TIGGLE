package org.example.springdb.tiggle.user.model.request;

public class SignInRequest {

    private int id;
    private int password;

    public SignInRequest(int id, int password) {
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
