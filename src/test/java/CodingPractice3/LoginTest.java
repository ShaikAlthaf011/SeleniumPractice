package CodingPractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    public static  void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/login");
        driver.manage().window().maximize();
     WebElement element1=driver.findElement(By.xpath("//input[@id='username']"));
    element1.sendKeys("practice");
    System.out.println("Username entered");
    WebElement element2=driver.findElement(By.xpath("//input[@id='password']"));
    element2.sendKeys("SuperSecretPassword!");
    System.out.println("Entered Password");
    WebElement element3= driver.findElement(By.xpath("//button[@type='submit']"));
    element3.click();
    System.out.println("Login button clicked");

    String Expectedurl="https://practice.expandtesting.com/secure";

    String currenturl=driver.getCurrentUrl();

    if(currenturl.equals(Expectedurl)){
        System.out.println("Logged is Successfully");

    }else{
        System.out.println("Logged is Failed");
    }
    driver.quit();
    }
}
