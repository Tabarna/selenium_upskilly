package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        //  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        // driver.get("https://www.google.com/");
        driver.get("http://infodemo.upskilly.com");
        driver.findElement(By.name("employee_id")).sendKeys("STUD3");
        driver.findElement(By.name("pswd")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/input[4]")).click();
        String u = driver.getCurrentUrl();
        if (u.equals("https://infodemo.upskilly.com/dashboard/#modules/courses/topic=all/")) {

            driver.get("https://infodemo.upskilly.com/dashboard/#modules/courses/topic=all/");
            WebElement r = driver.findElement(By.cssSelector("#learnbee_search > input"));  //#learnbee_search > input
            r.sendKeys("Sharepoint");
            // press ENTER
            r.sendKeys(Keys.RETURN);
        }
    }
}

