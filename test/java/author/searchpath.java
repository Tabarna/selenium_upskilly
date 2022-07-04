package author;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://infodemo.upskilly.com");
        driver.findElement(By.name("employee_id")).sendKeys("AUTH");
        driver.findElement(By.name("pswd")).sendKeys("11");
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/input[4]")).click();
        String u = driver.getCurrentUrl();
       if (u.equals("https://infodemo.upskilly.com/admin/#reporting/by-course/")) {
        //    System.out.println("Testcase Passed");
           driver.navigate().to("https://infodemo.upskilly.com/admin/#reporting/by-course/");
           driver.findElement(By.xpath("//*[@id=\"learnbee_search\"]/input")).sendKeys("sharepoint");

           // } else {
         //   System.out.println("Testcase Failed");
        }
        //System.out.println(driver.getTitle());
        //  driver.close();
    }}

