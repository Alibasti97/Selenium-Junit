package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMfile {


    public void loginitem(WebDriver driver){

        driver.findElement(By.id("username")).sendKeys("alibasti97");
        driver.findElement(By.id("password")).sendKeys("Basti@000");
        driver.findElement(By.id("login")).click();
//        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
    }

    public void fillform(WebDriver driver){

        Select location = new Select(driver.findElement(By.xpath("//select[@id='location']")));
        location.selectByVisibleText("Sydney");

        Select hotel = new Select(driver.findElement(By.xpath("//select[@id='hotels']")));
        hotel.selectByVisibleText("Hotel Creek");

        Select roomtype = new Select(driver.findElement(By.xpath("//select[@id='room_type']")));
        roomtype.selectByVisibleText("Standard");

        Select noofrooms = new Select(driver.findElement(By.xpath("//select[@id='room_nos']")));
        noofrooms.selectByValue("3");

        driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("01/12/2023");
        driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("03/12/2023");

        Select arp = new Select(driver.findElement(By.xpath("//select[@id='adult_room']")));
        arp.selectByValue("3");

        Select cpr = new Select(driver.findElement(By.xpath("//select[@id='child_room']")));
        cpr.selectByValue("3");

        driver.findElement(By.xpath("//input[@id='Submit']")).click();

        String confirmhotel = driver.findElement(By.xpath("//td[@class='login_title']")).getText();
        if (confirmhotel.contains("Search Hotel")){
            System.out.println("Select Hotel Now");

            driver.findElement(By.id("radiobutton_0")).click();

            driver.findElement(By.xpath("//input[@id='continue']")).click();
        }


    }


}
