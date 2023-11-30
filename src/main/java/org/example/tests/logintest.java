package org.example.tests;

import jdk.jfr.Description;
import org.example.POMfile;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logintest {
   static WebDriver driver;
    POMfile logintest;

   @BeforeAll
   public static void start() {
       System.setProperty("webdriver.gecko.driver","\\D:\\geckodriver-v0.33.0-win64\\geckodriver.exe\\");
       driver = new FirefoxDriver();
       driver.manage().window().maximize();
   }
   @Test
   public void urlopen(){
       driver.get("https://adactinhotelapp.com/");
   }
    @Test

    public void login(){

        logintest = new POMfile();
        logintest.loginitem(driver);
    }

    @Test

    public void fillingform(){

       POMfile dropdown = new POMfile();
       dropdown.fillform(driver);

    }

//    @Test
//    public void selectinghotel(){
//
//       POMfile pickhotel = new POMfile();
//       pickhotel.selectHotel(driver);
//
//    }
    @AfterAll
    public static void quitscr() {
        if (driver != null) {
            driver.quit();
        }
    }

}
