package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement userEmailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        WebElement currentAddrInput = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement permamentAddrInput = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        userNameInput.sendKeys("my login");
        userEmailInput.sendKeys("1@ff.ru");
        currentAddrInput.sendKeys("gg");
        permamentAddrInput.sendKeys("ss");
        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        buttonSubmit.click();
        String name;
        WebElement userNameOutput = driver.findElement(By.xpath("//p[@id='name']"));
        WebElement userEmailOutput = driver.findElement(By.xpath("//p[@id='email']"));
        WebElement userAddrOutput = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        WebElement userPermOutput = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        name = userNameOutput.getText();
        String email;
        String Addr;
        String Perm;
        email = userEmailOutput.getText();
        Addr = userAddrOutput.getText();
        Perm = userPermOutput.getText();
        System.out.println(name + " " + email + " " + Addr + " " + Perm + " ");

    }
}