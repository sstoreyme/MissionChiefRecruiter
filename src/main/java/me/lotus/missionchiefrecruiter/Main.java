package me.lotus.missionchiefrecruiter;

import me.lotus.missionchiefrecruiter.actions.LoginForm;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        try {
            LoginForm.loginForm();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
