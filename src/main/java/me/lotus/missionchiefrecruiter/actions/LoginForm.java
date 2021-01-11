package me.lotus.missionchiefrecruiter.actions;

import me.lotus.missionchiefrecruiter.constants.URLs;
import me.lotus.missionchiefrecruiter.data.LoginFormData;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

import static me.lotus.missionchiefrecruiter.constants.Messages.*;

public class LoginForm {

    private static final String LOGIN_URL = URLs.LOGIN_FORM;

    public LoginFormData loginForm() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println(USERNAME_PROMPT);
        String username = scanner.nextLine();

        System.out.println(PASSWORD_PROMPT);
        String password = scanner.nextLine();

        scanner.close();
        System.out.println(LOGGING_IN_MESSAGE);

        return getLoginDataFromMissionChief(username, password);
    }

    private LoginFormData getLoginDataFromMissionChief(String username, String password) throws IOException {
        Connection connection = Jsoup.connect(LOGIN_URL);
        Document document = connection.get();

        Element usernameElement = document.getElementById("user_email");
        usernameElement.html(username);

        Element passwordElement = document.getElementById("user_password");
        passwordElement.html(password);

        Elements authToken = document.select("#new_user > div:nth-child(1) > input[type=hidden]:nth-child(2)");
        System.out.println("Auth token: " + authToken.val());
        Elements loginbtn = document.select("#new_user > input");

        String authenticity = authToken.val();

        return new LoginFormData(username, password, authenticity);
    }

}
