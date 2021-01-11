package me.lotus.missionchiefrecruiter.actions;

import me.lotus.missionchiefrecruiter.data.LoginFormData;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.Scanner;

import static me.lotus.missionchiefrecruiter.Messages.*;

public class LoginForm {

    static String loginurl = LoginFormData.loginformurl;

    public static void loginForm() throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println(username);
        LoginFormData.username = scanner.nextLine();
        System.out.println(password);
        LoginFormData.password = scanner.nextLine();
        scanner.close();
        System.out.println(loggingin);

        Element usernamebox = Jsoup.connect(loginurl).get().getElementById("user_email");
        usernamebox.html(LoginFormData.username);
        Element passwordbox = Jsoup.connect(loginurl).get().getElementById("user_password");
        passwordbox.html(LoginFormData.password);
        Elements authtoken = Jsoup.connect(loginurl).get().select("#new_user > div:nth-child(1) > input[type=hidden]:nth-child(2)");
        System.out.println("Auth token: " + authtoken.val());
        LoginFormData.authenticity = authtoken.val();
    }

}
