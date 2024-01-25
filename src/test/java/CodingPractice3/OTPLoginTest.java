package CodingPractice3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OTPLoginTest {
    public static  void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/otp-login");
        driver.manage().window().maximize();
        WebElement element1 = driver.findElement(By.xpath("//input[@id='email']"));
        element1.sendKeys("practice@expandtesting.com");
        WebElement element2 = driver.findElement(By.xpath("//button[@id='btn-send-otp']"));
        element2.click();
        String expectedtitle ="Test Automation Practice: Working with OTP Verification";
        String pagetitle = driver.getTitle();
        if (expectedtitle.equals(pagetitle)) {
            System.out.println("OTP sent Successfully");

        }else{
            System.out.println("Enter Valid Email");
        }
        WebElement element3=driver.findElement(By.xpath("//input[@id='otp']"));
        element3.sendKeys("214365");
        WebElement element4=driver.findElement(By.xpath("//button[@id='btn-send-verify']"));
        element4.click();
      String ExpectedURl="https://practice.expandtesting.com/secure";
      String currentUrl=driver.getCurrentUrl();
      if(currentUrl.equals(ExpectedURl)){
          System.out.println("Logged in Successfully");
      }else{
          System.out.println("Logged is Failed");
      }
      driver.quit();
    }
    }

