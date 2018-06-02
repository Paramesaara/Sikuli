package sikulli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Googletest {
@Test
public void login() {
WebDriver wd=new FirefoxDriver();
wd.manage().window().maximize();
wd.get("https://www.google.co.in");
WebElement gmail=wd.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[1]/a"));
gmail.click();
	
}

}
