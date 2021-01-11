package me.lotus.missionchiefrecruiter;

import me.lotus.missionchiefrecruiter.actions.LoginForm;
import me.lotus.missionchiefrecruiter.data.LoginFormData;

import java.io.IOException;

public class Main {

    public Main() {
    }

    public LoginFormData buildLoginFormData() {
        LoginForm loginForm = new LoginForm();
        try {
            return loginForm.loginForm();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Main main = new Main();
        LoginFormData data = main.buildLoginFormData();
    }

}
