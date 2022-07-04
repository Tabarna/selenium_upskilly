package student;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student_login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("http://infodemo.upskilly.com");
        driver.findElement(By.name("employee_id")).sendKeys("STUD3");
        driver.findElement(By.name("pswd")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/input[4]")).click();
        String u = driver.getCurrentUrl();



        if (u.equals("https://infodemo.upskilly.com/dashboard/#modules/courses/topic=all/")) {
            System.out.println("Testcase Passed");
            driver.get("https://infodemo.upskilly.com/dashboard/#modules/courses/topic=all/");
            WebElement r = driver.findElement(By.className(" fc4 full"));
            r.sendKeys("Sharepoint");
            // press ENTER
            r.sendKeys(Keys.RETURN);

        }
//        else {
//            System.out.println("Testcase Failed");
//        }

    }
}
