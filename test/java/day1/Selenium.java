package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
     //   WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("http://infodemo.upskilly.com");
        driver.findElement(By.name("employee_id")).sendKeys("ADM1");
        driver.findElement(By.name("pswd")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/input[4]"));
        String u=driver.getCurrentUrl();
        if(u.equals("https://infodemo.upskilly.com/admin/#summary/")){
            System.out.println("Testcase Passed");
        }else {
            System.out.println("Testcase Failed");
        }
    //System.out.println(driver.getTitle());
      //  driver.close();
    }
}
