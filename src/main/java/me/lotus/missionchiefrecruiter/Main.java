package me.lotus.missionchiefrecruiter;

import me.lotus.missionchiefrecruiter.actions.LoginForm;
import me.lotus.missionchiefrecruiter.data.LoginFormData;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        //LoginFormData data = main.buildLoginFormData();

        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/Users/scottstorey/Desktop/My Plugins/Java Projects/selenium-java-3.141.59r/client-combined-3.141.59-sources.jar");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");

        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();

        Thread.sleep(5000);  // Let the user actually see something!
       
        driver.quit();
    }
}



