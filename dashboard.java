package Learning;
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
 
public class dashboard {
 
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://business.whizlabs.com/");
 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/div[2]/div/a")).click();
        Thread.sleep(1000);
 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[1]/input"))
                .sendKeys("deepanamarnath.nagaraj@whizlabs.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/form/div/div[2]/div/input"))
                .sendKeys("Welcome@123");
        Thread.sleep(1000);    
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/form/button")).click();
        Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
//		Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\'content-area\']/div/div[2]/div/div[2]/div/div[1]/a[1]")).click();    
//        Thread.sleep(5000);
//		Actions action1 = new Actions(driver);
//		action1.sendKeys(Keys.ESCAPE).perform();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"content-area\"]/div/div[2]/div/div[2]/div/div[1]/a[2]/div")).click();
//        Thread.sleep(5000);
//		Actions action2 = new Actions(driver);
//		action2.sendKeys(Keys.ESCAPE).perform();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\'content-area\']/div/div[2]/div/div[2]/div/div[1]/a[3]/div")).click();
//        Thread.sleep(5000);
//		Actions action3 = new Actions(driver);
//		action3.sendKeys(Keys.ESCAPE).perform();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"content-area\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/a/div")).click();
//        
    }
}