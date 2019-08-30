import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyFirstTest {


    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagasatyasuryn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		   	
        String baseUrl = "https://www.wikipedia.org/";
        
        driver.get(baseUrl);
        driver.findElement(By.id("js-link-box-en")).click();
        //driver.findElement(By.name("search")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       driver.findElement(By.xpath("//input[@name='search']")).click();
       driver.findElement(By.xpath("//input[@name='search']")).sendKeys("hcl");
       
       driver.findElement(By.className("searchButton")).click();
       driver.findElement(By.xpath("//*[contains(text(),'Contents')]")).click();
       
       driver.close();
       
       
       
        /*System.setProperty("webdriver.gecko.driver","C:\\Selenium_Standard\\geckodriver-v0.18.0-win64\\geckodriver.exe");
        WebDriver driver1 = new FirefoxDriver();
        driver1.get(baseUrl);
        driver.close();
        WebDriver driver2 = new InternetExplorerDriver();
        driver2.get(baseUrl);*/
        
       
       
    }

}