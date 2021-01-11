package me.lotus.missionchiefrecruiter.data;

public class LoginFormData {

    private String userName;

    private String password;

    private String authenticty;

    public LoginFormData() {

    }

    public LoginFormData(String userName, String password, String authenticty) {
        this.userName = userName;
        this.password = password;
        this.authenticty = authenticty;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthenticty() {
        return authenticty;
    }

    public void setAuthenticty(String authenticty) {
        this.authenticty = authenticty;
    }
}
